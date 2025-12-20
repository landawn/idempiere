package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Inventory;
import org.idempiere.model.InventoryLine;
import org.idempiere.service.InventoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Inventory (Physical Inventory) entity operations.
 */
@RestController
@RequestMapping("/api/inventories")
@Tag(name = "Inventory", description = "Physical Inventory management APIs")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping
    @Operation(summary = "Get all physical inventories")
    public ResponseEntity<List<Inventory>> findAll() {
        return ResponseEntity.ok(inventoryService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get physical inventory by ID")
    public ResponseEntity<Inventory> findById(@PathVariable Integer id) {
        return inventoryService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/documentno/{documentNo}/client/{clientId}")
    @Operation(summary = "Get physical inventory by document number")
    public ResponseEntity<Inventory> findByDocumentNo(@PathVariable String documentNo, @PathVariable Integer clientId) {
        return inventoryService.findByDocumentNo(documentNo, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/warehouse/{warehouseId}/status/{docStatus}")
    @Operation(summary = "Get physical inventories by warehouse and status")
    public ResponseEntity<List<Inventory>> findByWarehouseAndStatus(@PathVariable Integer warehouseId, @PathVariable String docStatus) {
        return ResponseEntity.ok(inventoryService.findByWarehouseAndStatus(warehouseId, docStatus));
    }

    @PostMapping
    @Operation(summary = "Create a new physical inventory")
    public ResponseEntity<Inventory> create(@RequestBody Inventory inventory) {
        Inventory saved = inventoryService.save(inventory);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing physical inventory")
    public ResponseEntity<Inventory> update(@PathVariable Integer id, @RequestBody Inventory inventory) {
        if (!inventoryService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        inventory.setMInventoryId(id);
        Inventory updated = inventoryService.save(inventory);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a physical inventory")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!inventoryService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        inventoryService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // InventoryLine endpoints

    @GetMapping("/{inventoryId}/lines")
    @Operation(summary = "Get all lines for a physical inventory")
    public ResponseEntity<List<InventoryLine>> findLinesByInventory(@PathVariable Integer inventoryId) {
        return ResponseEntity.ok(inventoryService.findLinesByInventory(inventoryId));
    }

    @PostMapping("/{inventoryId}/lines")
    @Operation(summary = "Add a line to physical inventory")
    public ResponseEntity<InventoryLine> createLine(@PathVariable Integer inventoryId, @RequestBody InventoryLine line) {
        line.setMInventoryId(inventoryId);
        InventoryLine saved = inventoryService.saveLine(line);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{inventoryId}/lines/{lineId}")
    @Operation(summary = "Update an inventory line")
    public ResponseEntity<InventoryLine> updateLine(@PathVariable Integer inventoryId, @PathVariable Integer lineId, @RequestBody InventoryLine line) {
        line.setMInventoryLineId(lineId);
        line.setMInventoryId(inventoryId);
        InventoryLine updated = inventoryService.saveLine(line);
        return ResponseEntity.ok(updated);
    }
}
