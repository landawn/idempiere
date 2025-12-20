package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.DistributionRun;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface DistributionRunDao extends CrudDao<DistributionRun, Integer, SQLBuilder.PSC, DistributionRunDao> {

    @Query("SELECT * FROM M_DistributionRun WHERE AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<DistributionRun> findByClient(Integer clientId);

    @Query("SELECT * FROM M_DistributionRun WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<DistributionRun> findByName(String name, Integer clientId);
}
