package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Role;

import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Dao.Cache;
import com.landawn.abacus.condition.ConditionFactory.CF;
import com.landawn.abacus.jdbc.Jdbc;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface RoleDao extends CrudDao<Role, Integer, SQLBuilder.NSC, RoleDao> {

    @Select("SELECT * FROM AD_Role WHERE Name = :name AND IsActive = 'Y'")
    Optional<Role> findByName(String name);

    @Select("SELECT * FROM AD_Role WHERE IsActive = 'Y' ORDER BY Name")
    List<Role> findAllActive();

    @Select("SELECT * FROM AD_Role WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Role> findByClient(int clientId);
}
