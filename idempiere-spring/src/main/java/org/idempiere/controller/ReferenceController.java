package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Reference;
import org.idempiere.service.ReferenceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Reference entity operations.
 */
@RestController
@RequestMapping("/api/references")
@Tag(name = "Reference", description = "Reference management APIs")
public class ReferenceController {

    private final ReferenceService referenceService;

    public ReferenceController(ReferenceService referenceService) {
        this.referenceService = referenceService;
    }

    @GetMapping
    @Operation(summary = "Get all references")
    public ResponseEntity<List<Reference>> findAll() {
        return ResponseEntity.ok(referenceService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get reference by ID")
    public ResponseEntity<Reference> findById(@PathVariable Integer id) {
        return referenceService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new reference")
    public ResponseEntity<Reference> create(@RequestBody Reference reference) {
        Reference saved = referenceService.save(reference);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing reference")
    public ResponseEntity<Reference> update(@PathVariable Integer id, @RequestBody Reference reference) {
        if (!referenceService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        reference.setAdReferenceId(id);
        Reference updated = referenceService.save(reference);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a reference")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!referenceService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        referenceService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
