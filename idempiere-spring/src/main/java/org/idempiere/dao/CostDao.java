package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Cost;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Cost entity operations.
 */
@Dao(cache = @Cache(capacity = 1000, evictDelay = 3000))
public interface CostDao extends CrudDao<Cost, Integer, SQLBuilder.NSC, CostDao> {

    @Select("SELECT * FROM M_Cost WHERE M_Product_ID = :productId AND C_AcctSchema_ID = :acctSchemaId AND M_CostElement_ID = :costElementId AND IsActive = 'Y'")
    Optional<Cost> findByProductAndSchema(int productId, int acctSchemaId, int costElementId);

    @Select("SELECT * FROM M_Cost WHERE M_Product_ID = :productId AND IsActive = 'Y'")
    List<Cost> findByProduct(int productId);

    @Select("SELECT * FROM M_Cost WHERE M_CostElement_ID = :costElementId AND IsActive = 'Y'")
    List<Cost> findByCostElement(int costElementId);

    @Select("SELECT * FROM M_Cost WHERE C_AcctSchema_ID = :acctSchemaId AND IsActive = 'Y'")
    List<Cost> findByAcctSchema(int acctSchemaId);
}
