package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.CommissionRun;

/**
 * DAO interface for CommissionRun entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface CommissionRunDao extends CrudDao<CommissionRun, Integer, SQLBuilder.PSC, CommissionRunDao> {

    /**
     * Find all commission runs for a commission
     */
    @Query("SELECT * FROM C_CommissionRun WHERE C_Commission_ID = :commissionId AND IsActive = 'Y' ORDER BY StartDate DESC")
    List<CommissionRun> findByCommission(Integer commissionId);

    /**
     * Find commission runs by document number
     */
    @Query("SELECT * FROM C_CommissionRun WHERE DocumentNo = :documentNo AND IsActive = 'Y'")
    Optional<CommissionRun> findByDocumentNo(String documentNo);

    /**
     * Find processed commission runs
     */
    @Query("SELECT * FROM C_CommissionRun WHERE Processed = 'Y' AND IsActive = 'Y' ORDER BY StartDate DESC")
    List<CommissionRun> findProcessed();

    /**
     * Find unprocessed commission runs
     */
    @Query("SELECT * FROM C_CommissionRun WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY StartDate DESC")
    List<CommissionRun> findUnprocessed();

    /**
     * Find commission runs by date range
     */
    @Query("SELECT * FROM C_CommissionRun WHERE StartDate >= :startDate AND StartDate <= :endDate AND IsActive = 'Y' ORDER BY StartDate DESC")
    List<CommissionRun> findByDateRange(LocalDateTime startDate, LocalDateTime endDate);

    /**
     * Find commission runs by client
     */
    @Query("SELECT * FROM C_CommissionRun WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY StartDate DESC")
    List<CommissionRun> findByClient(Integer clientId);
}
