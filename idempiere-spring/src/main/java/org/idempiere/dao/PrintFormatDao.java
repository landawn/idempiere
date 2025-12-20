package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.PrintFormat;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Print Format operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface PrintFormatDao extends CrudDao<PrintFormat, Integer, SQLBuilder.PSC, PrintFormatDao> {

    @Query("SELECT * FROM AD_PrintFormat WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<PrintFormat> findByName(String name, int clientId);

    @Query("SELECT * FROM AD_PrintFormat WHERE AD_Table_ID = :tableId AND IsActive = 'Y' ORDER BY Name")
    List<PrintFormat> findByTable(int tableId);

    @Query("SELECT * FROM AD_PrintFormat WHERE AD_ReportView_ID = :reportViewId AND IsActive = 'Y' ORDER BY Name")
    List<PrintFormat> findByReportView(int reportViewId);

    @Query("SELECT * FROM AD_PrintFormat WHERE IsDefault = 'Y' AND AD_Table_ID = :tableId AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<PrintFormat> findDefault(int tableId, int clientId);

    @Query("SELECT * FROM AD_PrintFormat WHERE IsForm = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<PrintFormat> findForms();

    @Query("SELECT * FROM AD_PrintFormat WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<PrintFormat> findByClient(int clientId);

    @Query("SELECT * FROM AD_PrintFormat WHERE IsActive = 'Y' ORDER BY Name")
    List<PrintFormat> findAllActive();
}
