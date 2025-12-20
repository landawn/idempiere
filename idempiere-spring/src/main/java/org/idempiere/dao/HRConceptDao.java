package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.HRConcept;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO interface for HR Concept entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface HRConceptDao extends CrudDao<HRConcept, Integer, SQLBuilder.NSC, HRConceptDao> {

    /**
     * Find a concept by its value (code)
     */
    @Query("SELECT * FROM HR_Concept WHERE Value = :value AND IsActive = 'Y'")
    Optional<HRConcept> findByValue(String value);

    /**
     * Find a concept by name
     */
    @Query("SELECT * FROM HR_Concept WHERE Name = :name AND IsActive = 'Y'")
    Optional<HRConcept> findByName(String name);

    /**
     * Find all active concepts
     */
    @Query("SELECT * FROM HR_Concept WHERE IsActive = 'Y' ORDER BY SeqNo, Name")
    List<HRConcept> findAllActive();

    /**
     * Find concepts by category
     */
    @Query("SELECT * FROM HR_Concept WHERE HR_Concept_Category_ID = :categoryId AND IsActive = 'Y' ORDER BY SeqNo, Name")
    List<HRConcept> findByCategory(int categoryId);

    /**
     * Find concepts by type
     */
    @Query("SELECT * FROM HR_Concept WHERE Type = :type AND IsActive = 'Y' ORDER BY SeqNo, Name")
    List<HRConcept> findByType(String type);

    /**
     * Find manual concepts
     */
    @Query("SELECT * FROM HR_Concept WHERE IsManual = 'Y' AND IsActive = 'Y' ORDER BY SeqNo, Name")
    List<HRConcept> findManualConcepts();

    /**
     * Find default concepts
     */
    @Query("SELECT * FROM HR_Concept WHERE IsDefault = 'Y' AND IsActive = 'Y' ORDER BY SeqNo, Name")
    List<HRConcept> findDefaultConcepts();

    /**
     * Find printed concepts
     */
    @Query("SELECT * FROM HR_Concept WHERE IsPrinted = 'Y' AND IsActive = 'Y' ORDER BY SeqNo, Name")
    List<HRConcept> findPrintedConcepts();

    /**
     * Find registered concepts
     */
    @Query("SELECT * FROM HR_Concept WHERE IsRegistered = 'Y' AND IsActive = 'Y' ORDER BY SeqNo, Name")
    List<HRConcept> findRegisteredConcepts();

    /**
     * Find employee concepts
     */
    @Query("SELECT * FROM HR_Concept WHERE IsEmployee = 'Y' AND IsActive = 'Y' ORDER BY SeqNo, Name")
    List<HRConcept> findEmployeeConcepts();

    /**
     * Find paid concepts
     */
    @Query("SELECT * FROM HR_Concept WHERE IsPaid = 'Y' AND IsActive = 'Y' ORDER BY SeqNo, Name")
    List<HRConcept> findPaidConcepts();
}
