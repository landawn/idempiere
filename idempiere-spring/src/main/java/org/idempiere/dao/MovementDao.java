package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Movement;

/**
 * DAO interface for Movement entity operations.
 */
public interface MovementDao extends CrudDao<Movement, Integer, SQLBuilder.PSC, MovementDao> {

    @Query("SELECT * FROM M_Movement WHERE IsActive = 'Y' ORDER BY MovementDate DESC")
    List<Movement> findAllActive();

    @Query("SELECT * FROM M_Movement WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId")
    Optional<Movement> findByDocumentNo(String documentNo, Integer clientId);

    @Query("SELECT * FROM M_Movement WHERE DocStatus = :docStatus AND AD_Client_ID = :clientId ORDER BY MovementDate DESC")
    List<Movement> findByDocStatus(String docStatus, Integer clientId);

    @Query("SELECT * FROM M_Movement WHERE MovementDate BETWEEN :startDate AND :endDate AND AD_Client_ID = :clientId ORDER BY MovementDate")
    List<Movement> findByDateRange(java.time.LocalDateTime startDate, java.time.LocalDateTime endDate, Integer clientId);
}
