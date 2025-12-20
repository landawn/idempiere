package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.PrintPaper;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface PrintPaperDao extends CrudDao<PrintPaper, Integer, SQLBuilder.PSC, PrintPaperDao> {

    @Query("SELECT * FROM AD_PrintPaper WHERE AD_Client_ID IN (0, :clientId) AND IsActive = 'Y'")
    List<PrintPaper> findByClient(Integer clientId);

    @Query("SELECT * FROM AD_PrintPaper WHERE Name = :name AND AD_Client_ID IN (0, :clientId) AND IsActive = 'Y'")
    Optional<PrintPaper> findByName(String name, Integer clientId);

    @Query("SELECT * FROM AD_PrintPaper WHERE IsDefault = 'Y' AND AD_Client_ID IN (0, :clientId) AND IsActive = 'Y'")
    Optional<PrintPaper> findDefault(Integer clientId);

    @Query("SELECT * FROM AD_PrintPaper WHERE IsLandscape = :isLandscape AND AD_Client_ID IN (0, :clientId) AND IsActive = 'Y'")
    List<PrintPaper> findByOrientation(String isLandscape, Integer clientId);
}
