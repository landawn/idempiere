package org.idempiere.controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.idempiere.model.Currency;
import org.idempiere.model.CurrencyRate;
import org.idempiere.service.CurrencyService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Currency entity operations.
 */
@RestController
@RequestMapping("/api/currencies")
@Tag(name = "Currency", description = "Currency management APIs")
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get currency by ID")
    public ResponseEntity<Currency> findById(@PathVariable Integer id) {
        return currencyService.getCurrency(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // ConversionRate endpoints

    @GetMapping("/rates/{fromCurrencyId}/to/{toCurrencyId}")
    @Operation(summary = "Get conversion rate")
    public ResponseEntity<BigDecimal> getConversionRate(
            @PathVariable Integer fromCurrencyId,
            @PathVariable Integer toCurrencyId,
            @RequestParam Integer conversionTypeId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime conversionDate) {
        return currencyService.getRate(fromCurrencyId, toCurrencyId, conversionTypeId, conversionDate)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/rates/{currencyFromId}/to/{currencyToId}/all")
    @Operation(summary = "Get all conversion rates for a currency pair")
    public ResponseEntity<List<CurrencyRate>> getAllRates(
            @PathVariable Integer currencyFromId,
            @PathVariable Integer currencyToId) {
        return ResponseEntity.ok(currencyService.getRates(currencyFromId, currencyToId));
    }

    @GetMapping("/rates/type/{conversionTypeId}")
    @Operation(summary = "Get conversion rates by conversion type")
    public ResponseEntity<List<CurrencyRate>> getRatesByType(@PathVariable Integer conversionTypeId) {
        return ResponseEntity.ok(currencyService.getRatesByType(conversionTypeId));
    }

    @GetMapping("/convert")
    @Operation(summary = "Convert amount between currencies")
    public ResponseEntity<BigDecimal> convert(
            @RequestParam BigDecimal amount,
            @RequestParam Integer fromCurrencyId,
            @RequestParam Integer toCurrencyId,
            @RequestParam Integer conversionTypeId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime conversionDate) {
        return currencyService.convert(amount, fromCurrencyId, toCurrencyId, conversionTypeId, conversionDate)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/rates")
    @Operation(summary = "Create a new conversion rate")
    public ResponseEntity<CurrencyRate> createConversionRate(@RequestBody CurrencyRate conversionRate) {
        CurrencyRate saved = currencyService.createRate(conversionRate);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/rates/{id}")
    @Operation(summary = "Update a conversion rate")
    public ResponseEntity<CurrencyRate> updateConversionRate(@PathVariable Integer id, @RequestBody CurrencyRate conversionRate) {
        CurrencyRate updated = currencyService.updateRate(conversionRate);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/rates/{id}")
    @Operation(summary = "Delete a conversion rate")
    public ResponseEntity<Void> deleteConversionRate(@PathVariable Integer id) {
        currencyService.deleteRate(id);
        return ResponseEntity.noContent().build();
    }
}
