package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.TimeOffRequest;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Time Off Request entity operations.
 */
@Cache(capacity = 500, evictDelay = 3000)
public interface TimeOffRequestDao extends CrudDao<TimeOffRequest, Integer, SQLBuilder.PSC, TimeOffRequestDao> {

    @Query("SELECT * FROM HR_LeaveRequest WHERE HR_Employee_ID = :employeeId ORDER BY DateRequested DESC")
    List<TimeOffRequest> findByEmployee(int employeeId);

    @Query("SELECT * FROM HR_LeaveRequest WHERE HR_Employee_ID = :employeeId AND Status = :status ORDER BY DateRequested DESC")
    List<TimeOffRequest> findByEmployeeAndStatus(int employeeId, String status);

    @Query("SELECT * FROM HR_LeaveRequest WHERE Status = 'P' AND AD_Org_ID = :orgId ORDER BY DateRequested")
    List<TimeOffRequest> findPendingByOrg(int orgId);

    @Query("SELECT * FROM HR_LeaveRequest WHERE ApprovedBy = :approverId AND Status = 'P' ORDER BY DateRequested")
    List<TimeOffRequest> findPendingForApprover(int approverId);

    @Query("SELECT * FROM HR_LeaveRequest WHERE HR_LeaveType_ID = :leaveTypeId AND HR_Employee_ID = :employeeId")
    List<TimeOffRequest> findByTypeAndEmployee(int leaveTypeId, int employeeId);
}
