package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.DDOrder;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

@Cache(capacity = 100, evictDelay = 3000)
public interface DDOrderDao extends CrudDao<DDOrder, Integer, SQLBuilder.PSC, DDOrderDao> {

    @Query("SELECT * FROM DD_Order WHERE DocumentNo = :documentNo AND IsActive = 'Y'")
    Optional<DDOrder> findByDocumentNo(String documentNo);

    @Query("SELECT * FROM DD_Order WHERE IsActive = 'Y' ORDER BY Created DESC")
    List<DDOrder> findAllActive();

    @Query("SELECT * FROM DD_Order WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY Created DESC")
    List<DDOrder> findByDocStatus(String docStatus);

    @Query("SELECT * FROM DD_Order WHERE M_Warehouse_ID = :warehouseId AND IsActive = 'Y' ORDER BY Created DESC")
    List<DDOrder> findByWarehouse(int warehouseId);

    @Query("SELECT * FROM DD_Order WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y' ORDER BY Created DESC")
    List<DDOrder> findByBPartner(int bpartnerId);
}
