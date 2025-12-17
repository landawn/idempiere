package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.Currency;

/**
 * DAO interface for Currency entity operations.
 */
public interface CurrencyDao extends CrudDao<Currency, Integer, SQLBuilder.NSC, CurrencyDao> {

    @Select("SELECT * FROM C_Currency WHERE ISO_Code = :isoCode AND IsActive = 'Y'")
    Optional<Currency> findByIsoCode(String isoCode);

    @Select("SELECT * FROM C_Currency WHERE IsEuro = 'Y' AND IsActive = 'Y'")
    Optional<Currency> findEuro();

    @Select("SELECT * FROM C_Currency WHERE IsEMUMember = 'Y' AND IsActive = 'Y'")
    List<Currency> findAllEmuMembers();

    @Select("SELECT * FROM C_Currency WHERE IsActive = 'Y' ORDER BY ISO_Code")
    List<Currency> findAllActive();
}
