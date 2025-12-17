package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Browse;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Smart Browse operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface BrowseDao extends CrudDao<Browse, Integer, SQLBuilder.NSC, BrowseDao> {

    @Select("SELECT * FROM AD_Browse WHERE Value = :value AND IsActive = 'Y'")
    Optional<Browse> findByValue(String value);

    @Select("SELECT * FROM AD_Browse WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Browse> findByClient(int clientId);

    @Select("SELECT * FROM AD_Browse WHERE IsActive = 'Y' ORDER BY Name")
    List<Browse> findAllActive();

    @Select("SELECT * FROM AD_Browse WHERE AD_Window_ID = :windowId AND IsActive = 'Y'")
    List<Browse> findByWindow(int windowId);

    @Select("SELECT * FROM AD_Browse WHERE Name LIKE :name AND IsActive = 'Y' ORDER BY Name")
    List<Browse> searchByName(String name);
}
