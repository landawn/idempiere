package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.DistributionList;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Distribution List operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface DistributionListDao extends CrudDao<DistributionList, Integer, SQLBuilder.NSC, DistributionListDao> {

    @Select("SELECT * FROM M_DistributionList WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<DistributionList> findByName(String name, int clientId);

    @Select("SELECT * FROM M_DistributionList WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<DistributionList> findByClient(int clientId);

    @Select("SELECT * FROM M_DistributionList WHERE IsActive = 'Y' ORDER BY Name")
    List<DistributionList> findAllActive();
}
