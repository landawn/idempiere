package org.idempiere.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.idempiere.model.PriceList;
import org.idempiere.model.PriceListVersion;
import org.idempiere.model.ProductPrice;
import org.idempiere.service.PriceListService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for PriceList entity operations.
 */
@RestController
@RequestMapping("/api/pricelists")
@Tag(name = "PriceList", description = "Price List management APIs")
public class PriceListController {

    private final PriceListService priceListService;

    public PriceListController(PriceListService priceListService) {
        this.priceListService = priceListService;
    }

    @GetMapping
    @Operation(summary = "Get all price lists")
    public ResponseEntity<List<PriceList>> findAll() {
        return ResponseEntity.ok(priceListService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get price list by ID")
    public ResponseEntity<PriceList> findById(@PathVariable Integer id) {
        return priceListService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/default")
    @Operation(summary = "Get default price list")
    public ResponseEntity<PriceList> findDefault(@RequestParam String isSOPriceList, @RequestParam Integer clientId) {
        return priceListService.findDefault(isSOPriceList, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/sales/client/{clientId}")
    @Operation(summary = "Get all sales price lists")
    public ResponseEntity<List<PriceList>> findSalesPriceLists(@PathVariable Integer clientId) {
        return ResponseEntity.ok(priceListService.findBySOPriceList("Y", clientId));
    }

    @GetMapping("/purchase/client/{clientId}")
    @Operation(summary = "Get all purchase price lists")
    public ResponseEntity<List<PriceList>> findPurchasePriceLists(@PathVariable Integer clientId) {
        return ResponseEntity.ok(priceListService.findBySOPriceList("N", clientId));
    }

    @PostMapping
    @Operation(summary = "Create a new price list")
    public ResponseEntity<PriceList> create(@RequestBody PriceList priceList) {
        PriceList saved = priceListService.save(priceList);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing price list")
    public ResponseEntity<PriceList> update(@PathVariable Integer id, @RequestBody PriceList priceList) {
        if (!priceListService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        priceList.setMPriceListId(id);
        PriceList updated = priceListService.save(priceList);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a price list")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!priceListService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        priceListService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // PriceListVersion endpoints

    @GetMapping("/{priceListId}/versions")
    @Operation(summary = "Get all versions for a price list")
    public ResponseEntity<List<PriceListVersion>> findVersionsByPriceList(@PathVariable Integer priceListId) {
        return ResponseEntity.ok(priceListService.findVersionsByPriceList(priceListId));
    }

    @GetMapping("/{priceListId}/versions/valid")
    @Operation(summary = "Get valid version for a price list at a specific date")
    public ResponseEntity<PriceListVersion> findValidVersion(
            @PathVariable Integer priceListId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime validDate) {
        return priceListService.findValidVersion(priceListId, validDate)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // ProductPrice endpoints

    @GetMapping("/versions/{versionId}/prices")
    @Operation(summary = "Get all product prices for a price list version")
    public ResponseEntity<List<ProductPrice>> findPricesByVersion(@PathVariable Integer versionId) {
        return ResponseEntity.ok(priceListService.findPricesByVersion(versionId));
    }

    @GetMapping("/versions/{versionId}/prices/product/{productId}")
    @Operation(summary = "Get product price")
    public ResponseEntity<ProductPrice> findProductPrice(@PathVariable Integer versionId, @PathVariable Integer productId) {
        return priceListService.findProductPrice(productId, versionId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
