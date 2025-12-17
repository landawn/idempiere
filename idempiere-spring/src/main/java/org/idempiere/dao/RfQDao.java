package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.RfQ;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Request for Quotation operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface RfQDao extends CrudDao<RfQ, Integer, SQLBuilder.NSC, RfQDao> {

    @Select("SELECT * FROM C_RfQ WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<RfQ> findByDocumentNo(String documentNo, int clientId);

    @Select("SELECT * FROM C_RfQ WHERE AD_Client_ID = :clientId AND AD_Org_ID = :orgId AND IsActive = 'Y' ORDER BY DocumentNo DESC")
    List<RfQ> findByClientAndOrg(int clientId, int orgId);

    @Select("SELECT * FROM C_RfQ WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY DocumentNo DESC")
    List<RfQ> findByBPartner(int bPartnerId);

    @Select("SELECT * FROM C_RfQ WHERE SalesRep_ID = :salesRepId AND IsActive = 'Y' ORDER BY DocumentNo DESC")
    List<RfQ> findBySalesRep(int salesRepId);

    @Select("SELECT * FROM C_RfQ WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY DateResponse")
    List<RfQ> findOpenRfQs();

    @Select("SELECT * FROM C_RfQ WHERE C_RfQ_Topic_ID = :topicId AND IsActive = 'Y' ORDER BY DocumentNo DESC")
    List<RfQ> findByTopic(int topicId);
}
