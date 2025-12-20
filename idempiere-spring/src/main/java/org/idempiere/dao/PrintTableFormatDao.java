package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.PrintTableFormat;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface PrintTableFormatDao extends CrudDao<PrintTableFormat, Integer, SQLBuilder.PSC, PrintTableFormatDao> {

    @Query("SELECT * FROM AD_PrintTableFormat WHERE AD_Client_ID IN (0, :clientId) AND IsActive = 'Y'")
    List<PrintTableFormat> findByClient(Integer clientId);

    @Query("SELECT * FROM AD_PrintTableFormat WHERE Name = :name AND AD_Client_ID IN (0, :clientId) AND IsActive = 'Y'")
    Optional<PrintTableFormat> findByName(String name, Integer clientId);

    @Query("SELECT * FROM AD_PrintTableFormat WHERE IsDefault = 'Y' AND AD_Client_ID IN (0, :clientId) AND IsActive = 'Y'")
    Optional<PrintTableFormat> findDefault(Integer clientId);
}
