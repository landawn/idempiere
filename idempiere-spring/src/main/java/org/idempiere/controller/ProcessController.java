package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Process;
import org.idempiere.service.ProcessService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Process entity operations.
 */
@RestController
@RequestMapping("/api/processes")
@Tag(name = "Process", description = "Process management APIs")
public class ProcessController {

    private final ProcessService processService;

    public ProcessController(ProcessService processService) {
        this.processService = processService;
    }

    @GetMapping
    @Operation(summary = "Get all processes")
    public ResponseEntity<List<Process>> findAll() {
        return ResponseEntity.ok(processService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get process by ID")
    public ResponseEntity<Process> findById(@PathVariable Integer id) {
        return processService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new process")
    public ResponseEntity<Process> create(@RequestBody Process process) {
        Process saved = processService.save(process);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing process")
    public ResponseEntity<Process> update(@PathVariable Integer id, @RequestBody Process process) {
        if (!processService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        process.setAdProcessId(id);
        Process updated = processService.save(process);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a process")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!processService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        processService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
