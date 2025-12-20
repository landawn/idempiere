package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.MatchPO;
import org.idempiere.service.MatchingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Matching entity operations.
 */
@RestController
@RequestMapping("/api/matching")
@Tag(name = "Matching", description = "Matching management APIs")
public class MatchingController {

    private final MatchingService matchingService;

    public MatchingController(MatchingService matchingService) {
        this.matchingService = matchingService;
    }

    @GetMapping("/po")
    @Operation(summary = "Get all match PO records")
    public ResponseEntity<List<MatchPO>> findAllMatchPO() {
        return ResponseEntity.ok(matchingService.findAllMatchPO());
    }

    @GetMapping("/po/{id}")
    @Operation(summary = "Get match PO by ID")
    public ResponseEntity<MatchPO> findMatchPOById(@PathVariable Integer id) {
        return matchingService.findMatchPOById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/po")
    @Operation(summary = "Create a new match PO record")
    public ResponseEntity<MatchPO> createMatchPO(@RequestBody MatchPO matchPO) {
        MatchPO saved = matchingService.saveMatchPO(matchPO);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/po/{id}")
    @Operation(summary = "Update an existing match PO record")
    public ResponseEntity<MatchPO> updateMatchPO(@PathVariable Integer id, @RequestBody MatchPO matchPO) {
        if (matchingService.findMatchPOById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        matchPO.setMMatchPoId(id);
        MatchPO updated = matchingService.saveMatchPO(matchPO);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/po/{id}")
    @Operation(summary = "Delete a match PO record")
    public ResponseEntity<Void> deleteMatchPO(@PathVariable Integer id) {
        if (matchingService.findMatchPOById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        matchingService.deleteMatchPO(id);
        return ResponseEntity.noContent().build();
    }
}
