package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.DiscountSchema;

/**
 * DAO interface for DiscountSchema entity operations.
 */
public interface DiscountSchemaDao extends CrudDao<DiscountSchema, Integer, SQLBuilder.PSC, DiscountSchemaDao> {

    @Query("SELECT * FROM M_DiscountSchema WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<DiscountSchema> findByNameAndClient(String name, Integer clientId);

    @Query("SELECT * FROM M_DiscountSchema WHERE DiscountType = :discountType AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<DiscountSchema> findByDiscountType(String discountType, Integer clientId);

    @Query("SELECT * FROM M_DiscountSchema WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<DiscountSchema> findByClient(Integer clientId);

    @Query("SELECT * FROM M_DiscountSchema WHERE IsActive = 'Y' ORDER BY Name")
    List<DiscountSchema> findAll();
}
