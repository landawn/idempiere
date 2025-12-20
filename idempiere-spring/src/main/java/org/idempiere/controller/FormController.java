package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Form;
import org.idempiere.service.FormService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Form entity operations.
 */
@RestController
@RequestMapping("/api/forms")
@Tag(name = "Form", description = "Form management APIs")
public class FormController {

    private final FormService formService;

    public FormController(FormService formService) {
        this.formService = formService;
    }

    @GetMapping
    @Operation(summary = "Get all forms")
    public ResponseEntity<List<Form>> findAll() {
        return ResponseEntity.ok(formService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get form by ID")
    public ResponseEntity<Form> findById(@PathVariable Integer id) {
        return formService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new form")
    public ResponseEntity<Form> create(@RequestBody Form form) {
        Form saved = formService.save(form);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing form")
    public ResponseEntity<Form> update(@PathVariable Integer id, @RequestBody Form form) {
        if (!formService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        form.setAdFormId(id);
        Form updated = formService.save(form);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a form")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!formService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        formService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
