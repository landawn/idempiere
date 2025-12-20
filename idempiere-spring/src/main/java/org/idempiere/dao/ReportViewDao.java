package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.ReportView;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface ReportViewDao extends CrudDao<ReportView, Integer, SQLBuilder.PSC, ReportViewDao> {

    @Query("SELECT * FROM AD_ReportView WHERE AD_Client_ID IN (0, :clientId) AND IsActive = 'Y'")
    List<ReportView> findByClient(Integer clientId);

    @Query("SELECT * FROM AD_ReportView WHERE Name = :name AND AD_Client_ID IN (0, :clientId) AND IsActive = 'Y'")
    Optional<ReportView> findByName(String name, Integer clientId);

    @Query("SELECT * FROM AD_ReportView WHERE AD_Table_ID = :tableId AND IsActive = 'Y'")
    List<ReportView> findByTable(Integer tableId);
}
