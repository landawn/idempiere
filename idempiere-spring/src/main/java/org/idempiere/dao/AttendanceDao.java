package org.idempiere.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.idempiere.model.Attendance;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Attendance entity operations.
 */
@Dao(cache = @Cache(capacity = 500, evictDelay = 3000))
public interface AttendanceDao extends CrudDao<Attendance, Integer, SQLBuilder.NSC, AttendanceDao> {

    @Select("SELECT * FROM HR_Attendance WHERE HR_Employee_ID = :employeeId AND AttendanceDate = :date")
    Optional<Attendance> findByEmployeeAndDate(int employeeId, LocalDate date);

    @Select("SELECT * FROM HR_Attendance WHERE HR_Employee_ID = :employeeId AND AttendanceDate BETWEEN :startDate AND :endDate ORDER BY AttendanceDate")
    List<Attendance> findByEmployeeAndDateRange(int employeeId, LocalDate startDate, LocalDate endDate);

    @Select("SELECT * FROM HR_Attendance WHERE AttendanceDate = :date AND AD_Org_ID = :orgId ORDER BY HR_Employee_ID")
    List<Attendance> findByDateAndOrg(LocalDate date, int orgId);

    @Select("SELECT * FROM HR_Attendance WHERE HR_Employee_ID = :employeeId AND AttendanceStatus = 'A' AND AttendanceDate BETWEEN :startDate AND :endDate")
    List<Attendance> findAbsentByEmployeeAndDateRange(int employeeId, LocalDate startDate, LocalDate endDate);
}
