package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.BankDao;
import org.idempiere.dao.BankAccountDao;
import org.idempiere.dao.BankStatementDao;
import org.idempiere.dao.BankStatementLineDao;
import org.idempiere.model.Bank;
import org.idempiere.model.BankAccount;
import org.idempiere.model.BankStatement;
import org.idempiere.model.BankStatementLine;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Bank entity operations.
 */
@Service
@Transactional
public class BankService {

    private final BankDao bankDao;
    private final BankAccountDao bankAccountDao;
    private final BankStatementDao bankStatementDao;
    private final BankStatementLineDao bankStatementLineDao;

    public BankService(BankDao bankDao, BankAccountDao bankAccountDao,
                       BankStatementDao bankStatementDao, BankStatementLineDao bankStatementLineDao) {
        this.bankDao = bankDao;
        this.bankAccountDao = bankAccountDao;
        this.bankStatementDao = bankStatementDao;
        this.bankStatementLineDao = bankStatementLineDao;
    }

    // Bank methods
    public Optional<Bank> findById(Integer id) {
        try {
            return Optional.ofNullable(bankDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<Bank> findAll() {
        return bankDao.findAllActive();
    }

    public List<Bank> findByClient(Integer clientId) {
        return bankDao.findByClient(clientId);
    }

    public Optional<Bank> findByRoutingNo(String routingNo) {
        return bankDao.findByRoutingNo(routingNo);
    }

    public Bank save(Bank bank) {
        try {
            if (bank.getCBankId() == null) {
                bankDao.insert(bank);
            } else {
                bankDao.update(bank);
            }
            return bank;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // BankAccount methods
    public Optional<BankAccount> findBankAccountById(Integer id) {
        try {
            return Optional.ofNullable(bankAccountDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<BankAccount> findBankAccountsByBank(Integer bankId) {
        return bankAccountDao.findByBankId(bankId);
    }

    public List<BankAccount> findBankAccountsByCurrency(Integer currencyId) {
        return bankAccountDao.findByCurrencyId(currencyId);
    }

    public Optional<BankAccount> findDefaultBankAccount() {
        return bankAccountDao.findDefault();
    }

    public BankAccount saveBankAccount(BankAccount bankAccount) {
        try {
            if (bankAccount.getCBankAccountId() == null) {
                bankAccountDao.insert(bankAccount);
            } else {
                bankAccountDao.update(bankAccount);
            }
            return bankAccount;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // BankStatement methods
    public Optional<BankStatement> findBankStatementById(Integer id) {
        try {
            return Optional.ofNullable(bankStatementDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<BankStatement> findBankStatementsByBankAccount(Integer bankAccountId) {
        return bankStatementDao.findByBankAccountId(bankAccountId);
    }

    public List<BankStatement> findBankStatementsByDocStatus(String docStatus) {
        return bankStatementDao.findByDocStatus(docStatus);
    }

    public BankStatement saveBankStatement(BankStatement bankStatement) {
        try {
            if (bankStatement.getCBankStatementId() == null) {
                bankStatementDao.insert(bankStatement);
            } else {
                bankStatementDao.update(bankStatement);
            }
            return bankStatement;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // BankStatementLine methods
    public List<BankStatementLine> findLinesByBankStatement(Integer bankStatementId) {
        return bankStatementLineDao.findByBankStatementId(bankStatementId);
    }

    public BankStatementLine saveBankStatementLine(BankStatementLine line) {
        try {
            if (line.getCBankStatementLineId() == null) {
                bankStatementLineDao.insert(line);
            } else {
                bankStatementLineDao.update(line);
            }
            return line;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(Integer id) {
        try {
            bankDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    public boolean exists(Integer id) {
        try {
            return bankDao.exists(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to check exists", e);
        }
    }
}
