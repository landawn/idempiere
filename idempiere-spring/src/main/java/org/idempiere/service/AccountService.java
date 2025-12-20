package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ElementValueDao;
import org.idempiere.dao.AcctSchemaDao;
import org.idempiere.dao.ValidCombinationDao;
import org.idempiere.model.ElementValue;
import org.idempiere.model.AcctSchema;
import org.idempiere.model.ValidCombination;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Account entity operations.
 */
@Service
@Transactional
public class AccountService {

    private final ElementValueDao elementValueDao;
    private final AcctSchemaDao acctSchemaDao;
    private final ValidCombinationDao validCombinationDao;

    public AccountService(ElementValueDao elementValueDao, AcctSchemaDao acctSchemaDao,
                          ValidCombinationDao validCombinationDao) {
        this.elementValueDao = elementValueDao;
        this.acctSchemaDao = acctSchemaDao;
        this.validCombinationDao = validCombinationDao;
    }

    // ElementValue (Account) methods
    public Optional<ElementValue> findById(Integer id) {
        try {
            return Optional.ofNullable(elementValueDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Error finding element value by id", e);
        }
    }

    public List<ElementValue> findAll() {
        return elementValueDao.findAllActive();
    }

    public List<ElementValue> findByElement(Integer elementId) {
        return elementValueDao.findByElementId(elementId);
    }

    public Optional<ElementValue> findByValue(String value, Integer elementId) {
        return elementValueDao.findByValueAndElement(value, elementId);
    }

    public List<ElementValue> findByAccountType(String accountType, Integer elementId) {
        return elementValueDao.findByAccountTypeAndElement(accountType, elementId);
    }

    public ElementValue save(ElementValue elementValue) {
        try {
            if (elementValue.getCElementValueId() == null) {
                elementValueDao.insert(elementValue);
            } else {
                elementValueDao.update(elementValue);
            }
            return elementValue;
        } catch (SQLException e) {
            throw new RuntimeException("Error saving element value", e);
        }
    }

    // AcctSchema methods
    public Optional<AcctSchema> findAccountSchemaById(Integer id) {
        try {
            return Optional.ofNullable(acctSchemaDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Error finding account schema by id", e);
        }
    }

    public List<AcctSchema> findAllAccountSchemas() {
        return acctSchemaDao.findAllActive();
    }

    public List<AcctSchema> findAccountSchemasByClient(Integer clientId) {
        return acctSchemaDao.findByClientId(clientId);
    }

    public Optional<AcctSchema> findDefaultAccountSchema(Integer clientId) {
        return acctSchemaDao.findDefault(clientId);
    }

    public AcctSchema saveAccountSchema(AcctSchema acctSchema) {
        try {
            if (acctSchema.getCAcctSchemaId() == null) {
                acctSchemaDao.insert(acctSchema);
            } else {
                acctSchemaDao.update(acctSchema);
            }
            return acctSchema;
        } catch (SQLException e) {
            throw new RuntimeException("Error saving account schema", e);
        }
    }

    // ValidCombination methods
    public Optional<ValidCombination> findValidCombinationById(Integer id) {
        try {
            return Optional.ofNullable(validCombinationDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Error finding valid combination by id", e);
        }
    }

    public List<ValidCombination> findValidCombinationsByAccount(Integer accountId) {
        return validCombinationDao.findByAccountId(accountId);
    }

    public ValidCombination saveValidCombination(ValidCombination validCombination) {
        try {
            if (validCombination.getCValidCombinationId() == null) {
                validCombinationDao.insert(validCombination);
            } else {
                validCombinationDao.update(validCombination);
            }
            return validCombination;
        } catch (SQLException e) {
            throw new RuntimeException("Error saving valid combination", e);
        }
    }

    public void delete(Integer id) {
        try {
            elementValueDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Error deleting element value", e);
        }
    }

    public boolean exists(Integer id) {
        try {
            return elementValueDao.exists(id);
        } catch (SQLException e) {
            throw new RuntimeException("Error checking if element value exists", e);
        }
    }
}
