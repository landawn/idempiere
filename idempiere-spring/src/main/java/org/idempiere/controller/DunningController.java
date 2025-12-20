package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Dunning;
import org.idempiere.model.DunningLevel;
import org.idempiere.model.DunningRun;
import org.idempiere.service.DunningService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Dunning entity operations.
 */
@RestController
@RequestMapping("/api/dunning")
@Tag(name = "Dunning", description = "Dunning management APIs")
public class DunningController {

    private final DunningService dunningService;

    public DunningController(DunningService dunningService) {
        this.dunningService = dunningService;
    }

    @GetMapping
    @Operation(summary = "Get all dunnings")
    public ResponseEntity<List<Dunning>> findAll() {
        return ResponseEntity.ok(dunningService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get dunning by ID")
    public ResponseEntity<Dunning> findById(@PathVariable Integer id) {
        return dunningService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/client/{clientId}")
    @Operation(summary = "Get dunnings by client")
    public ResponseEntity<List<Dunning>> findByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(dunningService.findByClient(clientId));
    }

    @PostMapping
    @Operation(summary = "Create a new dunning")
    public ResponseEntity<Dunning> create(@RequestBody Dunning dunning) {
        Dunning saved = dunningService.save(dunning);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing dunning")
    public ResponseEntity<Dunning> update(@PathVariable Integer id, @RequestBody Dunning dunning) {
        if (!dunningService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        dunning.setCDunningId(id);
        Dunning updated = dunningService.save(dunning);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a dunning")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!dunningService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        dunningService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // DunningLevel endpoints

    @GetMapping("/{dunningId}/levels")
    @Operation(summary = "Get all levels for a dunning")
    public ResponseEntity<List<DunningLevel>> findLevelsByDunning(@PathVariable Integer dunningId) {
        return ResponseEntity.ok(dunningService.findLevelsByDunning(dunningId));
    }

    @PostMapping("/{dunningId}/levels")
    @Operation(summary = "Add a level to dunning")
    public ResponseEntity<DunningLevel> createLevel(@PathVariable Integer dunningId, @RequestBody DunningLevel level) {
        level.setCDunningId(dunningId);
        DunningLevel saved = dunningService.saveLevel(level);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // DunningRun endpoints

    @GetMapping("/{dunningId}/runs")
    @Operation(summary = "Get all runs for a dunning")
    public ResponseEntity<List<DunningRun>> findRunsByDunning(@PathVariable Integer dunningId) {
        return ResponseEntity.ok(dunningService.findRunsByDunning(dunningId));
    }

    @PostMapping("/runs")
    @Operation(summary = "Create a dunning run")
    public ResponseEntity<DunningRun> createRun(@RequestBody DunningRun run) {
        DunningRun saved = dunningService.saveRun(run);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
