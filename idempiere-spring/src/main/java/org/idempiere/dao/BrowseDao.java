package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Browse;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Smart Browse operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface BrowseDao extends CrudDao<Browse, Integer, SQLBuilder.PSC, BrowseDao> {

    @Query("SELECT * FROM AD_Browse WHERE Value = :value AND IsActive = 'Y'")
    Optional<Browse> findByValue(String value);

    @Query("SELECT * FROM AD_Browse WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Browse> findByClient(int clientId);

    @Query("SELECT * FROM AD_Browse WHERE IsActive = 'Y' ORDER BY Name")
    List<Browse> findAllActive();

    @Query("SELECT * FROM AD_Browse WHERE AD_Window_ID = :windowId AND IsActive = 'Y'")
    List<Browse> findByWindow(int windowId);

    @Query("SELECT * FROM AD_Browse WHERE Name LIKE :name AND IsActive = 'Y' ORDER BY Name")
    List<Browse> searchByName(String name);
}
