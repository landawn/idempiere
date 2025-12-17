package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Commission;

import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Dao.Cache;
import com.landawn.abacus.condition.ConditionFactory.CF;
import com.landawn.abacus.jdbc.Jdbc;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface CommissionDao extends CrudDao<Commission, Integer, SQLBuilder.NSC, CommissionDao> {

    @Select("SELECT * FROM C_Commission WHERE Name = :name AND IsActive = 'Y'")
    Optional<Commission> findByName(String name);

    @Select("SELECT * FROM C_Commission WHERE IsActive = 'Y' ORDER BY Name")
    List<Commission> findAllActive();

    @Select("SELECT * FROM C_Commission WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y'")
    List<Commission> findByBPartner(int bpartnerId);
}
