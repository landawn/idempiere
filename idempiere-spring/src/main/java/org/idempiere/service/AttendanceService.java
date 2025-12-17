package org.idempiere.service;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.AttendanceDao;
import org.idempiere.model.Attendance;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for Attendance Management operations.
 */
@Service
@Transactional
public class AttendanceService {

    private final AttendanceDao attendanceDao;

    public AttendanceService(AttendanceDao attendanceDao) {
        this.attendanceDao = attendanceDao;
    }

    /**
     * Get attendance by ID.
     */
    public Optional<Attendance> getById(int attendanceId) {
        return attendanceDao.findById(attendanceId);
    }

    /**
     * Get attendance for an employee on a specific date.
     */
    public Optional<Attendance> getByEmployeeAndDate(int employeeId, LocalDate date) {
        return attendanceDao.findByEmployeeAndDate(employeeId, date);
    }

    /**
     * Get attendance records for an employee within a date range.
     */
    public List<Attendance> getByEmployeeAndDateRange(int employeeId, LocalDate startDate, LocalDate endDate) {
        return attendanceDao.findByEmployeeAndDateRange(employeeId, startDate, endDate);
    }

    /**
     * Get attendance for an organization on a specific date.
     */
    public List<Attendance> getByDateAndOrg(LocalDate date, int orgId) {
        return attendanceDao.findByDateAndOrg(date, orgId);
    }

    /**
     * Record check-in for an employee.
     */
    public Attendance checkIn(int employeeId, int workShiftId, int orgId) {
        LocalDate today = LocalDate.now();
        Optional<Attendance> existing = attendanceDao.findByEmployeeAndDate(employeeId, today);

        if (existing.isPresent()) {
            // Already checked in
            return existing.get();
        }

        Attendance attendance = Attendance.builder()
                .hrEmployeeId(employeeId)
                .hrWorkShiftId(workShiftId)
                .adOrgId(orgId)
                .attendanceDate(today)
                .checkInTime(LocalDateTime.now())
                .attendanceStatus("P") // Present
                .processed("N")
                .build();

        attendanceDao.insert(attendance);
        return attendance;
    }

    /**
     * Record check-out for an employee.
     */
    public Attendance checkOut(int employeeId) {
        LocalDate today = LocalDate.now();
        Optional<Attendance> optAttendance = attendanceDao.findByEmployeeAndDate(employeeId, today);

        if (optAttendance.isPresent()) {
            Attendance attendance = optAttendance.get();
            LocalDateTime checkOutTime = LocalDateTime.now();
            attendance.setCheckOutTime(checkOutTime);

            // Calculate worked hours
            if (attendance.getCheckInTime() != null) {
                Duration duration = Duration.between(attendance.getCheckInTime(), checkOutTime);
                BigDecimal workedHours = BigDecimal.valueOf(duration.toMinutes())
                        .divide(BigDecimal.valueOf(60), 2, java.math.RoundingMode.HALF_UP);
                attendance.setWorkedHours(workedHours);
            }

            attendanceDao.update(attendance);
            return attendance;
        }
        return null;
    }

    /**
     * Mark employee as absent.
     */
    public Attendance markAbsent(int employeeId, LocalDate date, int orgId, String remarks) {
        Optional<Attendance> existing = attendanceDao.findByEmployeeAndDate(employeeId, date);

        if (existing.isPresent()) {
            Attendance attendance = existing.get();
            attendance.setAttendanceStatus("A"); // Absent
            attendance.setRemarks(remarks);
            attendanceDao.update(attendance);
            return attendance;
        }

        Attendance attendance = Attendance.builder()
                .hrEmployeeId(employeeId)
                .adOrgId(orgId)
                .attendanceDate(date)
                .attendanceStatus("A") // Absent
                .remarks(remarks)
                .processed("N")
                .build();

        attendanceDao.insert(attendance);
        return attendance;
    }

    /**
     * Get absent days count for an employee in a date range.
     */
    public int getAbsentDaysCount(int employeeId, LocalDate startDate, LocalDate endDate) {
        List<Attendance> absences = attendanceDao.findAbsentByEmployeeAndDateRange(employeeId, startDate, endDate);
        return absences.size();
    }

    /**
     * Process attendance records (mark as processed).
     */
    public void processAttendance(int attendanceId) {
        Optional<Attendance> optAttendance = attendanceDao.findById(attendanceId);
        if (optAttendance.isPresent()) {
            Attendance attendance = optAttendance.get();
            attendance.setProcessed("Y");
            attendanceDao.update(attendance);
        }
    }
}
