package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.BankStatement;
import org.idempiere.service.BankStatementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for BankStatement entity operations.
 */
@RestController
@RequestMapping("/api/bank-statements")
@Tag(name = "Bank Statement", description = "Bank statement management APIs")
public class BankStatementController {

    private final BankStatementService bankStatementService;

    public BankStatementController(BankStatementService bankStatementService) {
        this.bankStatementService = bankStatementService;
    }

    @GetMapping
    @Operation(summary = "Get all bank statements")
    public ResponseEntity<List<BankStatement>> findAll() {
        return ResponseEntity.ok(bankStatementService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get bank statement by ID")
    public ResponseEntity<BankStatement> findById(@PathVariable Integer id) {
        return bankStatementService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new bank statement")
    public ResponseEntity<BankStatement> create(@RequestBody BankStatement bankStatement) {
        BankStatement saved = bankStatementService.save(bankStatement);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing bank statement")
    public ResponseEntity<BankStatement> update(@PathVariable Integer id, @RequestBody BankStatement bankStatement) {
        if (!bankStatementService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        bankStatement.setCBankStatementId(id);
        BankStatement updated = bankStatementService.save(bankStatement);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a bank statement")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!bankStatementService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        bankStatementService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
