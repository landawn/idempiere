package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.AssetGroupDao;
import org.idempiere.model.AssetGroup;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for AssetGroup entity operations.
 */
@Service
@Transactional
public class AssetGroupService {

    private final AssetGroupDao assetGroupDao;

    public AssetGroupService(AssetGroupDao assetGroupDao) {
        this.assetGroupDao = assetGroupDao;
    }

    public Optional<AssetGroup> findById(Integer id) {
        try { return Optional.ofNullable(assetGroupDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<AssetGroup> findAll() {
        return assetGroupDao.findAll();
    }

    public List<AssetGroup> findByClient(Integer clientId) {
        return assetGroupDao.findByClient(clientId);
    }

    public Optional<AssetGroup> findByName(String name, Integer clientId) {
        return assetGroupDao.findByName(name, clientId);
    }

    public Optional<AssetGroup> findDefault(Integer clientId) {
        return assetGroupDao.findDefault(clientId);
    }

    public AssetGroup save(AssetGroup assetGroup) {
        try {
            if (assetGroup.getAAssetGroupId() == null) {
                assetGroupDao.insert(assetGroup);
            } else {
                assetGroupDao.update(assetGroup);
            }
            return assetGroup;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { assetGroupDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return assetGroupDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
