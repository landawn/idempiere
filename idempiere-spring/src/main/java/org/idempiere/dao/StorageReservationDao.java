package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.StorageReservation;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface StorageReservationDao extends CrudDao<StorageReservation, Integer, SQLBuilder.PSC, StorageReservationDao> {

    @Query("SELECT * FROM M_StorageReservation WHERE M_Product_ID = :productId AND IsActive = 'Y'")
    List<StorageReservation> findByProduct(Integer productId);

    @Query("SELECT * FROM M_StorageReservation WHERE M_Warehouse_ID = :warehouseId AND IsActive = 'Y'")
    List<StorageReservation> findByWarehouse(Integer warehouseId);

    @Query("SELECT * FROM M_StorageReservation WHERE M_Product_ID = :productId AND M_Warehouse_ID = :warehouseId AND IsSOTrx = :isSOTrx")
    Optional<StorageReservation> findByProductWarehouseSOTrx(Integer productId, Integer warehouseId, String isSOTrx);
}
