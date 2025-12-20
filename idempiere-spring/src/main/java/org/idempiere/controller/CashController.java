package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Cash;
import org.idempiere.model.CashLine;
import org.idempiere.model.CashBook;
import org.idempiere.service.CashService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Cash entity operations.
 */
@RestController
@RequestMapping("/api/cash")
@Tag(name = "Cash", description = "Cash management APIs")
public class CashController {

    private final CashService cashService;

    public CashController(CashService cashService) {
        this.cashService = cashService;
    }

    // Cash endpoints

    @GetMapping
    @Operation(summary = "Get all cash journals")
    public ResponseEntity<List<Cash>> findAll() {
        return ResponseEntity.ok(cashService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get cash journal by ID")
    public ResponseEntity<Cash> findById(@PathVariable Integer id) {
        return cashService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/documentno/{documentNo}/client/{clientId}")
    @Operation(summary = "Get cash journal by document number")
    public ResponseEntity<Cash> findByDocumentNo(@PathVariable String documentNo, @PathVariable Integer clientId) {
        return cashService.findByDocumentNo(documentNo, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/cashbook/{cashBookId}")
    @Operation(summary = "Get cash journals by cash book")
    public ResponseEntity<List<Cash>> findByCashBook(@PathVariable Integer cashBookId) {
        return ResponseEntity.ok(cashService.findByCashBook(cashBookId));
    }

    @GetMapping("/status/{docStatus}/client/{clientId}")
    @Operation(summary = "Get cash journals by document status")
    public ResponseEntity<List<Cash>> findByDocStatus(@PathVariable String docStatus, @PathVariable Integer clientId) {
        return ResponseEntity.ok(cashService.findByDocStatus(docStatus, clientId));
    }

    @PostMapping
    @Operation(summary = "Create a new cash journal")
    public ResponseEntity<Cash> create(@RequestBody Cash cash) {
        Cash saved = cashService.save(cash);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing cash journal")
    public ResponseEntity<Cash> update(@PathVariable Integer id, @RequestBody Cash cash) {
        if (!cashService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        cash.setCCashId(id);
        Cash updated = cashService.save(cash);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a cash journal")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!cashService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        cashService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // CashLine endpoints

    @GetMapping("/{cashId}/lines")
    @Operation(summary = "Get all lines for a cash journal")
    public ResponseEntity<List<CashLine>> findLinesByCash(@PathVariable Integer cashId) {
        return ResponseEntity.ok(cashService.findLinesByCash(cashId));
    }

    @PostMapping("/{cashId}/lines")
    @Operation(summary = "Add a line to cash journal")
    public ResponseEntity<CashLine> createLine(@PathVariable Integer cashId, @RequestBody CashLine line) {
        line.setCCashId(cashId);
        CashLine saved = cashService.saveLine(line);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // CashBook endpoints

    @GetMapping("/cashbooks/org/{orgId}")
    @Operation(summary = "Get cash books by organization")
    public ResponseEntity<List<CashBook>> findCashBooksByOrg(@PathVariable Integer orgId) {
        return ResponseEntity.ok(cashService.findCashBooksByOrg(orgId));
    }

    @GetMapping("/cashbooks/org/{orgId}/default")
    @Operation(summary = "Get default cash book for organization")
    public ResponseEntity<CashBook> findDefaultCashBook(@PathVariable Integer orgId) {
        return cashService.findDefaultCashBook(orgId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
