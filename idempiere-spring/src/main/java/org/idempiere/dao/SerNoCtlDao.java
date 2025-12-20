package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.SerNoCtl;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface SerNoCtlDao extends CrudDao<SerNoCtl, Integer, SQLBuilder.PSC, SerNoCtlDao> {

    @Query("SELECT * FROM M_SerNoCtl WHERE AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<SerNoCtl> findByClient(Integer clientId);

    @Query("SELECT * FROM M_SerNoCtl WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<SerNoCtl> findByName(String name, Integer clientId);
}
