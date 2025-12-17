package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.WebStore;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Web Store operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface WebStoreDao extends CrudDao<WebStore, Integer, SQLBuilder.NSC, WebStoreDao> {

    @Select("SELECT * FROM W_Store WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<WebStore> findByName(String name, int clientId);

    @Select("SELECT * FROM W_Store WHERE WebContext = :webContext AND IsActive = 'Y'")
    Optional<WebStore> findByWebContext(String webContext);

    @Select("SELECT * FROM W_Store WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<WebStore> findByClient(int clientId);

    @Select("SELECT * FROM W_Store WHERE IsDefault = 'Y' AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<WebStore> findDefaultStore(int clientId);

    @Select("SELECT * FROM W_Store WHERE IsActive = 'Y' ORDER BY Name")
    List<WebStore> findAllActive();
}
