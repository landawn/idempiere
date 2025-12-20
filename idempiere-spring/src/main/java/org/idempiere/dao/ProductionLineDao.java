package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.ProductionLine;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface ProductionLineDao extends CrudDao<ProductionLine, Integer, SQLBuilder.PSC, ProductionLineDao> {

    @Query("SELECT * FROM M_ProductionLine WHERE M_Production_ID = :productionId ORDER BY Line")
    List<ProductionLine> findByProduction(Integer productionId);

    @Query("SELECT * FROM M_ProductionLine WHERE M_Product_ID = :productId")
    List<ProductionLine> findByProduct(Integer productId);

    @Query("SELECT * FROM M_ProductionLine WHERE M_ProductionPlan_ID = :productionPlanId ORDER BY Line")
    List<ProductionLine> findByProductionPlan(Integer productionPlanId);
}
