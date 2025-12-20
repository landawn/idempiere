package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.DunningLevel;

/**
 * DAO interface for DunningLevel entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface DunningLevelDao extends CrudDao<DunningLevel, Integer, SQLBuilder.PSC, DunningLevelDao> {

    /**
     * Find all dunning levels for a dunning
     */
    @Query("SELECT * FROM C_DunningLevel WHERE C_Dunning_ID = :dunningId AND IsActive = 'Y' ORDER BY DaysAfterDue")
    List<DunningLevel> findByDunning(Integer dunningId);

    /**
     * Find dunning level by name
     */
    @Query("SELECT * FROM C_DunningLevel WHERE Name = :name AND IsActive = 'Y'")
    Optional<DunningLevel> findByName(String name);

    /**
     * Find dunning levels that set credit stop
     */
    @Query("SELECT * FROM C_DunningLevel WHERE IsSetCreditStop = 'Y' AND IsActive = 'Y' ORDER BY DaysAfterDue")
    List<DunningLevel> findCreditStopLevels();

    /**
     * Find dunning levels by days after due
     */
    @Query("SELECT * FROM C_DunningLevel WHERE C_Dunning_ID = :dunningId AND DaysAfterDue <= :daysAfterDue AND IsActive = 'Y' ORDER BY DaysAfterDue DESC")
    List<DunningLevel> findByDaysAfterDue(Integer dunningId, Integer daysAfterDue);

    /**
     * Find dunning levels by payment term
     */
    @Query("SELECT * FROM C_DunningLevel WHERE C_PaymentTerm_ID = :paymentTermId AND IsActive = 'Y' ORDER BY DaysAfterDue")
    List<DunningLevel> findByPaymentTerm(Integer paymentTermId);
}
