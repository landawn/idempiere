package org.idempiere.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.idempiere.model.Transaction;
import org.idempiere.service.TransactionService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for Inventory Transaction operations.
 */
@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public ResponseEntity<List<Transaction>> getAllTransactions() {
        return ResponseEntity.ok(transactionService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> getTransactionById(@PathVariable Integer id) {
        return transactionService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<Transaction>> getTransactionsByProduct(@PathVariable Integer productId) {
        return ResponseEntity.ok(transactionService.findByProduct(productId));
    }

    @GetMapping("/locator/{locatorId}")
    public ResponseEntity<List<Transaction>> getTransactionsByLocator(@PathVariable Integer locatorId) {
        return ResponseEntity.ok(transactionService.findByLocator(locatorId));
    }

    @GetMapping("/movement-type/{movementType}")
    public ResponseEntity<List<Transaction>> getTransactionsByMovementType(@PathVariable String movementType) {
        return ResponseEntity.ok(transactionService.findByMovementType(movementType));
    }

    @GetMapping("/date-range")
    public ResponseEntity<List<Transaction>> getTransactionsByDateRange(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate) {
        return ResponseEntity.ok(transactionService.findByDateRange(startDate, endDate));
    }

    @GetMapping("/inout-line/{inOutLineId}")
    public ResponseEntity<List<Transaction>> getTransactionsByInOutLine(@PathVariable Integer inOutLineId) {
        return ResponseEntity.ok(transactionService.findByInOutLine(inOutLineId));
    }

    @GetMapping("/inventory-line/{inventoryLineId}")
    public ResponseEntity<List<Transaction>> getTransactionsByInventoryLine(@PathVariable Integer inventoryLineId) {
        return ResponseEntity.ok(transactionService.findByInventoryLine(inventoryLineId));
    }

    @GetMapping("/movement-line/{movementLineId}")
    public ResponseEntity<List<Transaction>> getTransactionsByMovementLine(@PathVariable Integer movementLineId) {
        return ResponseEntity.ok(transactionService.findByMovementLine(movementLineId));
    }

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
        return ResponseEntity.status(HttpStatus.CREATED).body(transactionService.save(transaction));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transaction> updateTransaction(@PathVariable Integer id, @RequestBody Transaction transaction) {
        if (!transactionService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        transaction.setMTransactionId(id);
        return ResponseEntity.ok(transactionService.save(transaction));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable Integer id) {
        if (!transactionService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        transactionService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
