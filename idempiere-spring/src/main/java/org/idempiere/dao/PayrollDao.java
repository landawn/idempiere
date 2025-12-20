package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.Payroll;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Payroll entity operations.
 */
@Cache(capacity = 200, evictDelay = 3000)
public interface PayrollDao extends CrudDao<Payroll, Integer, SQLBuilder.PSC, PayrollDao> {

    @Query("SELECT * FROM HR_Payroll WHERE AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<Payroll> findByClient(int clientId);

    @Query("SELECT * FROM HR_Payroll WHERE Value = :value AND AD_Client_ID = :clientId")
    Payroll findByValue(String value, int clientId);
}
