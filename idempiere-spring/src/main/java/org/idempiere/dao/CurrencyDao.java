package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Currency;

/**
 * DAO interface for Currency entity operations.
 */
public interface CurrencyDao extends CrudDao<Currency, Integer, SQLBuilder.PSC, CurrencyDao> {

    @Query("SELECT * FROM C_Currency WHERE ISO_Code = :isoCode AND IsActive = 'Y'")
    Optional<Currency> findByIsoCode(String isoCode);

    @Query("SELECT * FROM C_Currency WHERE IsEuro = 'Y' AND IsActive = 'Y'")
    Optional<Currency> findEuro();

    @Query("SELECT * FROM C_Currency WHERE IsEMUMember = 'Y' AND IsActive = 'Y'")
    List<Currency> findAllEmuMembers();

    @Query("SELECT * FROM C_Currency WHERE IsActive = 'Y' ORDER BY ISO_Code")
    List<Currency> findAllActive();
}
