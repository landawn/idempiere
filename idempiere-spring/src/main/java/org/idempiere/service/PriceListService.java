package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.PriceListDao;
import org.idempiere.dao.PriceListVersionDao;
import org.idempiere.dao.ProductPriceDao;
import org.idempiere.model.PriceList;
import org.idempiere.model.PriceListVersion;
import org.idempiere.model.ProductPrice;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * Service class for PriceList entity operations.
 */
@Service
@Transactional
public class PriceListService {

    private final PriceListDao priceListDao;
    private final PriceListVersionDao priceListVersionDao;
    private final ProductPriceDao productPriceDao;

    public PriceListService(PriceListDao priceListDao, PriceListVersionDao priceListVersionDao, ProductPriceDao productPriceDao) {
        this.priceListDao = priceListDao;
        this.priceListVersionDao = priceListVersionDao;
        this.productPriceDao = productPriceDao;
    }

    public Optional<PriceList> findById(Integer id) {
        try { return Optional.ofNullable(priceListDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<PriceList> findAll() {
        return priceListDao.findAllActive();
    }

    public Optional<PriceList> findDefault(String isSOPriceList, Integer clientId) {
        return priceListDao.findDefault(isSOPriceList, clientId);
    }

    public List<PriceList> findBySOPriceList(String isSOPriceList, Integer clientId) {
        return priceListDao.findBySOPriceList(isSOPriceList, clientId);
    }

    public List<PriceListVersion> findVersionsByPriceList(Integer priceListId) {
        return priceListVersionDao.findByPriceList(priceListId);
    }

    public Optional<PriceListVersion> findValidVersion(Integer priceListId, LocalDateTime validDate) {
        return priceListVersionDao.findValidVersion(priceListId, validDate);
    }

    public Optional<ProductPrice> findProductPrice(Integer productId, Integer priceListVersionId) {
        return productPriceDao.findByProductAndVersion(productId, priceListVersionId);
    }

    public List<ProductPrice> findPricesByVersion(Integer priceListVersionId) {
        return productPriceDao.findByPriceListVersion(priceListVersionId);
    }

    public PriceList save(PriceList priceList) {
        try {
            if (priceList.getMPriceListId() == null) {
                priceListDao.insert(priceList);
            } else {
                priceListDao.update(priceList);
            }
            return priceList;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { priceListDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return priceListDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
