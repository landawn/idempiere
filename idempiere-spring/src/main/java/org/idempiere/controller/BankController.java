package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Bank;
import org.idempiere.model.BankAccount;
import org.idempiere.model.BankStatement;
import org.idempiere.model.BankStatementLine;
import org.idempiere.service.BankService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Bank entity operations.
 */
@RestController
@RequestMapping("/api/banks")
@Tag(name = "Bank", description = "Bank management APIs")
public class BankController {

    private final BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping
    @Operation(summary = "Get all banks")
    public ResponseEntity<List<Bank>> findAll() {
        return ResponseEntity.ok(bankService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get bank by ID")
    public ResponseEntity<Bank> findById(@PathVariable Integer id) {
        return bankService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/client/{clientId}")
    @Operation(summary = "Get banks by client")
    public ResponseEntity<List<Bank>> findByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(bankService.findByClient(clientId));
    }

    @GetMapping("/routing/{routingNo}")
    @Operation(summary = "Get bank by routing number")
    public ResponseEntity<Bank> findByRoutingNo(@PathVariable String routingNo) {
        return bankService.findByRoutingNo(routingNo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new bank")
    public ResponseEntity<Bank> create(@RequestBody Bank bank) {
        Bank saved = bankService.save(bank);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing bank")
    public ResponseEntity<Bank> update(@PathVariable Integer id, @RequestBody Bank bank) {
        if (!bankService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        bank.setCBankId(id);
        Bank updated = bankService.save(bank);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a bank")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!bankService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        bankService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // BankAccount endpoints

    @GetMapping("/{bankId}/accounts")
    @Operation(summary = "Get all accounts for a bank")
    public ResponseEntity<List<BankAccount>> findBankAccountsByBank(@PathVariable Integer bankId) {
        return ResponseEntity.ok(bankService.findBankAccountsByBank(bankId));
    }

    @GetMapping("/accounts/{id}")
    @Operation(summary = "Get bank account by ID")
    public ResponseEntity<BankAccount> findBankAccountById(@PathVariable Integer id) {
        return bankService.findBankAccountById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/accounts/currency/{currencyId}")
    @Operation(summary = "Get bank accounts by currency")
    public ResponseEntity<List<BankAccount>> findBankAccountsByCurrency(@PathVariable Integer currencyId) {
        return ResponseEntity.ok(bankService.findBankAccountsByCurrency(currencyId));
    }

    @GetMapping("/accounts/default")
    @Operation(summary = "Get default bank account")
    public ResponseEntity<BankAccount> findDefaultBankAccount() {
        return bankService.findDefaultBankAccount()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/{bankId}/accounts")
    @Operation(summary = "Create a new bank account")
    public ResponseEntity<BankAccount> createBankAccount(@PathVariable Integer bankId, @RequestBody BankAccount bankAccount) {
        bankAccount.setCBankId(bankId);
        BankAccount saved = bankService.saveBankAccount(bankAccount);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // BankStatement endpoints

    @GetMapping("/accounts/{bankAccountId}/statements")
    @Operation(summary = "Get all statements for a bank account")
    public ResponseEntity<List<BankStatement>> findBankStatementsByBankAccount(@PathVariable Integer bankAccountId) {
        return ResponseEntity.ok(bankService.findBankStatementsByBankAccount(bankAccountId));
    }

    @GetMapping("/statements/{id}")
    @Operation(summary = "Get bank statement by ID")
    public ResponseEntity<BankStatement> findBankStatementById(@PathVariable Integer id) {
        return bankService.findBankStatementById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/accounts/{bankAccountId}/statements")
    @Operation(summary = "Create a new bank statement")
    public ResponseEntity<BankStatement> createBankStatement(@PathVariable Integer bankAccountId, @RequestBody BankStatement bankStatement) {
        bankStatement.setCBankAccountId(bankAccountId);
        BankStatement saved = bankService.saveBankStatement(bankStatement);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // BankStatementLine endpoints

    @GetMapping("/statements/{bankStatementId}/lines")
    @Operation(summary = "Get all lines for a bank statement")
    public ResponseEntity<List<BankStatementLine>> findLinesByBankStatement(@PathVariable Integer bankStatementId) {
        return ResponseEntity.ok(bankService.findLinesByBankStatement(bankStatementId));
    }

    @PostMapping("/statements/{bankStatementId}/lines")
    @Operation(summary = "Add a line to bank statement")
    public ResponseEntity<BankStatementLine> createBankStatementLine(@PathVariable Integer bankStatementId, @RequestBody BankStatementLine line) {
        line.setCBankStatementId(bankStatementId);
        BankStatementLine saved = bankService.saveBankStatementLine(line);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
