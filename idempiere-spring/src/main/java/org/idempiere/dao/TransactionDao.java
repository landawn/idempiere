package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.idempiere.model.Transaction;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface TransactionDao extends CrudDao<Transaction, Integer, SQLBuilder.PSC, TransactionDao> {

    @Query("SELECT * FROM M_Transaction WHERE M_Product_ID = :productId ORDER BY MovementDate DESC")
    List<Transaction> findByProduct(Integer productId);

    @Query("SELECT * FROM M_Transaction WHERE M_Locator_ID = :locatorId ORDER BY MovementDate DESC")
    List<Transaction> findByLocator(Integer locatorId);

    @Query("SELECT * FROM M_Transaction WHERE MovementType = :movementType ORDER BY MovementDate DESC")
    List<Transaction> findByMovementType(String movementType);

    @Query("SELECT * FROM M_Transaction WHERE M_InOutLine_ID = :inOutLineId")
    List<Transaction> findByInOutLine(Integer inOutLineId);

    @Query("SELECT * FROM M_Transaction WHERE M_MovementLine_ID = :movementLineId")
    List<Transaction> findByMovementLine(Integer movementLineId);

    @Query("SELECT * FROM M_Transaction WHERE M_InventoryLine_ID = :inventoryLineId")
    List<Transaction> findByInventoryLine(Integer inventoryLineId);

    @Query("SELECT * FROM M_Transaction WHERE MovementDate BETWEEN :startDate AND :endDate ORDER BY MovementDate")
    List<Transaction> findByDateRange(LocalDateTime startDate, LocalDateTime endDate);

    @Query("SELECT * FROM M_Transaction ORDER BY MovementDate DESC")
    List<Transaction> findAll();
}
