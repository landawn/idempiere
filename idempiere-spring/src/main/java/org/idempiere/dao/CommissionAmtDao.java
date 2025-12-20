package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.CommissionAmt;

/**
 * DAO interface for CommissionAmt entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface CommissionAmtDao extends CrudDao<CommissionAmt, Integer, SQLBuilder.PSC, CommissionAmtDao> {

    /**
     * Find all commission amounts for a commission run
     */
    @Query("SELECT * FROM C_CommissionAmt WHERE C_CommissionRun_ID = :commissionRunId AND IsActive = 'Y' ORDER BY Created")
    List<CommissionAmt> findByCommissionRun(Integer commissionRunId);

    /**
     * Find commission amounts by commission line
     */
    @Query("SELECT * FROM C_CommissionAmt WHERE C_CommissionLine_ID = :commissionLineId AND IsActive = 'Y' ORDER BY Created")
    List<CommissionAmt> findByCommissionLine(Integer commissionLineId);

    /**
     * Find commission amounts for a specific commission run and line
     */
    @Query("SELECT * FROM C_CommissionAmt WHERE C_CommissionRun_ID = :commissionRunId AND C_CommissionLine_ID = :commissionLineId AND IsActive = 'Y'")
    List<CommissionAmt> findByRunAndLine(Integer commissionRunId, Integer commissionLineId);
}
