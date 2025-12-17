package org.idempiere.service;

import java.util.List;
import java.util.Optional;

import org.idempiere.dao.AssetDao;
import org.idempiere.model.Asset;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Asset business operations.
 */
@Service
@Transactional
public class AssetService {

    private final AssetDao assetDao;

    public AssetService(AssetDao assetDao) {
        this.assetDao = assetDao;
    }

    /**
     * Find asset by ID.
     */
    public Optional<Asset> findById(int assetId) {
        return assetDao.findById(assetId);
    }

    /**
     * Find asset by value code.
     */
    public Optional<Asset> findByValue(String value, int clientId) {
        return assetDao.findByValue(value, clientId);
    }

    /**
     * Find asset by serial number.
     */
    public Optional<Asset> findBySerialNo(String serNo) {
        return assetDao.findBySerialNo(serNo);
    }

    /**
     * Search assets by name pattern.
     */
    public List<Asset> searchByName(String name, int clientId) {
        return assetDao.searchByName("%" + name + "%", clientId);
    }

    /**
     * Find all assets for a client and organization.
     */
    public List<Asset> findByClientAndOrg(int clientId, int orgId) {
        return assetDao.findByClientAndOrg(clientId, orgId);
    }

    /**
     * Find all assets in an asset group.
     */
    public List<Asset> findByAssetGroup(int assetGroupId) {
        return assetDao.findByAssetGroup(assetGroupId);
    }

    /**
     * Find all assets owned by a business partner.
     */
    public List<Asset> findByBPartner(int bPartnerId) {
        return assetDao.findByBPartner(bPartnerId);
    }

    /**
     * Find all assets for a product.
     */
    public List<Asset> findByProduct(int productId) {
        return assetDao.findByProduct(productId);
    }

    /**
     * Find all depreciable assets.
     */
    public List<Asset> findDepreciableAssets() {
        return assetDao.findDepreciableAssets();
    }

    /**
     * Find all owned assets.
     */
    public List<Asset> findOwnedAssets() {
        return assetDao.findOwnedAssets();
    }

    /**
     * Find all assets by status.
     */
    public List<Asset> findByStatus(String status) {
        return assetDao.findByStatus(status);
    }

    /**
     * Find all active assets.
     */
    public List<Asset> findAllActive() {
        return assetDao.findAllActive();
    }

    /**
     * Save an asset.
     */
    public Asset save(Asset asset) {
        if (asset.getAAssetId() == null || asset.getAAssetId() == 0) {
            assetDao.insert(asset);
        } else {
            assetDao.update(asset);
        }
        return asset;
    }

    /**
     * Delete an asset.
     */
    public void delete(int assetId) {
        assetDao.deleteById(assetId);
    }

    /**
     * Count all assets.
     */
    public long count() {
        return assetDao.count();
    }
}
