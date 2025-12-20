package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.BankAccount;

/**
 * DAO interface for BankAccount entity operations.
 */
public interface BankAccountDao extends CrudDao<BankAccount, Integer, SQLBuilder.PSC, BankAccountDao> {

    @Query("SELECT * FROM C_BankAccount WHERE AccountNo = :accountNo AND IsActive = 'Y'")
    Optional<BankAccount> findByAccountNo(String accountNo);

    @Query("SELECT * FROM C_BankAccount WHERE IBAN = :iban AND IsActive = 'Y'")
    Optional<BankAccount> findByIban(String iban);

    @Query("SELECT * FROM C_BankAccount WHERE C_Bank_ID = :bankId AND IsActive = 'Y' ORDER BY AccountNo")
    List<BankAccount> findByBankId(Integer bankId);

    @Query("SELECT * FROM C_BankAccount WHERE C_Currency_ID = :currencyId AND IsActive = 'Y'")
    List<BankAccount> findByCurrencyId(Integer currencyId);

    @Query("SELECT * FROM C_BankAccount WHERE IsDefault = 'Y' AND IsActive = 'Y'")
    Optional<BankAccount> findDefault();

    @Query("SELECT * FROM C_BankAccount WHERE IsActive = 'Y' ORDER BY AccountNo")
    List<BankAccount> findAllActive();
}
