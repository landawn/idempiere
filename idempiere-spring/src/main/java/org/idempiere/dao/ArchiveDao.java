package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.Archive;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface ArchiveDao extends CrudDao<Archive, Integer, SQLBuilder.PSC, ArchiveDao> {

    @Query("SELECT * FROM AD_Archive WHERE AD_Table_ID = :tableId AND Record_ID = :recordId ORDER BY Created DESC")
    List<Archive> findByRecord(Integer tableId, Integer recordId);

    @Query("SELECT * FROM AD_Archive WHERE AD_Client_ID = :clientId ORDER BY Created DESC")
    List<Archive> findByClient(Integer clientId);

    @Query("SELECT * FROM AD_Archive WHERE CreatedBy = :userId ORDER BY Created DESC")
    List<Archive> findByUser(Integer userId);

    @Query("SELECT * FROM AD_Archive WHERE C_BPartner_ID = :bpartnerId ORDER BY Created DESC")
    List<Archive> findByBPartner(Integer bpartnerId);

    @Query("SELECT * FROM AD_Archive WHERE IsActive = 'Y' ORDER BY Created DESC")
    List<Archive> findAllActive();
}
