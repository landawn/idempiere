package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.ReportViewCol;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface ReportViewColDao extends CrudDao<ReportViewCol, Integer, SQLBuilder.PSC, ReportViewColDao> {

    @Query("SELECT * FROM AD_ReportView_Col WHERE AD_ReportView_ID = :reportViewId AND IsActive = 'Y' ORDER BY SeqNo")
    List<ReportViewCol> findByReportView(Integer reportViewId);
}
