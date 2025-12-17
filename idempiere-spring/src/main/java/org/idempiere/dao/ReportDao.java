package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Report;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Financial Report operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface ReportDao extends CrudDao<Report, Integer, SQLBuilder.NSC, ReportDao> {

    @Select("SELECT * FROM PA_Report WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Report> findByName(String name, int clientId);

    @Select("SELECT * FROM PA_Report WHERE C_AcctSchema_ID = :acctSchemaId AND IsActive = 'Y' ORDER BY Name")
    List<Report> findByAcctSchema(int acctSchemaId);

    @Select("SELECT * FROM PA_Report WHERE PA_ReportLineSet_ID = :reportLineSetId AND IsActive = 'Y' ORDER BY Name")
    List<Report> findByReportLineSet(int reportLineSetId);

    @Select("SELECT * FROM PA_Report WHERE PA_ReportColumnSet_ID = :reportColumnSetId AND IsActive = 'Y' ORDER BY Name")
    List<Report> findByReportColumnSet(int reportColumnSetId);

    @Select("SELECT * FROM PA_Report WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Report> findByClient(int clientId);

    @Select("SELECT * FROM PA_Report WHERE IsActive = 'Y' ORDER BY Name")
    List<Report> findAllActive();
}
