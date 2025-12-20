package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Journal;
import org.idempiere.model.JournalLine;
import org.idempiere.model.JournalBatch;
import org.idempiere.service.JournalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Journal entity operations.
 */
@RestController
@RequestMapping("/api/journals")
@Tag(name = "Journal", description = "GL Journal management APIs")
public class JournalController {

    private final JournalService journalService;

    public JournalController(JournalService journalService) {
        this.journalService = journalService;
    }

    // Journal endpoints

    @GetMapping
    @Operation(summary = "Get all journals")
    public ResponseEntity<List<Journal>> findAll() {
        return ResponseEntity.ok(journalService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get journal by ID")
    public ResponseEntity<Journal> findById(@PathVariable Integer id) {
        return journalService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/documentno/{documentNo}/client/{clientId}")
    @Operation(summary = "Get journal by document number")
    public ResponseEntity<Journal> findByDocumentNo(@PathVariable String documentNo, @PathVariable Integer clientId) {
        return journalService.findByDocumentNo(documentNo, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/batch/{batchId}")
    @Operation(summary = "Get journals by batch")
    public ResponseEntity<List<Journal>> findByBatch(@PathVariable Integer batchId) {
        return ResponseEntity.ok(journalService.findByBatch(batchId));
    }

    @GetMapping("/status/{docStatus}/client/{clientId}")
    @Operation(summary = "Get journals by document status")
    public ResponseEntity<List<Journal>> findByDocStatus(@PathVariable String docStatus, @PathVariable Integer clientId) {
        return ResponseEntity.ok(journalService.findByDocStatus(docStatus, clientId));
    }

    @PostMapping
    @Operation(summary = "Create a new journal")
    public ResponseEntity<Journal> create(@RequestBody Journal journal) {
        Journal saved = journalService.save(journal);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing journal")
    public ResponseEntity<Journal> update(@PathVariable Integer id, @RequestBody Journal journal) {
        if (!journalService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        journal.setGlJournalId(id);
        Journal updated = journalService.save(journal);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a journal")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!journalService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        journalService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // JournalLine endpoints

    @GetMapping("/{journalId}/lines")
    @Operation(summary = "Get all lines for a journal")
    public ResponseEntity<List<JournalLine>> findLinesByJournal(@PathVariable Integer journalId) {
        return ResponseEntity.ok(journalService.findLinesByJournal(journalId));
    }

    @PostMapping("/{journalId}/lines")
    @Operation(summary = "Add a line to journal")
    public ResponseEntity<JournalLine> createLine(@PathVariable Integer journalId, @RequestBody JournalLine line) {
        line.setGlJournalId(journalId);
        JournalLine saved = journalService.saveLine(line);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // JournalBatch endpoints

    @GetMapping("/batches")
    @Operation(summary = "Get all journal batches")
    public ResponseEntity<List<JournalBatch>> findAllBatches() {
        return ResponseEntity.ok(journalService.findAllBatches());
    }

    @GetMapping("/batches/{id}")
    @Operation(summary = "Get journal batch by ID")
    public ResponseEntity<JournalBatch> findBatchById(@PathVariable Integer id) {
        return journalService.findBatchById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/batches/documentno/{documentNo}/client/{clientId}")
    @Operation(summary = "Get journal batch by document number")
    public ResponseEntity<JournalBatch> findBatchByDocumentNo(@PathVariable String documentNo, @PathVariable Integer clientId) {
        return journalService.findBatchByDocumentNo(documentNo, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/batches/status/{docStatus}/client/{clientId}")
    @Operation(summary = "Get journal batches by document status")
    public ResponseEntity<List<JournalBatch>> findBatchesByDocStatus(@PathVariable String docStatus, @PathVariable Integer clientId) {
        return ResponseEntity.ok(journalService.findBatchesByDocStatus(docStatus, clientId));
    }

    @PostMapping("/batches")
    @Operation(summary = "Create a new journal batch")
    public ResponseEntity<JournalBatch> createBatch(@RequestBody JournalBatch batch) {
        JournalBatch saved = journalService.saveBatch(batch);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
