package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.ValidCombination;

/**
 * DAO interface for ValidCombination entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface ValidCombinationDao extends CrudDao<ValidCombination, Integer, SQLBuilder.PSC, ValidCombinationDao> {

    /**
     * Find a valid combination by combination string
     */
    @Query("SELECT * FROM C_ValidCombination WHERE Combination = :combination AND IsActive = 'Y'")
    Optional<ValidCombination> findByCombination(String combination);

    /**
     * Find valid combinations by accounting schema
     */
    @Query("SELECT * FROM C_ValidCombination WHERE C_AcctSchema_ID = :acctSchemaId AND IsActive = 'Y' ORDER BY Combination")
    List<ValidCombination> findByAcctSchemaId(Integer acctSchemaId);

    /**
     * Find valid combinations by account
     */
    @Query("SELECT * FROM C_ValidCombination WHERE Account_ID = :accountId AND IsActive = 'Y' ORDER BY Combination")
    List<ValidCombination> findByAccountId(Integer accountId);

    /**
     * Find all active valid combinations
     */
    @Query("SELECT * FROM C_ValidCombination WHERE IsActive = 'Y' ORDER BY Combination")
    List<ValidCombination> findAllActive();
}
