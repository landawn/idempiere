package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.ADTable;
import org.idempiere.service.TableService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Table entity operations.
 */
@RestController
@RequestMapping("/api/tables")
@Tag(name = "Table", description = "Table management APIs")
public class TableController {

    private final TableService tableService;

    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @GetMapping
    @Operation(summary = "Get all tables")
    public ResponseEntity<List<ADTable>> findAll() {
        return ResponseEntity.ok(tableService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get table by ID")
    public ResponseEntity<ADTable> findById(@PathVariable Integer id) {
        return tableService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new table")
    public ResponseEntity<ADTable> create(@RequestBody ADTable table) {
        ADTable saved = tableService.save(table);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing table")
    public ResponseEntity<ADTable> update(@PathVariable Integer id, @RequestBody ADTable table) {
        if (!tableService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        table.setAdTableId(id);
        ADTable updated = tableService.save(table);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a table")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!tableService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        tableService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
