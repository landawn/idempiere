package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.model.CurrencyRate;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Currency Rate entity operations.
 */
@Cache(capacity = 500, evictDelay = 3000)
public interface CurrencyRateDao extends CrudDao<CurrencyRate, Integer, SQLBuilder.PSC, CurrencyRateDao> {

    @Query("SELECT * FROM C_Conversion_Rate WHERE C_Currency_ID = :currencyFrom AND C_Currency_ID_To = :currencyTo AND C_ConversionType_ID = :conversionTypeId AND :convDate BETWEEN ValidFrom AND ValidTo AND IsActive = 'Y' ORDER BY ValidFrom DESC")
    Optional<CurrencyRate> findRate(int currencyFrom, int currencyTo, int conversionTypeId, LocalDateTime convDate);

    @Query("SELECT * FROM C_Conversion_Rate WHERE C_Currency_ID = :currencyFrom AND C_Currency_ID_To = :currencyTo AND IsActive = 'Y' ORDER BY ValidFrom DESC")
    List<CurrencyRate> findRates(int currencyFrom, int currencyTo);

    @Query("SELECT * FROM C_Conversion_Rate WHERE C_ConversionType_ID = :conversionTypeId AND IsActive = 'Y' ORDER BY C_Currency_ID, ValidFrom DESC")
    List<CurrencyRate> findByConversionType(int conversionTypeId);

    @Query("SELECT * FROM C_Conversion_Rate WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY C_Currency_ID, C_Currency_ID_To, ValidFrom DESC")
    List<CurrencyRate> findByClient(int clientId);
}
