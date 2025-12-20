package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.ImportFormat;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Import Format operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface ImportFormatDao extends CrudDao<ImportFormat, Integer, SQLBuilder.NSC, ImportFormatDao> {

    @Query("SELECT * FROM AD_ImpFormat WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<ImportFormat> findByName(String name, int clientId);

    @Query("SELECT * FROM AD_ImpFormat WHERE AD_Table_ID = :tableId AND IsActive = 'Y' ORDER BY Name")
    List<ImportFormat> findByTable(int tableId);

    @Query("SELECT * FROM AD_ImpFormat WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<ImportFormat> findByClient(int clientId);

    @Query("SELECT * FROM AD_ImpFormat WHERE FormatType = :formatType AND IsActive = 'Y' ORDER BY Name")
    List<ImportFormat> findByFormatType(String formatType);

    @Query("SELECT * FROM AD_ImpFormat WHERE IsActive = 'Y' ORDER BY Name")
    List<ImportFormat> findAllActive();
}
