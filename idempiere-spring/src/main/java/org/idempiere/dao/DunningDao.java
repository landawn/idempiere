package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Dunning;

import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Dao.Cache;
import com.landawn.abacus.condition.ConditionFactory.CF;
import com.landawn.abacus.jdbc.Jdbc;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface DunningDao extends CrudDao<Dunning, Integer, SQLBuilder.NSC, DunningDao> {

    @Select("SELECT * FROM C_Dunning WHERE Name = :name AND IsActive = 'Y'")
    Optional<Dunning> findByName(String name);

    @Select("SELECT * FROM C_Dunning WHERE IsActive = 'Y' ORDER BY Name")
    List<Dunning> findAllActive();

    @Select("SELECT * FROM C_Dunning WHERE IsDefault = 'Y' AND IsActive = 'Y'")
    Optional<Dunning> findDefault();
}
