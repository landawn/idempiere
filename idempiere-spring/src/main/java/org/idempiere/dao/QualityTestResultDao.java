package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.QualityTestResult;

/**
 * DAO interface for QualityTestResult entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface QualityTestResultDao extends CrudDao<QualityTestResult, Integer, SQLBuilder.PSC, QualityTestResultDao> {

    /**
     * Find quality test results by quality test ID
     */
    @Query("SELECT * FROM M_QualityTestResult WHERE M_QualityTest_ID = :qualityTestId AND IsActive = 'Y' ORDER BY Created DESC")
    List<QualityTestResult> findByQualityTestId(Integer qualityTestId);

    /**
     * Find quality test results by attribute set instance ID
     */
    @Query("SELECT * FROM M_QualityTestResult WHERE M_AttributeSetInstance_ID = :attributeSetInstanceId AND IsActive = 'Y' ORDER BY Created DESC")
    List<QualityTestResult> findByAttributeSetInstanceId(Integer attributeSetInstanceId);

    /**
     * Find quality test results by product ID
     */
    @Query("SELECT * FROM M_QualityTestResult WHERE M_Product_ID = :productId AND IsActive = 'Y' ORDER BY Created DESC")
    List<QualityTestResult> findByProductId(Integer productId);

    /**
     * Find passed quality test results
     */
    @Query("SELECT * FROM M_QualityTestResult WHERE IsQualityPassed = 'Y' AND IsActive = 'Y' ORDER BY Created DESC")
    List<QualityTestResult> findAllPassed();

    /**
     * Find failed quality test results
     */
    @Query("SELECT * FROM M_QualityTestResult WHERE IsQualityPassed = 'N' AND IsActive = 'Y' ORDER BY Created DESC")
    List<QualityTestResult> findAllFailed();

    /**
     * Find quality test results by lot ID
     */
    @Query("SELECT * FROM M_QualityTestResult WHERE M_Lot_ID = :lotId AND IsActive = 'Y' ORDER BY Created DESC")
    List<QualityTestResult> findByLotId(Integer lotId);
}
