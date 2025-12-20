package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.JournalLine;

/**
 * DAO interface for GL Journal Line entity operations.
 */
public interface JournalLineDao extends CrudDao<JournalLine, Integer, SQLBuilder.PSC, JournalLineDao> {

    @Query("SELECT * FROM GL_JournalLine WHERE GL_Journal_ID = :journalId AND IsActive = 'Y' ORDER BY Line")
    List<JournalLine> findByJournal(Integer journalId);

    @Query("SELECT * FROM GL_JournalLine WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY Created DESC")
    List<JournalLine> findByBPartnerId(Integer bPartnerId);

    @Query("SELECT * FROM GL_JournalLine WHERE M_Product_ID = :productId AND IsActive = 'Y' ORDER BY Created DESC")
    List<JournalLine> findByProductId(Integer productId);

    @Query("SELECT * FROM GL_JournalLine WHERE C_Project_ID = :projectId AND IsActive = 'Y' ORDER BY Created DESC")
    List<JournalLine> findByProjectId(Integer projectId);

    @Query("SELECT * FROM GL_JournalLine WHERE A_Asset_ID = :assetId AND IsActive = 'Y' ORDER BY Created DESC")
    List<JournalLine> findByAssetId(Integer assetId);
}
