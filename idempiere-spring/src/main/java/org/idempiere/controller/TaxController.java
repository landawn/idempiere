package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Tax;
import org.idempiere.model.TaxCategory;
import org.idempiere.service.TaxService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Tax entity operations.
 */
@RestController
@RequestMapping("/api/taxes")
@Tag(name = "Tax", description = "Tax management APIs")
public class TaxController {

    private final TaxService taxService;

    public TaxController(TaxService taxService) {
        this.taxService = taxService;
    }

    @GetMapping
    @Operation(summary = "Get all taxes")
    public ResponseEntity<List<Tax>> findAll() {
        return ResponseEntity.ok(taxService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get tax by ID")
    public ResponseEntity<Tax> findById(@PathVariable Integer id) {
        return taxService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/client/{clientId}")
    @Operation(summary = "Get taxes by client")
    public ResponseEntity<List<Tax>> findByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(taxService.findByClient(clientId));
    }

    @GetMapping("/category/{taxCategoryId}")
    @Operation(summary = "Get taxes by tax category")
    public ResponseEntity<List<Tax>> findByTaxCategory(@PathVariable Integer taxCategoryId) {
        return ResponseEntity.ok(taxService.findByTaxCategory(taxCategoryId));
    }

    @GetMapping("/default/client/{clientId}")
    @Operation(summary = "Get default tax")
    public ResponseEntity<Tax> findDefault(@PathVariable Integer clientId) {
        return taxService.findDefault(clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/sales/client/{clientId}")
    @Operation(summary = "Get sales taxes")
    public ResponseEntity<List<Tax>> findSalesTaxes(@PathVariable Integer clientId) {
        return ResponseEntity.ok(taxService.findBySOPO("Y", clientId));
    }

    @GetMapping("/purchase/client/{clientId}")
    @Operation(summary = "Get purchase taxes")
    public ResponseEntity<List<Tax>> findPurchaseTaxes(@PathVariable Integer clientId) {
        return ResponseEntity.ok(taxService.findBySOPO("N", clientId));
    }

    @PostMapping
    @Operation(summary = "Create a new tax")
    public ResponseEntity<Tax> create(@RequestBody Tax tax) {
        Tax saved = taxService.save(tax);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing tax")
    public ResponseEntity<Tax> update(@PathVariable Integer id, @RequestBody Tax tax) {
        if (!taxService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        tax.setCTaxId(id);
        Tax updated = taxService.save(tax);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a tax")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!taxService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        taxService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // TaxCategory endpoints

    @GetMapping("/categories")
    @Operation(summary = "Get all tax categories")
    public ResponseEntity<List<TaxCategory>> findAllTaxCategories() {
        return ResponseEntity.ok(taxService.findAllTaxCategories());
    }

    @GetMapping("/categories/{id}")
    @Operation(summary = "Get tax category by ID")
    public ResponseEntity<TaxCategory> findTaxCategoryById(@PathVariable Integer id) {
        return taxService.findTaxCategoryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/categories/client/{clientId}")
    @Operation(summary = "Get tax categories by client")
    public ResponseEntity<List<TaxCategory>> findTaxCategoriesByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(taxService.findTaxCategoriesByClient(clientId));
    }

    @PostMapping("/categories")
    @Operation(summary = "Create a new tax category")
    public ResponseEntity<TaxCategory> createTaxCategory(@RequestBody TaxCategory taxCategory) {
        TaxCategory saved = taxService.saveTaxCategory(taxCategory);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
