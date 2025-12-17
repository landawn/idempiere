package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.ElementValue;

/**
 * DAO interface for ElementValue (Chart of Accounts) entity operations.
 */
public interface ElementValueDao extends CrudDao<ElementValue, Integer, SQLBuilder.NSC, ElementValueDao> {

    @Select("SELECT * FROM C_ElementValue WHERE Value = :value AND IsActive = 'Y'")
    Optional<ElementValue> findByValue(String value);

    @Select("SELECT * FROM C_ElementValue WHERE C_Element_ID = :elementId AND IsActive = 'Y' ORDER BY Value")
    List<ElementValue> findByElementId(Integer elementId);

    @Select("SELECT * FROM C_ElementValue WHERE AccountType = :accountType AND IsActive = 'Y' ORDER BY Value")
    List<ElementValue> findByAccountType(String accountType);

    @Select("SELECT * FROM C_ElementValue WHERE IsSummary = 'Y' AND IsActive = 'Y' ORDER BY Value")
    List<ElementValue> findAllSummary();

    @Select("SELECT * FROM C_ElementValue WHERE IsSummary = 'N' AND IsActive = 'Y' ORDER BY Value")
    List<ElementValue> findAllDetail();

    @Select("SELECT * FROM C_ElementValue WHERE IsBankAccount = 'Y' AND IsActive = 'Y' ORDER BY Value")
    List<ElementValue> findAllBankAccounts();

    @Select("SELECT * FROM C_ElementValue WHERE IsActive = 'Y' ORDER BY Value")
    List<ElementValue> findAllActive();
}
