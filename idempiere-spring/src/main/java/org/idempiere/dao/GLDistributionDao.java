package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.GLDistribution;
import org.idempiere.model.GLDistributionLine;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for GL Distribution entity operations.
 */
@Dao(cache = @Cache(capacity = 200, evictDelay = 3000))
public interface GLDistributionDao extends CrudDao<GLDistribution, Integer, SQLBuilder.NSC, GLDistributionDao> {

    @Select("SELECT * FROM GL_Distribution WHERE C_AcctSchema_ID = :acctSchemaId AND IsActive = 'Y' AND IsValid = 'Y'")
    List<GLDistribution> findValidBySchema(int acctSchemaId);

    @Select("SELECT * FROM GL_Distribution WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<GLDistribution> findByClient(int clientId);

    @Select("SELECT * FROM GL_Distribution WHERE Account_ID = :accountId AND AnyAcct = 'N' AND IsActive = 'Y' AND IsValid = 'Y'")
    List<GLDistribution> findByAccount(int accountId);

    @Select("SELECT * FROM GL_DistributionLine WHERE GL_Distribution_ID = :distributionId ORDER BY Line")
    List<GLDistributionLine> findLinesByDistribution(int distributionId);
}
