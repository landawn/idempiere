package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Commission;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

@Cache(capacity = 100, evictDelay = 3000)
public interface CommissionDao extends CrudDao<Commission, Integer, SQLBuilder.PSC, CommissionDao> {

    @Query("SELECT * FROM C_Commission WHERE Name = :name AND IsActive = 'Y'")
    Optional<Commission> findByName(String name);

    @Query("SELECT * FROM C_Commission WHERE IsActive = 'Y' ORDER BY Name")
    List<Commission> findAllActive();

    @Query("SELECT * FROM C_Commission WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y'")
    List<Commission> findByBPartner(int bpartnerId);
}
