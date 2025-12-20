package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.InOut;

/**
 * DAO interface for InOut (Material Receipt/Shipment) entity operations.
 */
public interface InOutDao extends CrudDao<InOut, Integer, SQLBuilder.NSC, InOutDao> {

    @Query("SELECT * FROM M_InOut WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<InOut> findByDocumentNo(String documentNo, Integer clientId);

    @Query("SELECT * FROM M_InOut WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findByBPartner(Integer bpartnerId);

    @Query("SELECT * FROM M_InOut WHERE C_Order_ID = :orderId AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findByOrderId(Integer orderId);

    @Query("SELECT * FROM M_InOut WHERE M_Warehouse_ID = :warehouseId AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findByWarehouseId(Integer warehouseId);

    @Query("SELECT * FROM M_InOut WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findByDocStatus(String docStatus);

    @Query("SELECT * FROM M_InOut WHERE IsSOTrx = 'Y' AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findAllShipments();

    @Query("SELECT * FROM M_InOut WHERE IsSOTrx = 'N' AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findAllReceipts();

    @Query("SELECT * FROM M_InOut WHERE MovementDate BETWEEN :startDate AND :endDate AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findByDateRange(LocalDateTime startDate, LocalDateTime endDate);

    @Query("SELECT * FROM M_InOut WHERE DocStatus = 'DR' AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findAllDraft();

    @Query("SELECT * FROM M_InOut WHERE DocStatus = 'CO' AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findAllCompleted();

    @Query("SELECT * FROM M_InOut WHERE IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findAll();
}
