package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.City;

/**
 * DAO interface for City entity operations.
 */
public interface CityDao extends CrudDao<City, Integer, SQLBuilder.PSC, CityDao> {

    @Query("SELECT * FROM C_City WHERE C_Region_ID = :regionId AND IsActive = 'Y' ORDER BY Name")
    List<City> findByRegion(Integer regionId);

    @Query("SELECT * FROM C_City WHERE C_Country_ID = :countryId AND IsActive = 'Y' ORDER BY Name")
    List<City> findByCountry(Integer countryId);

    @Query("SELECT * FROM C_City WHERE Name = :name AND C_Country_ID = :countryId AND IsActive = 'Y'")
    Optional<City> findByNameAndCountry(String name, Integer countryId);

    @Query("SELECT * FROM C_City WHERE Postal = :postal AND IsActive = 'Y'")
    List<City> findByPostal(String postal);
}
