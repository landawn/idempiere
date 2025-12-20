package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.LocationDao;
import org.idempiere.dao.CountryDao;
import org.idempiere.dao.RegionDao;
import org.idempiere.dao.CityDao;
import org.idempiere.model.Location;
import org.idempiere.model.Country;
import org.idempiere.model.Region;
import org.idempiere.model.City;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Location entity operations.
 */
@Service
@Transactional
public class LocationService {

    private final LocationDao locationDao;
    private final CountryDao countryDao;
    private final RegionDao regionDao;
    private final CityDao cityDao;

    public LocationService(LocationDao locationDao, CountryDao countryDao, RegionDao regionDao, CityDao cityDao) {
        this.locationDao = locationDao;
        this.countryDao = countryDao;
        this.regionDao = regionDao;
        this.cityDao = cityDao;
    }

    public Optional<Location> findById(Integer id) {
        try { return Optional.ofNullable(locationDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Location> findAll() {
        return locationDao.findAllActive();
    }

    public List<Location> findByCountry(Integer countryId) {
        return locationDao.findByCountryActive(countryId);
    }

    public List<Location> findByRegion(Integer regionId) {
        return locationDao.findByRegion(regionId);
    }

    public List<Location> findByCity(String city) {
        return locationDao.findByCityActive(city);
    }

    public Optional<Country> findCountryById(Integer id) {
        try { return Optional.ofNullable(countryDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Country> findAllCountries() {
        return countryDao.findAllActive();
    }

    public Optional<Country> findCountryByCode(String countryCode) {
        return countryDao.findByCountryCode(countryCode);
    }

    public Optional<Country> findDefaultCountry() {
        return countryDao.findDefault();
    }

    public List<Region> findRegionsByCountry(Integer countryId) {
        return regionDao.findByCountry(countryId);
    }

    public Optional<Region> findRegionByName(String name, Integer countryId) {
        return regionDao.findByNameAndCountry(name, countryId);
    }

    public List<City> findCitiesByRegion(Integer regionId) {
        return cityDao.findByRegion(regionId);
    }

    public List<City> findCitiesByCountry(Integer countryId) {
        return cityDao.findByCountry(countryId);
    }

    public Location save(Location location) {
        try {
            if (location.getCLocationId() == null) {
                locationDao.insert(location);
            } else {
                locationDao.update(location);
            }
            return location;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { locationDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return locationDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
