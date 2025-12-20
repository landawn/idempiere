package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.PrintFont;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface PrintFontDao extends CrudDao<PrintFont, Integer, SQLBuilder.PSC, PrintFontDao> {

    @Query("SELECT * FROM AD_PrintFont WHERE IsActive = 'Y'")
    List<PrintFont> findAll();

    @Query("SELECT * FROM AD_PrintFont WHERE Name = :name AND IsActive = 'Y'")
    Optional<PrintFont> findByName(String name);

    @Query("SELECT * FROM AD_PrintFont WHERE IsDefault = 'Y' AND IsActive = 'Y'")
    Optional<PrintFont> findDefault();
}
