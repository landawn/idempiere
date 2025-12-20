package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.MenuDao;
import org.idempiere.model.Menu;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

/**
 * Service class for Menu business operations.
 */
@Service
@Transactional
@RequiredArgsConstructor
public class MenuService {

    private final MenuDao menuDao;

    /**
     * Find menu by ID.
     */
    public Optional<Menu> findById(int menuId) {
        try { return Optional.ofNullable(menuDao.gett(menuId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    /**
     * Find menu by name.
     */
    public Optional<Menu> findByName(String name) {
        return menuDao.findByName(name);
    }

    /**
     * Find child menus by parent ID.
     */
    public List<Menu> findByParentId(Integer parentId) {
        return menuDao.findByParentId(parentId);
    }

    /**
     * Find menus by action.
     */
    public List<Menu> findByAction(String action) {
        return menuDao.findByAction(action);
    }

    /**
     * Find all summary menus.
     */
    public List<Menu> findAllSummary() {
        return menuDao.findAllSummary();
    }

    /**
     * Find menus by entity type.
     */
    public List<Menu> findByEntityType(String entityType) {
        return menuDao.findByEntityType(entityType);
    }

    /**
     * Find all active menus.
     */
    public List<Menu> findAllActive() {
        return menuDao.findAllActive();
    }

    /**
     * Find all menus.
     */
    public List<Menu> findAll() {
        return menuDao.findAll();
    }

    /**
     * Save a menu.
     */
    public Menu save(Menu menu) {
        try {
            if (menu.getAdMenuId() == null || menu.getAdMenuId() == 0) {
                menuDao.insert(menu);
            } else {
                menuDao.update(menu);
            }
            return menu;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    /**
     * Delete a menu.
     */
    public void delete(int menuId) {
        try { menuDao.deleteById(menuId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    /**
     * Check if menu exists.
     */
    public boolean exists(int menuId) {
        try { return menuDao.exists(menuId); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
