package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Window;

import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Dao.Cache;
import com.landawn.abacus.condition.ConditionFactory.CF;
import com.landawn.abacus.jdbc.Jdbc;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface WindowDao extends CrudDao<Window, Integer, SQLBuilder.NSC, WindowDao> {

    @Select("SELECT * FROM AD_Window WHERE Name = :name AND IsActive = 'Y'")
    Optional<Window> findByName(String name);

    @Select("SELECT * FROM AD_Window WHERE IsActive = 'Y' ORDER BY Name")
    List<Window> findAllActive();

    @Select("SELECT * FROM AD_Window WHERE WindowType = :windowType AND IsActive = 'Y' ORDER BY Name")
    List<Window> findByWindowType(String windowType);

    @Select("SELECT * FROM AD_Window WHERE IsSOTrx = :isSOTrx AND IsActive = 'Y' ORDER BY Name")
    List<Window> findBySalesTransaction(String isSOTrx);
}
