package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.ElementValue;
import org.idempiere.model.AcctSchema;
import org.idempiere.model.ValidCombination;
import org.idempiere.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Account entity operations.
 */
@RestController
@RequestMapping("/api/accounts")
@Tag(name = "Account", description = "Account management APIs")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // ElementValue (Account) endpoints

    @GetMapping
    @Operation(summary = "Get all accounts")
    public ResponseEntity<List<ElementValue>> findAll() {
        return ResponseEntity.ok(accountService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get account by ID")
    public ResponseEntity<ElementValue> findById(@PathVariable Integer id) {
        return accountService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/element/{elementId}")
    @Operation(summary = "Get accounts by element")
    public ResponseEntity<List<ElementValue>> findByElement(@PathVariable Integer elementId) {
        return ResponseEntity.ok(accountService.findByElement(elementId));
    }

    @GetMapping("/element/{elementId}/value/{value}")
    @Operation(summary = "Get account by value")
    public ResponseEntity<ElementValue> findByValue(@PathVariable Integer elementId, @PathVariable String value) {
        return accountService.findByValue(value, elementId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/element/{elementId}/type/{accountType}")
    @Operation(summary = "Get accounts by account type")
    public ResponseEntity<List<ElementValue>> findByAccountType(@PathVariable Integer elementId, @PathVariable String accountType) {
        return ResponseEntity.ok(accountService.findByAccountType(accountType, elementId));
    }

    @PostMapping
    @Operation(summary = "Create a new account")
    public ResponseEntity<ElementValue> create(@RequestBody ElementValue elementValue) {
        ElementValue saved = accountService.save(elementValue);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing account")
    public ResponseEntity<ElementValue> update(@PathVariable Integer id, @RequestBody ElementValue elementValue) {
        if (!accountService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        elementValue.setCElementValueId(id);
        ElementValue updated = accountService.save(elementValue);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete an account")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!accountService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        accountService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // AccountSchema endpoints

    @GetMapping("/schemas")
    @Operation(summary = "Get all account schemas")
    public ResponseEntity<List<AcctSchema>> findAllAccountSchemas() {
        return ResponseEntity.ok(accountService.findAllAccountSchemas());
    }

    @GetMapping("/schemas/{id}")
    @Operation(summary = "Get account schema by ID")
    public ResponseEntity<AcctSchema> findAccountSchemaById(@PathVariable Integer id) {
        return accountService.findAccountSchemaById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/schemas/client/{clientId}")
    @Operation(summary = "Get account schemas by client")
    public ResponseEntity<List<AcctSchema>> findAccountSchemasByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(accountService.findAccountSchemasByClient(clientId));
    }

    @GetMapping("/schemas/client/{clientId}/default")
    @Operation(summary = "Get default account schema")
    public ResponseEntity<AcctSchema> findDefaultAccountSchema(@PathVariable Integer clientId) {
        return accountService.findDefaultAccountSchema(clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/schemas")
    @Operation(summary = "Create a new account schema")
    public ResponseEntity<AcctSchema> createAccountSchema(@RequestBody AcctSchema accountSchema) {
        AcctSchema saved = accountService.saveAccountSchema(accountSchema);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // ValidCombination endpoints

    @GetMapping("/combinations/{id}")
    @Operation(summary = "Get valid combination by ID")
    public ResponseEntity<ValidCombination> findValidCombinationById(@PathVariable Integer id) {
        return accountService.findValidCombinationById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/combinations/account/{accountId}")
    @Operation(summary = "Get valid combinations by account")
    public ResponseEntity<List<ValidCombination>> findValidCombinationsByAccount(@PathVariable Integer accountId) {
        return ResponseEntity.ok(accountService.findValidCombinationsByAccount(accountId));
    }

    @PostMapping("/combinations")
    @Operation(summary = "Create a new valid combination")
    public ResponseEntity<ValidCombination> createValidCombination(@RequestBody ValidCombination validCombination) {
        ValidCombination saved = accountService.saveValidCombination(validCombination);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
