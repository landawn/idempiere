package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.idempiere.model.AcctFact;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Accounting Fact entity operations.
 */
@Cache(capacity = 2000, evictDelay = 3000)
public interface AcctFactDao extends CrudDao<AcctFact, Integer, SQLBuilder.PSC, AcctFactDao> {

    @Query("SELECT * FROM Fact_Acct WHERE AD_Table_ID = :tableId AND Record_ID = :recordId ORDER BY Fact_Acct_ID")
    List<AcctFact> findByDocument(int tableId, int recordId);

    @Query("SELECT * FROM Fact_Acct WHERE Account_ID = :accountId AND DateAcct BETWEEN :dateFrom AND :dateTo ORDER BY DateAcct, Fact_Acct_ID")
    List<AcctFact> findByAccountAndDateRange(int accountId, LocalDateTime dateFrom, LocalDateTime dateTo);

    @Query("SELECT * FROM Fact_Acct WHERE C_AcctSchema_ID = :acctSchemaId AND C_Period_ID = :periodId ORDER BY DateAcct, Fact_Acct_ID")
    List<AcctFact> findBySchemaAndPeriod(int acctSchemaId, int periodId);

    @Query("SELECT * FROM Fact_Acct WHERE C_BPartner_ID = :bPartnerId AND DateAcct BETWEEN :dateFrom AND :dateTo ORDER BY DateAcct, Fact_Acct_ID")
    List<AcctFact> findByBPartnerAndDateRange(int bPartnerId, LocalDateTime dateFrom, LocalDateTime dateTo);

    @Query("SELECT * FROM Fact_Acct WHERE C_Project_ID = :projectId ORDER BY DateAcct, Fact_Acct_ID")
    List<AcctFact> findByProject(int projectId);

    @Query("SELECT * FROM Fact_Acct WHERE PostingType = :postingType AND C_AcctSchema_ID = :acctSchemaId AND DateAcct BETWEEN :dateFrom AND :dateTo")
    List<AcctFact> findByPostingType(String postingType, int acctSchemaId, LocalDateTime dateFrom, LocalDateTime dateTo);
}
