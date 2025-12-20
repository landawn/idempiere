package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Shipper;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface ShipperDao extends CrudDao<Shipper, Integer, SQLBuilder.PSC, ShipperDao> {

    @Query("SELECT * FROM M_Shipper WHERE AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<Shipper> findByClient(Integer clientId);

    @Query("SELECT * FROM M_Shipper WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Shipper> findByName(String name, Integer clientId);

    @Query("SELECT * FROM M_Shipper WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y'")
    List<Shipper> findByBPartner(Integer bpartnerId);
}
