package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.RMA;
import org.idempiere.model.RMALine;
import org.idempiere.service.RMAService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for RMA (Return Material Authorization) entity operations.
 */
@RestController
@RequestMapping("/api/rmas")
@Tag(name = "RMA", description = "Return Material Authorization management APIs")
public class RMAController {

    private final RMAService rmaService;

    public RMAController(RMAService rmaService) {
        this.rmaService = rmaService;
    }

    @GetMapping
    @Operation(summary = "Get all RMAs")
    public ResponseEntity<List<RMA>> findAll() {
        return ResponseEntity.ok(rmaService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get RMA by ID")
    public ResponseEntity<RMA> findById(@PathVariable Integer id) {
        return rmaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/documentno/{documentNo}/client/{clientId}")
    @Operation(summary = "Get RMA by document number")
    public ResponseEntity<RMA> findByDocumentNo(@PathVariable String documentNo, @PathVariable Integer clientId) {
        return rmaService.findByDocumentNo(documentNo, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/bpartner/{bpartnerId}/sotrx/{isSOTrx}")
    @Operation(summary = "Get RMAs by business partner and sales/purchase type")
    public ResponseEntity<List<RMA>> findByBPartner(@PathVariable Integer bpartnerId, @PathVariable String isSOTrx) {
        return ResponseEntity.ok(rmaService.findByBPartner(bpartnerId, isSOTrx));
    }

    @GetMapping("/status/{docStatus}/client/{clientId}")
    @Operation(summary = "Get RMAs by document status")
    public ResponseEntity<List<RMA>> findByDocStatus(@PathVariable String docStatus, @PathVariable Integer clientId) {
        return ResponseEntity.ok(rmaService.findByDocStatus(docStatus, clientId));
    }

    @PostMapping
    @Operation(summary = "Create a new RMA")
    public ResponseEntity<RMA> create(@RequestBody RMA rma) {
        RMA saved = rmaService.save(rma);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing RMA")
    public ResponseEntity<RMA> update(@PathVariable Integer id, @RequestBody RMA rma) {
        if (!rmaService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        rma.setMRmaId(id);
        RMA updated = rmaService.save(rma);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete an RMA")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!rmaService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        rmaService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // RMALine endpoints

    @GetMapping("/{rmaId}/lines")
    @Operation(summary = "Get all lines for an RMA")
    public ResponseEntity<List<RMALine>> findLinesByRMA(@PathVariable Integer rmaId) {
        return ResponseEntity.ok(rmaService.findLinesByRMA(rmaId));
    }

    @PostMapping("/{rmaId}/lines")
    @Operation(summary = "Add a line to RMA")
    public ResponseEntity<RMALine> createLine(@PathVariable Integer rmaId, @RequestBody RMALine line) {
        line.setMRmaId(rmaId);
        RMALine saved = rmaService.saveLine(line);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{rmaId}/lines/{lineId}")
    @Operation(summary = "Update an RMA line")
    public ResponseEntity<RMALine> updateLine(@PathVariable Integer rmaId, @PathVariable Integer lineId, @RequestBody RMALine line) {
        line.setMRmaLineId(lineId);
        line.setMRmaId(rmaId);
        RMALine updated = rmaService.saveLine(line);
        return ResponseEntity.ok(updated);
    }
}
