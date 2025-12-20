package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.DistributionListLine;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface DistributionListLineDao extends CrudDao<DistributionListLine, Integer, SQLBuilder.PSC, DistributionListLineDao> {

    @Query("SELECT * FROM M_DistributionListLine WHERE M_DistributionList_ID = :distributionListId AND IsActive = 'Y'")
    List<DistributionListLine> findByDistributionList(Integer distributionListId);

    @Query("SELECT * FROM M_DistributionListLine WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y'")
    List<DistributionListLine> findByBPartner(Integer bpartnerId);
}
