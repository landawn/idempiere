package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.InfoWindow;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Info Window operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface InfoWindowDao extends CrudDao<InfoWindow, Integer, SQLBuilder.NSC, InfoWindowDao> {

    @Query("SELECT * FROM AD_InfoWindow WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<InfoWindow> findByName(String name, int clientId);

    @Query("SELECT * FROM AD_InfoWindow WHERE AD_Table_ID = :tableId AND IsActive = 'Y' ORDER BY Name")
    List<InfoWindow> findByTable(int tableId);

    @Query("SELECT * FROM AD_InfoWindow WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<InfoWindow> findByClient(int clientId);

    @Query("SELECT * FROM AD_InfoWindow WHERE IsActive = 'Y' ORDER BY Name")
    List<InfoWindow> findAllActive();
}
