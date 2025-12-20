package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Requisition;
import org.idempiere.model.RequisitionLine;
import org.idempiere.service.RequisitionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Requisition entity operations.
 */
@RestController
@RequestMapping("/api/requisitions")
@Tag(name = "Requisition", description = "Requisition management APIs")
public class RequisitionController {

    private final RequisitionService requisitionService;

    public RequisitionController(RequisitionService requisitionService) {
        this.requisitionService = requisitionService;
    }

    @GetMapping
    @Operation(summary = "Get all requisitions")
    public ResponseEntity<List<Requisition>> findAll() {
        return ResponseEntity.ok(requisitionService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get requisition by ID")
    public ResponseEntity<Requisition> findById(@PathVariable Integer id) {
        return requisitionService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/documentno/{documentNo}/client/{clientId}")
    @Operation(summary = "Get requisition by document number")
    public ResponseEntity<Requisition> findByDocumentNo(@PathVariable String documentNo, @PathVariable Integer clientId) {
        return requisitionService.findByDocumentNo(documentNo, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/user/{userId}/open")
    @Operation(summary = "Get open requisitions by user")
    public ResponseEntity<List<Requisition>> findOpenByUser(@PathVariable Integer userId) {
        return ResponseEntity.ok(requisitionService.findOpenByUser(userId));
    }

    @GetMapping("/status/{docStatus}/client/{clientId}")
    @Operation(summary = "Get requisitions by document status")
    public ResponseEntity<List<Requisition>> findByDocStatus(@PathVariable String docStatus, @PathVariable Integer clientId) {
        return ResponseEntity.ok(requisitionService.findByDocStatus(docStatus, clientId));
    }

    @GetMapping("/lines/unordered")
    @Operation(summary = "Get all unordered requisition lines")
    public ResponseEntity<List<RequisitionLine>> findUnorderedLines() {
        return ResponseEntity.ok(requisitionService.findUnorderedLines());
    }

    @PostMapping
    @Operation(summary = "Create a new requisition")
    public ResponseEntity<Requisition> create(@RequestBody Requisition requisition) {
        Requisition saved = requisitionService.save(requisition);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing requisition")
    public ResponseEntity<Requisition> update(@PathVariable Integer id, @RequestBody Requisition requisition) {
        if (!requisitionService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        requisition.setMRequisitionId(id);
        Requisition updated = requisitionService.save(requisition);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a requisition")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!requisitionService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        requisitionService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // RequisitionLine endpoints

    @GetMapping("/{requisitionId}/lines")
    @Operation(summary = "Get all lines for a requisition")
    public ResponseEntity<List<RequisitionLine>> findLinesByRequisition(@PathVariable Integer requisitionId) {
        return ResponseEntity.ok(requisitionService.findLinesByRequisition(requisitionId));
    }

    @PostMapping("/{requisitionId}/lines")
    @Operation(summary = "Add a line to requisition")
    public ResponseEntity<RequisitionLine> createLine(@PathVariable Integer requisitionId, @RequestBody RequisitionLine line) {
        line.setMRequisitionId(requisitionId);
        RequisitionLine saved = requisitionService.saveLine(line);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{requisitionId}/lines/{lineId}")
    @Operation(summary = "Update a requisition line")
    public ResponseEntity<RequisitionLine> updateLine(@PathVariable Integer requisitionId, @PathVariable Integer lineId, @RequestBody RequisitionLine line) {
        line.setMRequisitionLineId(lineId);
        line.setMRequisitionId(requisitionId);
        RequisitionLine updated = requisitionService.saveLine(line);
        return ResponseEntity.ok(updated);
    }
}
