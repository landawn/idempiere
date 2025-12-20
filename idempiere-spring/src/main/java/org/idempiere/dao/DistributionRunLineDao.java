package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.DistributionRunLine;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface DistributionRunLineDao extends CrudDao<DistributionRunLine, Integer, SQLBuilder.PSC, DistributionRunLineDao> {

    @Query("SELECT * FROM M_DistributionRunLine WHERE M_DistributionRun_ID = :distributionRunId AND IsActive = 'Y' ORDER BY Line")
    List<DistributionRunLine> findByDistributionRun(Integer distributionRunId);

    @Query("SELECT * FROM M_DistributionRunLine WHERE M_Product_ID = :productId")
    List<DistributionRunLine> findByProduct(Integer productId);
}
