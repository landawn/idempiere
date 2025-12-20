package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.BPartnerLocation;

/**
 * DAO interface for BPartnerLocation entity operations.
 */
public interface BPartnerLocationDao extends CrudDao<BPartnerLocation, Integer, SQLBuilder.PSC, BPartnerLocationDao> {

    @Query("SELECT * FROM C_BPartner_Location WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y' ORDER BY Name")
    List<BPartnerLocation> findByBPartner(Integer bpartnerId);

    @Query("SELECT * FROM C_BPartner_Location WHERE C_BPartner_ID = :bpartnerId AND IsBillTo = 'Y' AND IsActive = 'Y'")
    List<BPartnerLocation> findBillToByBPartner(Integer bpartnerId);

    @Query("SELECT * FROM C_BPartner_Location WHERE C_BPartner_ID = :bpartnerId AND IsShipTo = 'Y' AND IsActive = 'Y'")
    List<BPartnerLocation> findShipToByBPartner(Integer bpartnerId);

    @Query("SELECT * FROM C_BPartner_Location WHERE Name = :name AND C_BPartner_ID = :bpartnerId AND IsActive = 'Y'")
    Optional<BPartnerLocation> findByNameAndBPartner(String name, Integer bpartnerId);

    /**
     * Find ship-to location for a business partner
     */
    @Query("SELECT * FROM C_BPartner_Location WHERE C_BPartner_ID = :bpartnerId AND IsShipTo = 'Y' AND IsActive = 'Y' ORDER BY Created DESC LIMIT 1")
    Optional<BPartnerLocation> findShipTo(Integer bpartnerId);

    /**
     * Find bill-to location for a business partner
     */
    @Query("SELECT * FROM C_BPartner_Location WHERE C_BPartner_ID = :bpartnerId AND IsBillTo = 'Y' AND IsActive = 'Y' ORDER BY Created DESC LIMIT 1")
    Optional<BPartnerLocation> findBillTo(Integer bpartnerId);
}
