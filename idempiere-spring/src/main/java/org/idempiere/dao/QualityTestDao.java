package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.QualityTest;
import org.idempiere.model.QualityTestResult;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Quality Test entity operations.
 */
@Dao(cache = @Cache(capacity = 200, evictDelay = 3000))
public interface QualityTestDao extends CrudDao<QualityTest, Integer, SQLBuilder.NSC, QualityTestDao> {

    @Select("SELECT * FROM M_QualityTest WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY SeqNo")
    List<QualityTest> findByClient(int clientId);

    @Select("SELECT * FROM M_QualityTestResult WHERE M_QualityTest_ID = :testId ORDER BY M_QualityTestResult_ID")
    List<QualityTestResult> findResultsByTest(int testId);

    @Select("SELECT * FROM M_QualityTestResult WHERE M_AttributeSetInstance_ID = :asiId")
    List<QualityTestResult> findResultsByASI(int asiId);

    @Select("SELECT * FROM M_QualityTestResult WHERE M_AttributeSetInstance_ID = :asiId AND IsQCPass = 'N'")
    List<QualityTestResult> findFailedResultsByASI(int asiId);
}
