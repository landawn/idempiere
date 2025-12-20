package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Dunning;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

@Cache(capacity = 100, evictDelay = 3000)
public interface DunningDao extends CrudDao<Dunning, Integer, SQLBuilder.PSC, DunningDao> {

    @Query("SELECT * FROM C_Dunning WHERE Name = :name AND IsActive = 'Y'")
    Optional<Dunning> findByName(String name);

    @Query("SELECT * FROM C_Dunning WHERE IsActive = 'Y' ORDER BY Name")
    List<Dunning> findAllActive();

    @Query("SELECT * FROM C_Dunning WHERE IsDefault = 'Y' AND IsActive = 'Y'")
    Optional<Dunning> findDefault();

    @Query("SELECT * FROM C_Dunning WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Dunning> findByClient(Integer clientId);

    @Query("SELECT * FROM C_Dunning WHERE IsActive = 'Y' ORDER BY Name")
    List<Dunning> findAll();
}
