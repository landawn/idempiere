package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.HREmployee;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

@Cache(capacity = 100, evictDelay = 3000)
public interface HREmployeeDao extends CrudDao<HREmployee, Integer, SQLBuilder.NSC, HREmployeeDao> {

    @Query("SELECT * FROM HR_Employee WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y'")
    Optional<HREmployee> findByBPartner(int bpartnerId);

    @Query("SELECT * FROM HR_Employee WHERE Code = :code AND IsActive = 'Y'")
    Optional<HREmployee> findByCode(String code);

    @Query("SELECT * FROM HR_Employee WHERE IsActive = 'Y' ORDER BY Name")
    List<HREmployee> findAllActive();

    @Query("SELECT * FROM HR_Employee WHERE HR_Department_ID = :departmentId AND IsActive = 'Y' ORDER BY Name")
    List<HREmployee> findByDepartment(int departmentId);

    @Query("SELECT * FROM HR_Employee WHERE HR_Payroll_ID = :payrollId AND IsActive = 'Y' ORDER BY Name")
    List<HREmployee> findByPayroll(int payrollId);

    @Query("SELECT * FROM HR_Employee WHERE C_Job_ID = :jobId AND IsActive = 'Y' ORDER BY Name")
    List<HREmployee> findByJob(int jobId);
}
