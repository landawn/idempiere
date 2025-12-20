package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.ElementValue;

/**
 * DAO interface for ElementValue (Chart of Accounts) entity operations.
 */
public interface ElementValueDao extends CrudDao<ElementValue, Integer, SQLBuilder.NSC, ElementValueDao> {

    @Query("SELECT * FROM C_ElementValue WHERE Value = :value AND IsActive = 'Y'")
    Optional<ElementValue> findByValue(String value);

    @Query("SELECT * FROM C_ElementValue WHERE Value = :value AND C_Element_ID = :elementId AND IsActive = 'Y'")
    Optional<ElementValue> findByValueAndElement(String value, Integer elementId);

    @Query("SELECT * FROM C_ElementValue WHERE C_Element_ID = :elementId AND IsActive = 'Y' ORDER BY Value")
    List<ElementValue> findByElementId(Integer elementId);

    @Query("SELECT * FROM C_ElementValue WHERE AccountType = :accountType AND IsActive = 'Y' ORDER BY Value")
    List<ElementValue> findByAccountType(String accountType);

    @Query("SELECT * FROM C_ElementValue WHERE AccountType = :accountType AND C_Element_ID = :elementId AND IsActive = 'Y' ORDER BY Value")
    List<ElementValue> findByAccountTypeAndElement(String accountType, Integer elementId);

    @Query("SELECT * FROM C_ElementValue WHERE IsSummary = 'Y' AND IsActive = 'Y' ORDER BY Value")
    List<ElementValue> findAllSummary();

    @Query("SELECT * FROM C_ElementValue WHERE IsSummary = 'N' AND IsActive = 'Y' ORDER BY Value")
    List<ElementValue> findAllDetail();

    @Query("SELECT * FROM C_ElementValue WHERE IsBankAccount = 'Y' AND IsActive = 'Y' ORDER BY Value")
    List<ElementValue> findAllBankAccounts();

    @Query("SELECT * FROM C_ElementValue WHERE IsActive = 'Y' ORDER BY Value")
    List<ElementValue> findAllActive();
}
