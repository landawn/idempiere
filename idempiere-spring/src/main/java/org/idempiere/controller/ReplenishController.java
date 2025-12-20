package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Replenish;
import org.idempiere.service.ReplenishService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for Replenish operations.
 */
@RestController
@RequestMapping("/api/replenish")
public class ReplenishController {

    private final ReplenishService replenishService;

    public ReplenishController(ReplenishService replenishService) {
        this.replenishService = replenishService;
    }

    @GetMapping
    public ResponseEntity<List<Replenish>> getAllReplenish() {
        return ResponseEntity.ok(replenishService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Replenish> getReplenishById(@PathVariable Integer id) {
        return replenishService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/warehouse/{warehouseId}")
    public ResponseEntity<List<Replenish>> getReplenishByWarehouse(@PathVariable Integer warehouseId) {
        return ResponseEntity.ok(replenishService.findByWarehouse(warehouseId));
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<Replenish>> getReplenishByProduct(@PathVariable Integer productId) {
        return ResponseEntity.ok(replenishService.findByProduct(productId));
    }

    @GetMapping("/lookup")
    public ResponseEntity<Replenish> getReplenishByWarehouseAndProduct(
            @RequestParam Integer warehouseId,
            @RequestParam Integer productId) {
        return replenishService.findByWarehouseAndProduct(warehouseId, productId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/type/{replenishType}")
    public ResponseEntity<List<Replenish>> getReplenishByType(@PathVariable String replenishType) {
        return ResponseEntity.ok(replenishService.findByReplenishType(replenishType));
    }

    @PostMapping
    public ResponseEntity<Replenish> createReplenish(@RequestBody Replenish replenish) {
        return ResponseEntity.status(HttpStatus.CREATED).body(replenishService.save(replenish));
    }

    @PutMapping("/{uuid}")
    public ResponseEntity<Replenish> updateReplenish(@PathVariable String uuid, @RequestBody Replenish replenish) {
        if (!replenishService.existsByUuid(uuid)) {
            return ResponseEntity.notFound().build();
        }
        replenish.setMReplenishUU(uuid);
        return ResponseEntity.ok(replenishService.save(replenish));
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<Void> deleteReplenish(@PathVariable String uuid) {
        if (!replenishService.existsByUuid(uuid)) {
            return ResponseEntity.notFound().build();
        }
        replenishService.deleteByUuid(uuid);
        return ResponseEntity.noContent().build();
    }
}
