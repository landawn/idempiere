package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.InOut;
import org.idempiere.model.InOutLine;
import org.idempiere.service.InOutService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for InOut (Shipment/Receipt) entity operations.
 */
@RestController
@RequestMapping("/api/inouts")
@Tag(name = "InOut", description = "Shipment and Receipt management APIs")
public class InOutController {

    private final InOutService inOutService;

    public InOutController(InOutService inOutService) {
        this.inOutService = inOutService;
    }

    @GetMapping
    @Operation(summary = "Get all shipments/receipts")
    public ResponseEntity<List<InOut>> findAll() {
        return ResponseEntity.ok(inOutService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get shipment/receipt by ID")
    public ResponseEntity<InOut> findById(@PathVariable Integer id) {
        return inOutService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/documentno/{documentNo}/client/{clientId}")
    @Operation(summary = "Get shipment/receipt by document number")
    public ResponseEntity<InOut> findByDocumentNo(@PathVariable String documentNo, @PathVariable Integer clientId) {
        return inOutService.findByDocumentNo(documentNo, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/bpartner/{bpartnerId}")
    @Operation(summary = "Get shipments/receipts by business partner")
    public ResponseEntity<List<InOut>> findByBPartner(@PathVariable Integer bpartnerId) {
        return ResponseEntity.ok(inOutService.findByBPartner(bpartnerId));
    }


    @PostMapping
    @Operation(summary = "Create a new shipment/receipt")
    public ResponseEntity<InOut> create(@RequestBody InOut inOut) {
        InOut saved = inOutService.save(inOut);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing shipment/receipt")
    public ResponseEntity<InOut> update(@PathVariable Integer id, @RequestBody InOut inOut) {
        if (!inOutService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        inOut.setMInOutId(id);
        InOut updated = inOutService.save(inOut);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a shipment/receipt")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!inOutService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        inOutService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // InOutLine endpoints

    @GetMapping("/{inOutId}/lines")
    @Operation(summary = "Get all lines for a shipment/receipt")
    public ResponseEntity<List<InOutLine>> findLinesByInOut(@PathVariable Integer inOutId) {
        return ResponseEntity.ok(inOutService.findLinesByInOut(inOutId));
    }

    @PostMapping("/{inOutId}/lines")
    @Operation(summary = "Add a line to shipment/receipt")
    public ResponseEntity<InOutLine> createLine(@PathVariable Integer inOutId, @RequestBody InOutLine line) {
        line.setMInOutId(inOutId);
        InOutLine saved = inOutService.saveLine(line);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{inOutId}/lines/{lineId}")
    @Operation(summary = "Update a shipment/receipt line")
    public ResponseEntity<InOutLine> updateLine(@PathVariable Integer inOutId, @PathVariable Integer lineId, @RequestBody InOutLine line) {
        line.setMInOutLineId(lineId);
        line.setMInOutId(inOutId);
        InOutLine updated = inOutService.saveLine(line);
        return ResponseEntity.ok(updated);
    }
}
