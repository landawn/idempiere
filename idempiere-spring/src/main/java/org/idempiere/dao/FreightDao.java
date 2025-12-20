package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Freight;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface FreightDao extends CrudDao<Freight, Integer, SQLBuilder.NSC, FreightDao> {

    @Query("SELECT * FROM M_Freight WHERE M_Shipper_ID = :shipperId AND IsActive = 'Y'")
    List<Freight> findByShipper(Integer shipperId);

    @Query("SELECT * FROM M_Freight WHERE M_FreightCategory_ID = :freightCategoryId AND IsActive = 'Y'")
    List<Freight> findByFreightCategory(Integer freightCategoryId);

    @Query("SELECT * FROM M_Freight WHERE C_Country_ID = :countryId AND IsActive = 'Y'")
    List<Freight> findByCountry(Integer countryId);

    @Query("SELECT * FROM M_Freight WHERE M_Shipper_ID = :shipperId AND C_Country_ID = :countryId AND C_Region_ID = :regionId")
    Optional<Freight> findByShipperCountryRegion(Integer shipperId, Integer countryId, Integer regionId);
}
