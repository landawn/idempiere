package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.PrintFormatItem;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface PrintFormatItemDao extends CrudDao<PrintFormatItem, Integer, SQLBuilder.PSC, PrintFormatItemDao> {

    @Query("SELECT * FROM AD_PrintFormatItem WHERE AD_PrintFormat_ID = :printFormatId AND IsActive = 'Y' ORDER BY SeqNo")
    List<PrintFormatItem> findByPrintFormat(Integer printFormatId);

    @Query("SELECT * FROM AD_PrintFormatItem WHERE AD_PrintFormat_ID = :printFormatId AND IsPrinted = 'Y' AND IsActive = 'Y' ORDER BY SeqNo")
    List<PrintFormatItem> findPrintedByPrintFormat(Integer printFormatId);

    @Query("SELECT * FROM AD_PrintFormatItem WHERE AD_Column_ID = :columnId AND IsActive = 'Y'")
    List<PrintFormatItem> findByColumn(Integer columnId);
}
