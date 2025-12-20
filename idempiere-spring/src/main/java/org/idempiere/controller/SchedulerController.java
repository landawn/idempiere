package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Scheduler;
import org.idempiere.service.SchedulerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Scheduler entity operations.
 */
@RestController
@RequestMapping("/api/schedulers")
@Tag(name = "Scheduler", description = "Scheduler management APIs")
public class SchedulerController {

    private final SchedulerService schedulerService;

    public SchedulerController(SchedulerService schedulerService) {
        this.schedulerService = schedulerService;
    }

    @GetMapping
    @Operation(summary = "Get all schedulers")
    public ResponseEntity<List<Scheduler>> findAll() {
        return ResponseEntity.ok(schedulerService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get scheduler by ID")
    public ResponseEntity<Scheduler> findById(@PathVariable Integer id) {
        return schedulerService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new scheduler")
    public ResponseEntity<Scheduler> create(@RequestBody Scheduler scheduler) {
        Scheduler saved = schedulerService.save(scheduler);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing scheduler")
    public ResponseEntity<Scheduler> update(@PathVariable Integer id, @RequestBody Scheduler scheduler) {
        if (!schedulerService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        scheduler.setAdSchedulerId(id);
        Scheduler updated = schedulerService.save(scheduler);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a scheduler")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!schedulerService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        schedulerService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
