package org.idempiere.service;

import java.util.List;
import java.util.Optional;

import org.idempiere.dao.AccessDao;
import org.idempiere.model.TableAccess;
import org.idempiere.model.ColumnAccess;
import org.idempiere.model.RecordAccess;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for Access Control operations.
 */
@Service
@Transactional(readOnly = true)
public class AccessService {

    private final AccessDao accessDao;

    public AccessService(AccessDao accessDao) {
        this.accessDao = accessDao;
    }

    /**
     * Get all table access rules for a role.
     */
    public List<TableAccess> getTableAccessByRole(int roleId) {
        return accessDao.findTableAccessByRole(roleId);
    }

    /**
     * Get table access for a specific role and table.
     */
    public List<TableAccess> getTableAccess(int roleId, int tableId) {
        return accessDao.findTableAccessByRoleAndTable(roleId, tableId);
    }

    /**
     * Check if role has read access to a table.
     */
    public boolean hasTableReadAccess(int roleId, int tableId) {
        List<TableAccess> accesses = accessDao.findTableAccessByRoleAndTable(roleId, tableId);
        if (accesses.isEmpty()) {
            return true; // No explicit rule means access allowed
        }
        for (TableAccess access : accesses) {
            if ("Y".equals(access.getIsExclude())) {
                return false; // Excluded
            }
        }
        return true;
    }

    /**
     * Check if role has write access to a table.
     */
    public boolean hasTableWriteAccess(int roleId, int tableId) {
        List<TableAccess> accesses = accessDao.findTableAccessByRoleAndTable(roleId, tableId);
        if (accesses.isEmpty()) {
            return true; // No explicit rule means access allowed
        }
        for (TableAccess access : accesses) {
            if ("Y".equals(access.getIsExclude()) || "Y".equals(access.getIsReadOnly())) {
                return false; // Excluded or read-only
            }
        }
        return true;
    }

    /**
     * Check if role can report on a table.
     */
    public boolean canReport(int roleId, int tableId) {
        List<TableAccess> accesses = accessDao.findTableAccessByRoleAndTable(roleId, tableId);
        if (accesses.isEmpty()) {
            return true; // No explicit rule means access allowed
        }
        for (TableAccess access : accesses) {
            if ("N".equals(access.getIsCanReport())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if role can export from a table.
     */
    public boolean canExport(int roleId, int tableId) {
        List<TableAccess> accesses = accessDao.findTableAccessByRoleAndTable(roleId, tableId);
        if (accesses.isEmpty()) {
            return true; // No explicit rule means access allowed
        }
        for (TableAccess access : accesses) {
            if ("N".equals(access.getIsCanExport())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Get all column access rules for a role.
     */
    public List<ColumnAccess> getColumnAccessByRole(int roleId) {
        return accessDao.findColumnAccessByRole(roleId);
    }

    /**
     * Get all record access rules for a role.
     */
    public List<RecordAccess> getRecordAccessByRole(int roleId) {
        return accessDao.findRecordAccessByRole(roleId);
    }

    /**
     * Create a new table access rule.
     */
    @Transactional
    public TableAccess createTableAccess(TableAccess access) {
        accessDao.insert(access);
        return access;
    }

    /**
     * Update a table access rule.
     */
    @Transactional
    public TableAccess updateTableAccess(TableAccess access) {
        accessDao.update(access);
        return access;
    }

    /**
     * Delete a table access rule.
     */
    @Transactional
    public void deleteTableAccess(int accessId) {
        accessDao.deleteById(accessId);
    }
}
