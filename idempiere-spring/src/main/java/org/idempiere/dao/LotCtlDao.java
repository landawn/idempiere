package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.LotCtl;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface LotCtlDao extends CrudDao<LotCtl, Integer, SQLBuilder.PSC, LotCtlDao> {

    @Query("SELECT * FROM M_LotCtl WHERE AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<LotCtl> findByClient(Integer clientId);

    @Query("SELECT * FROM M_LotCtl WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<LotCtl> findByName(String name, Integer clientId);
}
