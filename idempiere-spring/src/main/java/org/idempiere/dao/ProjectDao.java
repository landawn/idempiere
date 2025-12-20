package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Project;

/**
 * DAO interface for Project entity operations.
 */
public interface ProjectDao extends CrudDao<Project, Integer, SQLBuilder.PSC, ProjectDao> {

    @Query("SELECT * FROM C_Project WHERE Value = :value AND IsActive = 'Y'")
    Optional<Project> findByValue(String value);

    @Query("SELECT * FROM C_Project WHERE Name = :name AND IsActive = 'Y'")
    List<Project> findByName(String name);

    @Query("SELECT * FROM C_Project WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY Name")
    List<Project> findByBPartnerId(Integer bPartnerId);

    @Query("SELECT * FROM C_Project WHERE SalesRep_ID = :salesRepId AND IsActive = 'Y' ORDER BY Name")
    List<Project> findBySalesRepId(Integer salesRepId);

    @Query("SELECT * FROM C_Project WHERE C_ProjectType_ID = :projectTypeId AND IsActive = 'Y' ORDER BY Name")
    List<Project> findByProjectTypeId(Integer projectTypeId);

    @Query("SELECT * FROM C_Project WHERE ProjectStatus = :status AND IsActive = 'Y' ORDER BY Name")
    List<Project> findByStatus(String status);

    @Query("SELECT * FROM C_Project WHERE IsSummary = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Project> findAllSummary();

    @Query("SELECT * FROM C_Project WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY Name")
    List<Project> findAllOpen();

    @Query("SELECT * FROM C_Project WHERE IsActive = 'Y' ORDER BY Name")
    List<Project> findAllActive();
}
