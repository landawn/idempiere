package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.Project;

/**
 * DAO interface for Project entity operations.
 */
public interface ProjectDao extends CrudDao<Project, Integer, SQLBuilder.NSC, ProjectDao> {

    @Select("SELECT * FROM C_Project WHERE Value = :value AND IsActive = 'Y'")
    Optional<Project> findByValue(String value);

    @Select("SELECT * FROM C_Project WHERE Name = :name AND IsActive = 'Y'")
    List<Project> findByName(String name);

    @Select("SELECT * FROM C_Project WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY Name")
    List<Project> findByBPartnerId(Integer bPartnerId);

    @Select("SELECT * FROM C_Project WHERE SalesRep_ID = :salesRepId AND IsActive = 'Y' ORDER BY Name")
    List<Project> findBySalesRepId(Integer salesRepId);

    @Select("SELECT * FROM C_Project WHERE C_ProjectType_ID = :projectTypeId AND IsActive = 'Y' ORDER BY Name")
    List<Project> findByProjectTypeId(Integer projectTypeId);

    @Select("SELECT * FROM C_Project WHERE ProjectStatus = :status AND IsActive = 'Y' ORDER BY Name")
    List<Project> findByStatus(String status);

    @Select("SELECT * FROM C_Project WHERE IsSummary = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Project> findAllSummary();

    @Select("SELECT * FROM C_Project WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY Name")
    List<Project> findAllOpen();

    @Select("SELECT * FROM C_Project WHERE IsActive = 'Y' ORDER BY Name")
    List<Project> findAllActive();
}
