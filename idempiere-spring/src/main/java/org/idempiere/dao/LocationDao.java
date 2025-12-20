package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Location;

/**
 * DAO interface for Location entity operations.
 */
public interface LocationDao extends CrudDao<Location, Integer, SQLBuilder.PSC, LocationDao> {

    @Query("SELECT * FROM C_Location WHERE IsActive = 'Y'")
    List<Location> findAllActive();

    @Query("SELECT * FROM C_Location WHERE C_Country_ID = :countryId AND IsActive = 'Y'")
    List<Location> findByCountryActive(Integer countryId);

    @Query("SELECT * FROM C_Location WHERE City = :city AND IsActive = 'Y'")
    List<Location> findByCityActive(String city);

    @Query("SELECT * FROM C_Location WHERE Postal = :postal AND C_Country_ID = :countryId AND IsActive = 'Y'")
    List<Location> findByPostalAndCountry(String postal, Integer countryId);

    @Query("SELECT * FROM C_Location WHERE City = :city AND C_Country_ID = :countryId AND IsActive = 'Y'")
    List<Location> findByCityAndCountry(String city, Integer countryId);

    @Query("SELECT * FROM C_Location WHERE C_Region_ID = :regionId AND IsActive = 'Y'")
    List<Location> findByRegion(Integer regionId);
}
