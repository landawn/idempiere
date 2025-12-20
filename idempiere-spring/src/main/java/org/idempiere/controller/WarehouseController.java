package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Warehouse;
import org.idempiere.model.Locator;
import org.idempiere.service.WarehouseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Warehouse and Locator entity operations.
 */
@RestController
@RequestMapping("/api/warehouses")
@Tag(name = "Warehouse", description = "Warehouse management APIs")
public class WarehouseController {

    private final WarehouseService warehouseService;

    public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @GetMapping
    @Operation(summary = "Get all warehouses")
    public ResponseEntity<List<Warehouse>> findAll() {
        return ResponseEntity.ok(warehouseService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get warehouse by ID")
    public ResponseEntity<Warehouse> findById(@PathVariable Integer id) {
        return warehouseService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/org/{orgId}")
    @Operation(summary = "Get warehouses by organization")
    public ResponseEntity<List<Warehouse>> findByOrg(@PathVariable Integer orgId) {
        return ResponseEntity.ok(warehouseService.findByOrg(orgId));
    }

    @GetMapping("/org/{orgId}/default")
    @Operation(summary = "Get default warehouse for organization")
    public ResponseEntity<Warehouse> findDefault(@PathVariable Integer orgId) {
        return warehouseService.findDefault(orgId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new warehouse")
    public ResponseEntity<Warehouse> create(@RequestBody Warehouse warehouse) {
        Warehouse saved = warehouseService.save(warehouse);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing warehouse")
    public ResponseEntity<Warehouse> update(@PathVariable Integer id, @RequestBody Warehouse warehouse) {
        if (!warehouseService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        warehouse.setMWarehouseId(id);
        Warehouse updated = warehouseService.save(warehouse);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a warehouse")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!warehouseService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        warehouseService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // Locator endpoints

    @GetMapping("/{warehouseId}/locators")
    @Operation(summary = "Get all locators for a warehouse")
    public ResponseEntity<List<Locator>> findLocatorsByWarehouse(@PathVariable Integer warehouseId) {
        return ResponseEntity.ok(warehouseService.findLocatorsByWarehouse(warehouseId));
    }

    @GetMapping("/{warehouseId}/locators/default")
    @Operation(summary = "Get default locator for a warehouse")
    public ResponseEntity<Locator> findDefaultLocator(@PathVariable Integer warehouseId) {
        return warehouseService.findDefaultLocator(warehouseId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/{warehouseId}/locators")
    @Operation(summary = "Create a new locator in warehouse")
    public ResponseEntity<Locator> createLocator(@PathVariable Integer warehouseId, @RequestBody Locator locator) {
        locator.setMWarehouseId(warehouseId);
        Locator saved = warehouseService.saveLocator(locator);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
