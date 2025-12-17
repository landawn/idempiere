package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.DDOrder;

import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Dao.Cache;
import com.landawn.abacus.condition.ConditionFactory.CF;
import com.landawn.abacus.jdbc.Jdbc;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface DDOrderDao extends CrudDao<DDOrder, Integer, SQLBuilder.NSC, DDOrderDao> {

    @Select("SELECT * FROM DD_Order WHERE DocumentNo = :documentNo AND IsActive = 'Y'")
    Optional<DDOrder> findByDocumentNo(String documentNo);

    @Select("SELECT * FROM DD_Order WHERE IsActive = 'Y' ORDER BY Created DESC")
    List<DDOrder> findAllActive();

    @Select("SELECT * FROM DD_Order WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY Created DESC")
    List<DDOrder> findByDocStatus(String docStatus);

    @Select("SELECT * FROM DD_Order WHERE M_Warehouse_ID = :warehouseId AND IsActive = 'Y' ORDER BY Created DESC")
    List<DDOrder> findByWarehouse(int warehouseId);

    @Select("SELECT * FROM DD_Order WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y' ORDER BY Created DESC")
    List<DDOrder> findByBPartner(int bpartnerId);
}
