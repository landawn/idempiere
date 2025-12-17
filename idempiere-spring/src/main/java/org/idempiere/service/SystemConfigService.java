package org.idempiere.service;

import java.util.List;
import java.util.Optional;

import org.idempiere.dao.SystemConfigDao;
import org.idempiere.model.SystemConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for System Configuration business operations.
 */
@Service
@Transactional
public class SystemConfigService {

    private final SystemConfigDao systemConfigDao;

    public SystemConfigService(SystemConfigDao systemConfigDao) {
        this.systemConfigDao = systemConfigDao;
    }

    /**
     * Find system config by ID.
     */
    public Optional<SystemConfig> findById(int sysConfigId) {
        return systemConfigDao.findById(sysConfigId);
    }

    /**
     * Find system config by name for specific client and org.
     */
    public Optional<SystemConfig> findByName(String name, int clientId, int orgId) {
        return systemConfigDao.findByName(name, clientId, orgId);
    }

    /**
     * Get configuration value, falling back to client/org hierarchy.
     */
    public String getValue(String name, int clientId, int orgId, String defaultValue) {
        // Try exact match first
        Optional<SystemConfig> config = systemConfigDao.findByName(name, clientId, orgId);
        if (config.isPresent()) {
            return config.get().getValue();
        }

        // Try client level (org=0)
        if (orgId != 0) {
            config = systemConfigDao.findByName(name, clientId, 0);
            if (config.isPresent()) {
                return config.get().getValue();
            }
        }

        // Try system level (client=0, org=0)
        if (clientId != 0) {
            config = systemConfigDao.findByName(name, 0, 0);
            if (config.isPresent()) {
                return config.get().getValue();
            }
        }

        return defaultValue;
    }

    /**
     * Find all configs with a given name.
     */
    public List<SystemConfig> findAllByName(String name) {
        return systemConfigDao.findAllByName(name);
    }

    /**
     * Find all configs by configuration level.
     */
    public List<SystemConfig> findByConfigurationLevel(String level) {
        return systemConfigDao.findByConfigurationLevel(level);
    }

    /**
     * Find all configs for a client.
     */
    public List<SystemConfig> findByClient(int clientId) {
        return systemConfigDao.findByClient(clientId);
    }

    /**
     * Find all active configs.
     */
    public List<SystemConfig> findAllActive() {
        return systemConfigDao.findAllActive();
    }

    /**
     * Save a system config.
     */
    public SystemConfig save(SystemConfig systemConfig) {
        if (systemConfig.getAdSysConfigId() == null || systemConfig.getAdSysConfigId() == 0) {
            systemConfigDao.insert(systemConfig);
        } else {
            systemConfigDao.update(systemConfig);
        }
        return systemConfig;
    }

    /**
     * Delete a system config.
     */
    public void delete(int sysConfigId) {
        systemConfigDao.deleteById(sysConfigId);
    }

    /**
     * Count all configs.
     */
    public long count() {
        return systemConfigDao.count();
    }
}
