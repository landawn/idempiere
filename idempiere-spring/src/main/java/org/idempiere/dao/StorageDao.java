package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Storage;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface StorageDao extends CrudDao<Storage, Integer, SQLBuilder.PSC, StorageDao> {

    @Query("SELECT * FROM M_Storage WHERE M_Product_ID = :productId AND IsActive = 'Y'")
    List<Storage> findByProduct(Integer productId);

    @Query("SELECT * FROM M_Storage WHERE M_Locator_ID = :locatorId AND IsActive = 'Y'")
    List<Storage> findByLocator(Integer locatorId);

    @Query("SELECT * FROM M_Storage WHERE M_Product_ID = :productId AND M_Locator_ID = :locatorId AND M_AttributeSetInstance_ID = :asiId")
    Optional<Storage> findByProductLocatorASI(Integer productId, Integer locatorId, Integer asiId);

    @Query("SELECT * FROM M_Storage WHERE M_Product_ID = :productId AND QtyOnHand > 0")
    List<Storage> findAvailableByProduct(Integer productId);
}
