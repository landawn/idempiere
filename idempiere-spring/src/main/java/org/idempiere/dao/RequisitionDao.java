package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Requisition;

/**
 * DAO interface for Requisition entity operations.
 */
public interface RequisitionDao extends CrudDao<Requisition, Integer, SQLBuilder.PSC, RequisitionDao> {

    @Query("SELECT * FROM M_Requisition WHERE IsActive = 'Y' ORDER BY DateRequired DESC")
    List<Requisition> findAllActive();

    @Query("SELECT * FROM M_Requisition WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId")
    Optional<Requisition> findByDocumentNo(String documentNo, Integer clientId);

    @Query("SELECT * FROM M_Requisition WHERE AD_User_ID = :userId AND DocStatus NOT IN ('CO', 'CL', 'VO') ORDER BY DateRequired")
    List<Requisition> findOpenByUser(Integer userId);

    @Query("SELECT * FROM M_Requisition WHERE DocStatus = :docStatus AND AD_Client_ID = :clientId ORDER BY DateRequired")
    List<Requisition> findByDocStatus(String docStatus, Integer clientId);

    @Query("SELECT * FROM M_Requisition WHERE M_Warehouse_ID = :warehouseId AND DocStatus NOT IN ('VO', 'RE') ORDER BY DateRequired")
    List<Requisition> findByWarehouse(Integer warehouseId);
}
