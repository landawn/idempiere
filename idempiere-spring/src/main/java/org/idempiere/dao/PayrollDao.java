package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.Payroll;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Dao.Cache.CacheMode;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Payroll entity operations.
 */
@Dao(cache = @Cache(capacity = 200, evictDelay = 3000))
public interface PayrollDao extends CrudDao<Payroll, Integer, SQLBuilder.NSC, PayrollDao> {

    @Select("SELECT * FROM HR_Payroll WHERE AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<Payroll> findByClient(int clientId);

    @Select("SELECT * FROM HR_Payroll WHERE Value = :value AND AD_Client_ID = :clientId")
    Payroll findByValue(String value, int clientId);
}
