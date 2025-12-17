package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.ImportFormat;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Import Format operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface ImportFormatDao extends CrudDao<ImportFormat, Integer, SQLBuilder.NSC, ImportFormatDao> {

    @Select("SELECT * FROM AD_ImpFormat WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<ImportFormat> findByName(String name, int clientId);

    @Select("SELECT * FROM AD_ImpFormat WHERE AD_Table_ID = :tableId AND IsActive = 'Y' ORDER BY Name")
    List<ImportFormat> findByTable(int tableId);

    @Select("SELECT * FROM AD_ImpFormat WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<ImportFormat> findByClient(int clientId);

    @Select("SELECT * FROM AD_ImpFormat WHERE FormatType = :formatType AND IsActive = 'Y' ORDER BY Name")
    List<ImportFormat> findByFormatType(String formatType);

    @Select("SELECT * FROM AD_ImpFormat WHERE IsActive = 'Y' ORDER BY Name")
    List<ImportFormat> findAllActive();
}
