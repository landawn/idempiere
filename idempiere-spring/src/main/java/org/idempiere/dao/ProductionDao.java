package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Production;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface ProductionDao extends CrudDao<Production, Integer, SQLBuilder.PSC, ProductionDao> {

    @Query("SELECT * FROM M_Production WHERE IsActive = 'Y' ORDER BY Created DESC")
    List<Production> findAllActive();

    @Query("SELECT * FROM M_Production WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId")
    Optional<Production> findByDocumentNo(String documentNo, Integer clientId);

    @Query("SELECT * FROM M_Production WHERE DocStatus = :docStatus AND AD_Client_ID = :clientId")
    List<Production> findByDocStatus(String docStatus, Integer clientId);

    @Query("SELECT * FROM M_Production WHERE M_Product_ID = :productId AND IsActive = 'Y'")
    List<Production> findByProduct(Integer productId);

    @Query("SELECT * FROM M_Production WHERE IsCreated = :isCreated AND AD_Client_ID = :clientId")
    List<Production> findByCreated(String isCreated, Integer clientId);
}
