package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.CommissionLine;

/**
 * DAO interface for CommissionLine entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface CommissionLineDao extends CrudDao<CommissionLine, Integer, SQLBuilder.PSC, CommissionLineDao> {

    /**
     * Find all commission lines for a commission
     */
    @Query("SELECT * FROM C_CommissionLine WHERE C_Commission_ID = :commissionId AND IsActive = 'Y' ORDER BY Line")
    List<CommissionLine> findByCommission(Integer commissionId);

    /**
     * Find commission lines by product
     */
    @Query("SELECT * FROM C_CommissionLine WHERE M_Product_ID = :productId AND IsActive = 'Y' ORDER BY Line")
    List<CommissionLine> findByProduct(Integer productId);

    /**
     * Find commission lines by product category
     */
    @Query("SELECT * FROM C_CommissionLine WHERE M_Product_Category_ID = :categoryId AND IsActive = 'Y' ORDER BY Line")
    List<CommissionLine> findByProductCategory(Integer categoryId);

    /**
     * Find commission lines by business partner
     */
    @Query("SELECT * FROM C_CommissionLine WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y' ORDER BY Line")
    List<CommissionLine> findByBPartner(Integer bpartnerId);

    /**
     * Find commission lines by sales region
     */
    @Query("SELECT * FROM C_CommissionLine WHERE C_SalesRegion_ID = :salesRegionId AND IsActive = 'Y' ORDER BY Line")
    List<CommissionLine> findBySalesRegion(Integer salesRegionId);
}
