package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.PPOrder;

import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Dao.Cache;
import com.landawn.abacus.condition.ConditionFactory.CF;
import com.landawn.abacus.jdbc.Jdbc;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface PPOrderDao extends CrudDao<PPOrder, Integer, SQLBuilder.NSC, PPOrderDao> {

    @Select("SELECT * FROM PP_Order WHERE DocumentNo = :documentNo AND IsActive = 'Y'")
    Optional<PPOrder> findByDocumentNo(String documentNo);

    @Select("SELECT * FROM PP_Order WHERE IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrder> findAllActive();

    @Select("SELECT * FROM PP_Order WHERE M_Product_ID = :productId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrder> findByProduct(int productId);

    @Select("SELECT * FROM PP_Order WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrder> findByDocStatus(String docStatus);

    @Select("SELECT * FROM PP_Order WHERE M_Warehouse_ID = :warehouseId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrder> findByWarehouse(int warehouseId);

    @Select("SELECT * FROM PP_Order WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrder> findByBPartner(int bpartnerId);
}
