package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.AllocationHdr;

/**
 * DAO interface for AllocationHdr entity operations.
 */
public interface AllocationHdrDao extends CrudDao<AllocationHdr, Integer, SQLBuilder.PSC, AllocationHdrDao> {

    @Query("SELECT * FROM C_AllocationHdr WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId")
    Optional<AllocationHdr> findByDocumentNo(String documentNo, Integer clientId);

    @Query("SELECT * FROM C_AllocationHdr WHERE DocStatus IN ('CO', 'CL') AND AD_Client_ID = :clientId ORDER BY DateAcct DESC")
    List<AllocationHdr> findCompletedByClient(Integer clientId);

    @Query("SELECT * FROM C_AllocationHdr WHERE DateAcct BETWEEN :startDate AND :endDate AND AD_Client_ID = :clientId")
    List<AllocationHdr> findByDateRange(java.time.LocalDateTime startDate, java.time.LocalDateTime endDate, Integer clientId);
}
