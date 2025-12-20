package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.BPBankAccount;

/**
 * DAO interface for BPBankAccount entity operations.
 */
public interface BPBankAccountDao extends CrudDao<BPBankAccount, Integer, SQLBuilder.PSC, BPBankAccountDao> {

    @Query("SELECT * FROM C_BP_BankAccount WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y'")
    List<BPBankAccount> findByBPartner(Integer bpartnerId);

    @Query("SELECT * FROM C_BP_BankAccount WHERE AccountNo = :accountNo AND C_BPartner_ID = :bpartnerId AND IsActive = 'Y'")
    Optional<BPBankAccount> findByAccountNoAndBPartner(String accountNo, Integer bpartnerId);

    @Query("SELECT * FROM C_BP_BankAccount WHERE IsACH = 'Y' AND C_BPartner_ID = :bpartnerId AND IsActive = 'Y'")
    List<BPBankAccount> findACHByBPartner(Integer bpartnerId);

    /**
     * Find default bank account for a business partner
     */
    @Query("SELECT * FROM C_BP_BankAccount WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y' ORDER BY Created DESC LIMIT 1")
    Optional<BPBankAccount> findDefault(Integer bpartnerId);
}
