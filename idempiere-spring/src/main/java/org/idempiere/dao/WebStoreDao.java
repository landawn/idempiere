package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.WebStore;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Web Store operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface WebStoreDao extends CrudDao<WebStore, Integer, SQLBuilder.PSC, WebStoreDao> {

    @Query("SELECT * FROM W_Store WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<WebStore> findByName(String name, int clientId);

    @Query("SELECT * FROM W_Store WHERE WebContext = :webContext AND IsActive = 'Y'")
    Optional<WebStore> findByWebContext(String webContext);

    @Query("SELECT * FROM W_Store WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<WebStore> findByClient(int clientId);

    @Query("SELECT * FROM W_Store WHERE IsDefault = 'Y' AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<WebStore> findDefaultStore(int clientId);

    @Query("SELECT * FROM W_Store WHERE IsActive = 'Y' ORDER BY Name")
    List<WebStore> findAllActive();
}
