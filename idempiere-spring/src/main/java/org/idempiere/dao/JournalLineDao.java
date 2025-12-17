package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.JournalLine;

/**
 * DAO interface for GL Journal Line entity operations.
 */
public interface JournalLineDao extends CrudDao<JournalLine, Integer, SQLBuilder.NSC, JournalLineDao> {

    @Select("SELECT * FROM GL_JournalLine WHERE GL_Journal_ID = :journalId AND IsActive = 'Y' ORDER BY Line")
    List<JournalLine> findByJournalId(Integer journalId);

    @Select("SELECT * FROM GL_JournalLine WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY Created DESC")
    List<JournalLine> findByBPartnerId(Integer bPartnerId);

    @Select("SELECT * FROM GL_JournalLine WHERE M_Product_ID = :productId AND IsActive = 'Y' ORDER BY Created DESC")
    List<JournalLine> findByProductId(Integer productId);

    @Select("SELECT * FROM GL_JournalLine WHERE C_Project_ID = :projectId AND IsActive = 'Y' ORDER BY Created DESC")
    List<JournalLine> findByProjectId(Integer projectId);

    @Select("SELECT * FROM GL_JournalLine WHERE A_Asset_ID = :assetId AND IsActive = 'Y' ORDER BY Created DESC")
    List<JournalLine> findByAssetId(Integer assetId);
}
