package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Report;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Financial Report operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface ReportDao extends CrudDao<Report, Integer, SQLBuilder.PSC, ReportDao> {

    @Query("SELECT * FROM PA_Report WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Report> findByName(String name, int clientId);

    @Query("SELECT * FROM PA_Report WHERE C_AcctSchema_ID = :acctSchemaId AND IsActive = 'Y' ORDER BY Name")
    List<Report> findByAcctSchema(int acctSchemaId);

    @Query("SELECT * FROM PA_Report WHERE PA_ReportLineSet_ID = :reportLineSetId AND IsActive = 'Y' ORDER BY Name")
    List<Report> findByReportLineSet(int reportLineSetId);

    @Query("SELECT * FROM PA_Report WHERE PA_ReportColumnSet_ID = :reportColumnSetId AND IsActive = 'Y' ORDER BY Name")
    List<Report> findByReportColumnSet(int reportColumnSetId);

    @Query("SELECT * FROM PA_Report WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Report> findByClient(int clientId);

    @Query("SELECT * FROM PA_Report WHERE IsActive = 'Y' ORDER BY Name")
    List<Report> findAllActive();
}
