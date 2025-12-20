package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Menu;

/**
 * DAO interface for Menu entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface MenuDao extends CrudDao<Menu, Integer, SQLBuilder.PSC, MenuDao> {

    /**
     * Find a menu by name
     */
    @Query("SELECT * FROM AD_Menu WHERE Name = :name AND IsActive = 'Y'")
    Optional<Menu> findByName(String name);

    /**
     * Find all active menus
     */
    @Query("SELECT * FROM AD_Menu WHERE IsActive = 'Y' ORDER BY Name")
    List<Menu> findAllActive();

    /**
     * Find child menus by parent ID
     */
    @Query("SELECT * FROM AD_Menu WHERE AD_Menu_Parent_ID = :parentId AND IsActive = 'Y' ORDER BY SeqNo")
    List<Menu> findByParentId(Integer parentId);

    /**
     * Find menus by action
     */
    @Query("SELECT * FROM AD_Menu WHERE Action = :action AND IsActive = 'Y' ORDER BY Name")
    List<Menu> findByAction(String action);

    /**
     * Find summary menus
     */
    @Query("SELECT * FROM AD_Menu WHERE IsSummary = 'Y' AND IsActive = 'Y' ORDER BY SeqNo")
    List<Menu> findAllSummary();

    /**
     * Find menus by entity type
     */
    @Query("SELECT * FROM AD_Menu WHERE EntityType = :entityType AND IsActive = 'Y' ORDER BY Name")
    List<Menu> findByEntityType(String entityType);

    /**
     * Find all menus including inactive
     */
    @Query("SELECT * FROM AD_Menu ORDER BY Name")
    List<Menu> findAll();
}
