package org.idempiere.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.TimeOffRequestDao;
import org.idempiere.model.TimeOffRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for Time Off / Leave Management operations.
 */
@Service
@Transactional
public class TimeOffService {

    private final TimeOffRequestDao timeOffRequestDao;

    public TimeOffService(TimeOffRequestDao timeOffRequestDao) {
        this.timeOffRequestDao = timeOffRequestDao;
    }

    /**
     * Get time off request by ID.
     */
    public Optional<TimeOffRequest> getById(int requestId) {
        try { return Optional.ofNullable(timeOffRequestDao.gett(requestId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    /**
     * Get all time off requests for an employee.
     */
    public List<TimeOffRequest> getByEmployee(int employeeId) {
        return timeOffRequestDao.findByEmployee(employeeId);
    }

    /**
     * Get time off requests by status for an employee.
     */
    public List<TimeOffRequest> getByEmployeeAndStatus(int employeeId, String status) {
        return timeOffRequestDao.findByEmployeeAndStatus(employeeId, status);
    }

    /**
     * Get pending requests for an organization.
     */
    public List<TimeOffRequest> getPendingByOrg(int orgId) {
        return timeOffRequestDao.findPendingByOrg(orgId);
    }

    /**
     * Get pending requests for an approver.
     */
    public List<TimeOffRequest> getPendingForApprover(int approverId) {
        return timeOffRequestDao.findPendingForApprover(approverId);
    }

    /**
     * Submit a new time off request.
     */
    public TimeOffRequest submitRequest(TimeOffRequest request) {
        // Calculate days
        if (request.getStartDate() != null && request.getEndDate() != null) {
            long days = ChronoUnit.DAYS.between(request.getStartDate(), request.getEndDate()) + 1;
            request.setDays(BigDecimal.valueOf(days));
        }

        request.setDateRequested(LocalDateTime.now());
        request.setStatus("P"); // Pending
        request.setProcessed("N");

        timeOffRequestDao.insert(request);
        return request;
    }

    /**
     * Approve a time off request.
     */
    public TimeOffRequest approveRequest(int requestId, int approverId, String comments) {
        Optional<TimeOffRequest> optRequest = Optional.ofNullable(timeOffRequestDao.gett(requestId));
        if (optRequest.isPresent()) {
            TimeOffRequest request = optRequest.get();
            request.setStatus("A"); // Approved
            request.setApprovedBy(approverId);
            request.setDateApproved(LocalDateTime.now());
            if (comments != null) {
                request.setComments(comments);
            }
            timeOffRequestDao.update(request);
            return request;
        }
        return null;
    }

    /**
     * Reject a time off request.
     */
    public TimeOffRequest rejectRequest(int requestId, int approverId, String comments) {
        Optional<TimeOffRequest> optRequest = Optional.ofNullable(timeOffRequestDao.gett(requestId));
        if (optRequest.isPresent()) {
            TimeOffRequest request = optRequest.get();
            request.setStatus("R"); // Rejected
            request.setApprovedBy(approverId);
            request.setDateApproved(LocalDateTime.now());
            if (comments != null) {
                request.setComments(comments);
            }
            timeOffRequestDao.update(request);
            return request;
        }
        return null;
    }

    /**
     * Cancel a time off request.
     */
    public TimeOffRequest cancelRequest(int requestId) {
        Optional<TimeOffRequest> optRequest = Optional.ofNullable(timeOffRequestDao.gett(requestId));
        if (optRequest.isPresent()) {
            TimeOffRequest request = optRequest.get();
            if ("P".equals(request.getStatus())) { // Can only cancel pending requests
                request.setStatus("C"); // Cancelled
                timeOffRequestDao.update(request);
                return request;
            }
        }
        return null;
    }

    /**
     * Process a time off request (mark as processed after payroll).
     */
    public void processRequest(int requestId) {
        Optional<TimeOffRequest> optRequest = Optional.ofNullable(timeOffRequestDao.gett(requestId));
        if (optRequest.isPresent()) {
            TimeOffRequest request = optRequest.get();
            request.setProcessed("Y");
            timeOffRequestDao.update(request);
        }
    }

    /**
     * Get total days off for an employee by leave type.
     */
    public BigDecimal getTotalDaysOff(int employeeId, int leaveTypeId) {
        List<TimeOffRequest> requests = timeOffRequestDao.findByTypeAndEmployee(leaveTypeId, employeeId);
        return requests.stream()
                .filter(r -> "A".equals(r.getStatus())) // Only approved
                .map(TimeOffRequest::getDays)
                .filter(d -> d != null)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
