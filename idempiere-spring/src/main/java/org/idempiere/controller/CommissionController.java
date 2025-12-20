package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Commission;
import org.idempiere.model.CommissionLine;
import org.idempiere.model.CommissionRun;
import org.idempiere.service.CommissionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Commission entity operations.
 */
@RestController
@RequestMapping("/api/commissions")
@Tag(name = "Commission", description = "Commission management APIs")
public class CommissionController {

    private final CommissionService commissionService;

    public CommissionController(CommissionService commissionService) {
        this.commissionService = commissionService;
    }

    @GetMapping
    @Operation(summary = "Get all commissions")
    public ResponseEntity<List<Commission>> findAll() {
        return ResponseEntity.ok(commissionService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get commission by ID")
    public ResponseEntity<Commission> findById(@PathVariable Integer id) {
        return commissionService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/bpartner/{bpartnerId}")
    @Operation(summary = "Get commissions by business partner")
    public ResponseEntity<List<Commission>> findByBPartner(@PathVariable Integer bpartnerId) {
        return ResponseEntity.ok(commissionService.findByBPartner(bpartnerId));
    }

    @PostMapping
    @Operation(summary = "Create a new commission")
    public ResponseEntity<Commission> create(@RequestBody Commission commission) {
        Commission saved = commissionService.save(commission);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing commission")
    public ResponseEntity<Commission> update(@PathVariable Integer id, @RequestBody Commission commission) {
        if (!commissionService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        commission.setCCommissionId(id);
        Commission updated = commissionService.save(commission);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a commission")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!commissionService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        commissionService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // CommissionLine endpoints

    @GetMapping("/{commissionId}/lines")
    @Operation(summary = "Get all lines for a commission")
    public ResponseEntity<List<CommissionLine>> findLinesByCommission(@PathVariable Integer commissionId) {
        return ResponseEntity.ok(commissionService.findLinesByCommission(commissionId));
    }

    @PostMapping("/{commissionId}/lines")
    @Operation(summary = "Add a line to commission")
    public ResponseEntity<CommissionLine> createLine(@PathVariable Integer commissionId, @RequestBody CommissionLine line) {
        line.setCCommissionId(commissionId);
        CommissionLine saved = commissionService.saveLine(line);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // CommissionRun endpoints

    @GetMapping("/{commissionId}/runs")
    @Operation(summary = "Get all runs for a commission")
    public ResponseEntity<List<CommissionRun>> findRunsByCommission(@PathVariable Integer commissionId) {
        return ResponseEntity.ok(commissionService.findRunsByCommission(commissionId));
    }

    @PostMapping("/{commissionId}/runs")
    @Operation(summary = "Create a commission run")
    public ResponseEntity<CommissionRun> createRun(@PathVariable Integer commissionId, @RequestBody CommissionRun run) {
        run.setCCommissionId(commissionId);
        CommissionRun saved = commissionService.saveRun(run);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
