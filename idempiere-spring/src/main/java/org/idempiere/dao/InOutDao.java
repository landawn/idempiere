package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.InOut;

/**
 * DAO interface for InOut (Material Receipt/Shipment) entity operations.
 */
public interface InOutDao extends CrudDao<InOut, Integer, SQLBuilder.NSC, InOutDao> {

    @Select("SELECT * FROM M_InOut WHERE DocumentNo = :documentNo AND IsActive = 'Y'")
    Optional<InOut> findByDocumentNo(String documentNo);

    @Select("SELECT * FROM M_InOut WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findByBPartnerId(Integer bPartnerId);

    @Select("SELECT * FROM M_InOut WHERE C_Order_ID = :orderId AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findByOrderId(Integer orderId);

    @Select("SELECT * FROM M_InOut WHERE M_Warehouse_ID = :warehouseId AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findByWarehouseId(Integer warehouseId);

    @Select("SELECT * FROM M_InOut WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findByDocStatus(String docStatus);

    @Select("SELECT * FROM M_InOut WHERE IsSOTrx = 'Y' AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findAllShipments();

    @Select("SELECT * FROM M_InOut WHERE IsSOTrx = 'N' AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findAllReceipts();

    @Select("SELECT * FROM M_InOut WHERE MovementDate BETWEEN :startDate AND :endDate AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findByDateRange(LocalDateTime startDate, LocalDateTime endDate);

    @Select("SELECT * FROM M_InOut WHERE DocStatus = 'DR' AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findAllDraft();

    @Select("SELECT * FROM M_InOut WHERE DocStatus = 'CO' AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<InOut> findAllCompleted();
}
