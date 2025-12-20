package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Country;

/**
 * DAO interface for Country entity operations.
 */
public interface CountryDao extends CrudDao<Country, Integer, SQLBuilder.PSC, CountryDao> {

    @Query("SELECT * FROM C_Country WHERE CountryCode = :countryCode AND IsActive = 'Y'")
    Optional<Country> findByCountryCode(String countryCode);

    @Query("SELECT * FROM C_Country WHERE Name = :name AND IsActive = 'Y'")
    Optional<Country> findByName(String name);

    @Query("SELECT * FROM C_Country WHERE IsDefault = 'Y'")
    Optional<Country> findDefault();

    @Query("SELECT * FROM C_Country WHERE IsActive = 'Y' ORDER BY Name")
    List<Country> findAllActive();

    @Query("SELECT * FROM C_Country WHERE HasRegion = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Country> findWithRegions();
}
