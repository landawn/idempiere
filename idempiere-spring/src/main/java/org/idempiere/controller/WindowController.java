package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Window;
import org.idempiere.service.WindowService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Window entity operations.
 */
@RestController
@RequestMapping("/api/windows")
@Tag(name = "Window", description = "Window management APIs")
public class WindowController {

    private final WindowService windowService;

    public WindowController(WindowService windowService) {
        this.windowService = windowService;
    }

    @GetMapping
    @Operation(summary = "Get all windows")
    public ResponseEntity<List<Window>> findAll() {
        return ResponseEntity.ok(windowService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get window by ID")
    public ResponseEntity<Window> findById(@PathVariable Integer id) {
        return windowService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new window")
    public ResponseEntity<Window> create(@RequestBody Window window) {
        Window saved = windowService.save(window);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing window")
    public ResponseEntity<Window> update(@PathVariable Integer id, @RequestBody Window window) {
        if (!windowService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        window.setAdWindowId(id);
        Window updated = windowService.save(window);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a window")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!windowService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        windowService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
