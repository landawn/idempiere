package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.RMA;

/**
 * DAO interface for RMA entity operations.
 */
public interface RMADao extends CrudDao<RMA, Integer, SQLBuilder.PSC, RMADao> {

    @Query("SELECT * FROM M_RMA WHERE IsActive = 'Y' ORDER BY Created DESC")
    List<RMA> findAllActive();

    @Query("SELECT * FROM M_RMA WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId")
    Optional<RMA> findByDocumentNo(String documentNo, Integer clientId);

    @Query("SELECT * FROM M_RMA WHERE C_BPartner_ID = :bpartnerId AND IsSOTrx = :isSOTrx AND IsActive = 'Y' ORDER BY Created DESC")
    List<RMA> findByBPartner(Integer bpartnerId, String isSOTrx);

    @Query("SELECT * FROM M_RMA WHERE DocStatus = :docStatus AND AD_Client_ID = :clientId ORDER BY Created DESC")
    List<RMA> findByDocStatus(String docStatus, Integer clientId);

    @Query("SELECT * FROM M_RMA WHERE M_InOut_ID = :inOutId")
    List<RMA> findByInOut(Integer inOutId);
}
