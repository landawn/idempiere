package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Window;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

@Cache(capacity = 100, evictDelay = 3000)
public interface WindowDao extends CrudDao<Window, Integer, SQLBuilder.PSC, WindowDao> {

    @Query("SELECT * FROM AD_Window WHERE Name = :name AND IsActive = 'Y'")
    Optional<Window> findByName(String name);

    @Query("SELECT * FROM AD_Window WHERE IsActive = 'Y' ORDER BY Name")
    List<Window> findAllActive();

    @Query("SELECT * FROM AD_Window WHERE WindowType = :windowType AND IsActive = 'Y' ORDER BY Name")
    List<Window> findByWindowType(String windowType);

    @Query("SELECT * FROM AD_Window WHERE IsSOTrx = :isSOTrx AND IsActive = 'Y' ORDER BY Name")
    List<Window> findBySalesTransaction(String isSOTrx);

    @Query("SELECT * FROM AD_Window WHERE EntityType = :entityType AND IsActive = 'Y' ORDER BY Name")
    List<Window> findByEntityType(String entityType);

    @Query("SELECT * FROM AD_Window ORDER BY Name")
    List<Window> findAll();
}
