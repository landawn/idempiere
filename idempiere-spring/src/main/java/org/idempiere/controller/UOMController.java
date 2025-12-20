package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.UOM;
import org.idempiere.service.UOMService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for UOM (Unit of Measure) entity operations.
 */
@RestController
@RequestMapping("/api/uom")
@Tag(name = "UOM", description = "Unit of Measure management APIs")
public class UOMController {

    private final UOMService uomService;

    public UOMController(UOMService uomService) {
        this.uomService = uomService;
    }

    @GetMapping
    @Operation(summary = "Get all units of measure")
    public ResponseEntity<List<UOM>> findAll() {
        return ResponseEntity.ok(uomService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get UOM by ID")
    public ResponseEntity<UOM> findById(@PathVariable Integer id) {
        return uomService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new unit of measure")
    public ResponseEntity<UOM> create(@RequestBody UOM uom) {
        UOM saved = uomService.save(uom);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing unit of measure")
    public ResponseEntity<UOM> update(@PathVariable Integer id, @RequestBody UOM uom) {
        if (!uomService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        uom.setCUomId(id);
        UOM updated = uomService.save(uom);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a unit of measure")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!uomService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        uomService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
