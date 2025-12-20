package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.DocType;
import org.idempiere.service.DocTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for DocumentType entity operations.
 */
@RestController
@RequestMapping("/api/document-types")
@Tag(name = "Document Type", description = "Document type management APIs")
public class DocumentTypeController {

    private final DocTypeService docTypeService;

    public DocumentTypeController(DocTypeService docTypeService) {
        this.docTypeService = docTypeService;
    }

    @GetMapping
    @Operation(summary = "Get all document types")
    public ResponseEntity<List<DocType>> findAll() {
        return ResponseEntity.ok(docTypeService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get document type by ID")
    public ResponseEntity<DocType> findById(@PathVariable Integer id) {
        return docTypeService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new document type")
    public ResponseEntity<DocType> create(@RequestBody DocType docType) {
        DocType saved = docTypeService.save(docType);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing document type")
    public ResponseEntity<DocType> update(@PathVariable Integer id, @RequestBody DocType docType) {
        if (!docTypeService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        docType.setCDocTypeId(id);
        DocType updated = docTypeService.save(docType);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a document type")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!docTypeService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        docTypeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
