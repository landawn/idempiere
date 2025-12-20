package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ShipperDao;
import org.idempiere.dao.FreightCategoryDao;
import org.idempiere.dao.FreightDao;
import org.idempiere.dao.PackageDao;
import org.idempiere.dao.PackageLineDao;
import org.idempiere.model.Shipper;
import org.idempiere.model.FreightCategory;
import org.idempiere.model.Freight;
import org.idempiere.model.Package;
import org.idempiere.model.PackageLine;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Shipping entity operations.
 */
@Service
@Transactional
public class ShippingService {

    private final ShipperDao shipperDao;
    private final FreightCategoryDao freightCategoryDao;
    private final FreightDao freightDao;
    private final PackageDao packageDao;
    private final PackageLineDao packageLineDao;

    public ShippingService(ShipperDao shipperDao, FreightCategoryDao freightCategoryDao,
                           FreightDao freightDao, PackageDao packageDao, PackageLineDao packageLineDao) {
        this.shipperDao = shipperDao;
        this.freightCategoryDao = freightCategoryDao;
        this.freightDao = freightDao;
        this.packageDao = packageDao;
        this.packageLineDao = packageLineDao;
    }

    // Shipper methods
    public Optional<Shipper> findShipperById(Integer id) {
        try { return Optional.ofNullable(shipperDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Shipper> findShippersByClient(Integer clientId) {
        return shipperDao.findByClient(clientId);
    }

    public Optional<Shipper> findShipperByName(String name, Integer clientId) {
        return shipperDao.findByName(name, clientId);
    }

    public List<Shipper> findShippersByBPartner(Integer bpartnerId) {
        return shipperDao.findByBPartner(bpartnerId);
    }

    public Shipper saveShipper(Shipper shipper) {
        try {
            if (shipper.getMShipperId() == null) {
                shipperDao.insert(shipper);
            } else {
                shipperDao.update(shipper);
            }
            return shipper;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // FreightCategory methods
    public Optional<FreightCategory> findFreightCategoryById(Integer id) {
        try { return Optional.ofNullable(freightCategoryDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<FreightCategory> findFreightCategoriesByClient(Integer clientId) {
        return freightCategoryDao.findByClient(clientId);
    }

    public FreightCategory saveFreightCategory(FreightCategory freightCategory) {
        try {
            if (freightCategory.getMFreightCategoryId() == null) {
                freightCategoryDao.insert(freightCategory);
            } else {
                freightCategoryDao.update(freightCategory);
            }
            return freightCategory;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // Freight methods
    public Optional<Freight> findFreightById(Integer id) {
        try { return Optional.ofNullable(freightDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Freight> findFreightByShipper(Integer shipperId) {
        return freightDao.findByShipper(shipperId);
    }

    public List<Freight> findFreightByFreightCategory(Integer freightCategoryId) {
        return freightDao.findByFreightCategory(freightCategoryId);
    }

    public Optional<Freight> findFreight(Integer shipperId, Integer countryId, Integer regionId) {
        return freightDao.findByShipperCountryRegion(shipperId, countryId, regionId);
    }

    public Freight saveFreight(Freight freight) {
        try {
            if (freight.getMFreightId() == null) {
                freightDao.insert(freight);
            } else {
                freightDao.update(freight);
            }
            return freight;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // Package methods
    public Optional<Package> findPackageById(Integer id) {
        try { return Optional.ofNullable(packageDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Package> findPackagesByInOut(Integer inOutId) {
        return packageDao.findByInOut(inOutId);
    }

    public Optional<Package> findPackageByTrackingNo(String trackingNo) {
        return packageDao.findByTrackingNo(trackingNo);
    }

    public Package savePackage(Package pkg) {
        try {
            if (pkg.getMPackageId() == null) {
                packageDao.insert(pkg);
            } else {
                packageDao.update(pkg);
            }
            return pkg;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // PackageLine methods
    public List<PackageLine> findPackageLinesByPackage(Integer packageId) {
        return packageLineDao.findByPackage(packageId);
    }

    public PackageLine savePackageLine(PackageLine line) {
        try {
            if (line.getMPackageLineId() == null) {
                packageLineDao.insert(line);
            } else {
                packageLineDao.update(line);
            }
            return line;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteShipper(Integer id) {
        try { shipperDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean shipperExists(Integer id) {
        try { return shipperDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
