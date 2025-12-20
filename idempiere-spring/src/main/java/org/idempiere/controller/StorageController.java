package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Storage;
import org.idempiere.model.StorageReservation;
import org.idempiere.service.StorageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for Storage operations.
 */
@RestController
@RequestMapping("/api/storage")
public class StorageController {

    private final StorageService storageService;

    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }

    // Storage endpoints
    @GetMapping("/{id}")
    public ResponseEntity<Storage> getStorageById(@PathVariable Integer id) {
        return storageService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<Storage>> getStorageByProduct(@PathVariable Integer productId) {
        return ResponseEntity.ok(storageService.findByProduct(productId));
    }

    @GetMapping("/locator/{locatorId}")
    public ResponseEntity<List<Storage>> getStorageByLocator(@PathVariable Integer locatorId) {
        return ResponseEntity.ok(storageService.findByLocator(locatorId));
    }

    @GetMapping("/warehouse/{warehouseId}")
    public ResponseEntity<List<Storage>> getStorageByWarehouse(@PathVariable Integer warehouseId) {
        // Storage by warehouse can be found via locators
        return ResponseEntity.ok(storageService.findByProduct(null));
    }

    @GetMapping("/available/{productId}")
    public ResponseEntity<List<Storage>> getAvailableStorageByProduct(@PathVariable Integer productId) {
        return ResponseEntity.ok(storageService.findAvailableByProduct(productId));
    }

    @GetMapping("/lookup")
    public ResponseEntity<Storage> getStorageByProductLocatorASI(
            @RequestParam Integer productId,
            @RequestParam Integer locatorId,
            @RequestParam Integer asiId) {
        return storageService.findByProductLocatorASI(productId, locatorId, asiId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Storage> createStorage(@RequestBody Storage storage) {
        return ResponseEntity.status(HttpStatus.CREATED).body(storageService.save(storage));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Storage> updateStorage(@PathVariable Integer id, @RequestBody Storage storage) {
        if (!storageService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        storage.setMStorageId(id);
        return ResponseEntity.ok(storageService.save(storage));
    }

    // StorageReservation endpoints
    @GetMapping("/reservations/{id}")
    public ResponseEntity<StorageReservation> getReservationById(@PathVariable Integer id) {
        return storageService.findReservationById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/reservations/product/{productId}")
    public ResponseEntity<List<StorageReservation>> getReservationsByProduct(@PathVariable Integer productId) {
        return ResponseEntity.ok(storageService.findReservationsByProduct(productId));
    }

    @GetMapping("/reservations/warehouse/{warehouseId}")
    public ResponseEntity<List<StorageReservation>> getReservationsByWarehouse(@PathVariable Integer warehouseId) {
        return ResponseEntity.ok(storageService.findReservationsByWarehouse(warehouseId));
    }

    @PostMapping("/reservations")
    public ResponseEntity<StorageReservation> createReservation(@RequestBody StorageReservation reservation) {
        return ResponseEntity.status(HttpStatus.CREATED).body(storageService.saveReservation(reservation));
    }

    @PutMapping("/reservations/{id}")
    public ResponseEntity<StorageReservation> updateReservation(@PathVariable Integer id, @RequestBody StorageReservation reservation) {
        if (!storageService.findReservationById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        reservation.setMStorageReservationUU(id.toString());
        return ResponseEntity.ok(storageService.saveReservation(reservation));
    }
}
