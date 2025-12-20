package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.PrintColor;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface PrintColorDao extends CrudDao<PrintColor, Integer, SQLBuilder.PSC, PrintColorDao> {

    @Query("SELECT * FROM AD_PrintColor WHERE IsActive = 'Y'")
    List<PrintColor> findAll();

    @Query("SELECT * FROM AD_PrintColor WHERE Name = :name AND IsActive = 'Y'")
    Optional<PrintColor> findByName(String name);

    @Query("SELECT * FROM AD_PrintColor WHERE IsDefault = 'Y' AND IsActive = 'Y'")
    Optional<PrintColor> findDefault();
}
