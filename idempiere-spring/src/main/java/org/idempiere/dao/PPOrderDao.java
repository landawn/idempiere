package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.PPOrder;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

@Cache(capacity = 100, evictDelay = 3000)
public interface PPOrderDao extends CrudDao<PPOrder, Integer, SQLBuilder.PSC, PPOrderDao> {

    @Query("SELECT * FROM PP_Order WHERE DocumentNo = :documentNo AND IsActive = 'Y'")
    Optional<PPOrder> findByDocumentNo(String documentNo);

    @Query("SELECT * FROM PP_Order WHERE IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrder> findAllActive();

    @Query("SELECT * FROM PP_Order WHERE M_Product_ID = :productId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrder> findByProduct(int productId);

    @Query("SELECT * FROM PP_Order WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrder> findByDocStatus(String docStatus);

    @Query("SELECT * FROM PP_Order WHERE M_Warehouse_ID = :warehouseId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrder> findByWarehouse(int warehouseId);

    @Query("SELECT * FROM PP_Order WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrder> findByBPartner(int bpartnerId);
}
