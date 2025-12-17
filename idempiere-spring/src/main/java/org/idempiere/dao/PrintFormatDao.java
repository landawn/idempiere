package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.PrintFormat;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Print Format operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface PrintFormatDao extends CrudDao<PrintFormat, Integer, SQLBuilder.NSC, PrintFormatDao> {

    @Select("SELECT * FROM AD_PrintFormat WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<PrintFormat> findByName(String name, int clientId);

    @Select("SELECT * FROM AD_PrintFormat WHERE AD_Table_ID = :tableId AND IsActive = 'Y' ORDER BY Name")
    List<PrintFormat> findByTable(int tableId);

    @Select("SELECT * FROM AD_PrintFormat WHERE AD_ReportView_ID = :reportViewId AND IsActive = 'Y' ORDER BY Name")
    List<PrintFormat> findByReportView(int reportViewId);

    @Select("SELECT * FROM AD_PrintFormat WHERE IsDefault = 'Y' AND AD_Table_ID = :tableId AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<PrintFormat> findDefault(int tableId, int clientId);

    @Select("SELECT * FROM AD_PrintFormat WHERE IsForm = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<PrintFormat> findForms();

    @Select("SELECT * FROM AD_PrintFormat WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<PrintFormat> findByClient(int clientId);

    @Select("SELECT * FROM AD_PrintFormat WHERE IsActive = 'Y' ORDER BY Name")
    List<PrintFormat> findAllActive();
}
