package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Movement;
import org.idempiere.model.MovementLine;
import org.idempiere.service.MovementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Movement entity operations.
 */
@RestController
@RequestMapping("/api/movements")
@Tag(name = "Movement", description = "Inventory Movement management APIs")
public class MovementController {

    private final MovementService movementService;

    public MovementController(MovementService movementService) {
        this.movementService = movementService;
    }

    @GetMapping
    @Operation(summary = "Get all movements")
    public ResponseEntity<List<Movement>> findAll() {
        return ResponseEntity.ok(movementService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get movement by ID")
    public ResponseEntity<Movement> findById(@PathVariable Integer id) {
        return movementService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/documentno/{documentNo}/client/{clientId}")
    @Operation(summary = "Get movement by document number")
    public ResponseEntity<Movement> findByDocumentNo(@PathVariable String documentNo, @PathVariable Integer clientId) {
        return movementService.findByDocumentNo(documentNo, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/status/{docStatus}/client/{clientId}")
    @Operation(summary = "Get movements by document status")
    public ResponseEntity<List<Movement>> findByDocStatus(@PathVariable String docStatus, @PathVariable Integer clientId) {
        return ResponseEntity.ok(movementService.findByDocStatus(docStatus, clientId));
    }

    @PostMapping
    @Operation(summary = "Create a new movement")
    public ResponseEntity<Movement> create(@RequestBody Movement movement) {
        Movement saved = movementService.save(movement);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing movement")
    public ResponseEntity<Movement> update(@PathVariable Integer id, @RequestBody Movement movement) {
        if (!movementService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        movement.setMMovementId(id);
        Movement updated = movementService.save(movement);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a movement")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!movementService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        movementService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // MovementLine endpoints

    @GetMapping("/{movementId}/lines")
    @Operation(summary = "Get all lines for a movement")
    public ResponseEntity<List<MovementLine>> findLinesByMovement(@PathVariable Integer movementId) {
        return ResponseEntity.ok(movementService.findLinesByMovement(movementId));
    }

    @PostMapping("/{movementId}/lines")
    @Operation(summary = "Add a line to movement")
    public ResponseEntity<MovementLine> createLine(@PathVariable Integer movementId, @RequestBody MovementLine line) {
        line.setMMovementId(movementId);
        MovementLine saved = movementService.saveLine(line);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{movementId}/lines/{lineId}")
    @Operation(summary = "Update a movement line")
    public ResponseEntity<MovementLine> updateLine(@PathVariable Integer movementId, @PathVariable Integer lineId, @RequestBody MovementLine line) {
        line.setMMovementLineId(lineId);
        line.setMMovementId(movementId);
        MovementLine updated = movementService.saveLine(line);
        return ResponseEntity.ok(updated);
    }
}
