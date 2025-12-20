package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Lot;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface LotDao extends CrudDao<Lot, Integer, SQLBuilder.PSC, LotDao> {

    @Query("SELECT * FROM M_Lot WHERE M_Product_ID = :productId AND IsActive = 'Y'")
    List<Lot> findByProduct(Integer productId);

    @Query("SELECT * FROM M_Lot WHERE Name = :name AND M_Product_ID = :productId AND IsActive = 'Y'")
    Optional<Lot> findByName(String name, Integer productId);

    @Query("SELECT * FROM M_Lot WHERE AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<Lot> findByClient(Integer clientId);
}
