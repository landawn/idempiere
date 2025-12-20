package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Region;

/**
 * DAO interface for Region entity operations.
 */
public interface RegionDao extends CrudDao<Region, Integer, SQLBuilder.PSC, RegionDao> {

    @Query("SELECT * FROM C_Region WHERE C_Country_ID = :countryId AND IsActive = 'Y' ORDER BY Name")
    List<Region> findByCountry(Integer countryId);

    @Query("SELECT * FROM C_Region WHERE Name = :name AND C_Country_ID = :countryId AND IsActive = 'Y'")
    Optional<Region> findByNameAndCountry(String name, Integer countryId);

    @Query("SELECT * FROM C_Region WHERE IsDefault = 'Y' AND C_Country_ID = :countryId")
    Optional<Region> findDefaultByCountry(Integer countryId);
}
