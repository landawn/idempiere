package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Role;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

@Cache(capacity = 100, evictDelay = 3000)
public interface RoleDao extends CrudDao<Role, Integer, SQLBuilder.PSC, RoleDao> {

    @Query("SELECT * FROM AD_Role WHERE Name = :name AND IsActive = 'Y'")
    Optional<Role> findByName(String name);

    @Query("SELECT * FROM AD_Role WHERE IsActive = 'Y' ORDER BY Name")
    List<Role> findAllActive();

    @Query("SELECT * FROM AD_Role WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Role> findByClient(int clientId);
}
