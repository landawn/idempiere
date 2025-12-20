package org.idempiere.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.CurrencyRateDao;
import org.idempiere.dao.CurrencyDao;
import org.idempiere.model.CurrencyRate;
import org.idempiere.model.Currency;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for Currency Conversion operations.
 */
@Service
@Transactional(readOnly = true)
public class CurrencyService {

    private final CurrencyRateDao currencyRateDao;
    private final CurrencyDao currencyDao;

    public CurrencyService(CurrencyRateDao currencyRateDao, CurrencyDao currencyDao) {
        this.currencyRateDao = currencyRateDao;
        this.currencyDao = currencyDao;
    }

    /**
     * Get currency by ID.
     */
    public Optional<Currency> getCurrency(int currencyId) {
        try {
            return Optional.ofNullable(currencyDao.gett(currencyId));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    /**
     * Get conversion rate between two currencies.
     */
    public Optional<BigDecimal> getRate(int currencyFrom, int currencyTo, int conversionTypeId, LocalDateTime convDate) {
        if (currencyFrom == currencyTo) {
            return Optional.of(BigDecimal.ONE);
        }

        // Try direct rate
        Optional<CurrencyRate> rate = currencyRateDao.findRate(currencyFrom, currencyTo, conversionTypeId, convDate);
        if (rate.isPresent()) {
            return Optional.of(rate.get().getMultiplyRate());
        }

        // Try inverse rate
        rate = currencyRateDao.findRate(currencyTo, currencyFrom, conversionTypeId, convDate);
        if (rate.isPresent() && rate.get().getDivideRate() != null && rate.get().getDivideRate().compareTo(BigDecimal.ZERO) != 0) {
            return Optional.of(BigDecimal.ONE.divide(rate.get().getDivideRate(), 12, RoundingMode.HALF_UP));
        }

        return Optional.empty();
    }

    /**
     * Convert amount from one currency to another.
     */
    public Optional<BigDecimal> convert(BigDecimal amount, int currencyFrom, int currencyTo, int conversionTypeId, LocalDateTime convDate) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) == 0) {
            return Optional.of(BigDecimal.ZERO);
        }

        if (currencyFrom == currencyTo) {
            return Optional.of(amount);
        }

        Optional<BigDecimal> rate = getRate(currencyFrom, currencyTo, conversionTypeId, convDate);
        if (rate.isPresent()) {
            return Optional.of(amount.multiply(rate.get()).setScale(2, RoundingMode.HALF_UP));
        }

        return Optional.empty();
    }

    /**
     * Get all rates for a currency pair.
     */
    public List<CurrencyRate> getRates(int currencyFrom, int currencyTo) {
        return currencyRateDao.findRates(currencyFrom, currencyTo);
    }

    /**
     * Get rates by conversion type.
     */
    public List<CurrencyRate> getRatesByType(int conversionTypeId) {
        return currencyRateDao.findByConversionType(conversionTypeId);
    }

    /**
     * Create a new currency rate.
     */
    @Transactional
    public CurrencyRate createRate(CurrencyRate rate) {
        try {
            // Calculate inverse rate if not provided
            if (rate.getDivideRate() == null && rate.getMultiplyRate() != null && rate.getMultiplyRate().compareTo(BigDecimal.ZERO) != 0) {
                rate.setDivideRate(BigDecimal.ONE.divide(rate.getMultiplyRate(), 12, RoundingMode.HALF_UP));
            }
            currencyRateDao.insert(rate);
            return rate;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to create currency rate", e);
        }
    }

    /**
     * Update an existing currency rate.
     */
    @Transactional
    public CurrencyRate updateRate(CurrencyRate rate) {
        try {
            currencyRateDao.update(rate);
            return rate;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to update currency rate", e);
        }
    }

    /**
     * Delete a currency rate.
     */
    @Transactional
    public void deleteRate(int rateId) {
        try {
            currencyRateDao.deleteById(rateId);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }
}
