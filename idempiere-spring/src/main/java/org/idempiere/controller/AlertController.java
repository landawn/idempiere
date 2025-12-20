package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Alert;
import org.idempiere.service.AlertService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Alert entity operations.
 */
@RestController
@RequestMapping("/api/alerts")
@Tag(name = "Alert", description = "Alert management APIs")
public class AlertController {

    private final AlertService alertService;

    public AlertController(AlertService alertService) {
        this.alertService = alertService;
    }

    @GetMapping
    @Operation(summary = "Get all alerts")
    public ResponseEntity<List<Alert>> findAll() {
        return ResponseEntity.ok(alertService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get alert by ID")
    public ResponseEntity<Alert> findById(@PathVariable Integer id) {
        return alertService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new alert")
    public ResponseEntity<Alert> create(@RequestBody Alert alert) {
        Alert saved = alertService.save(alert);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing alert")
    public ResponseEntity<Alert> update(@PathVariable Integer id, @RequestBody Alert alert) {
        if (!alertService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        alert.setAdAlertId(id);
        Alert updated = alertService.save(alert);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete an alert")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!alertService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        alertService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
