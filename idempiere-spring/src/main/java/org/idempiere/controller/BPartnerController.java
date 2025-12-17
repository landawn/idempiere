package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.BPartner;
import org.idempiere.service.BPartnerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Business Partner entity operations.
 */
@RestController
@RequestMapping("/api/bpartners")
@Tag(name = "Business Partner", description = "Business Partner management APIs")
public class BPartnerController {

    private final BPartnerService bPartnerService;

    public BPartnerController(BPartnerService bPartnerService) {
        this.bPartnerService = bPartnerService;
    }

    @GetMapping
    @Operation(summary = "Get all business partners")
    public ResponseEntity<List<BPartner>> findAll() {
        return ResponseEntity.ok(bPartnerService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get business partner by ID")
    public ResponseEntity<BPartner> findById(@PathVariable Integer id) {
        return bPartnerService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/value/{value}")
    @Operation(summary = "Get business partner by value/code")
    public ResponseEntity<BPartner> findByValue(@PathVariable String value) {
        return bPartnerService.findByValue(value)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/name/{name}")
    @Operation(summary = "Get business partners by name")
    public ResponseEntity<List<BPartner>> findByName(@PathVariable String name) {
        return ResponseEntity.ok(bPartnerService.findByName(name));
    }

    @GetMapping("/customers")
    @Operation(summary = "Get all customers")
    public ResponseEntity<List<BPartner>> findAllCustomers() {
        return ResponseEntity.ok(bPartnerService.findAllCustomers());
    }

    @GetMapping("/vendors")
    @Operation(summary = "Get all vendors")
    public ResponseEntity<List<BPartner>> findAllVendors() {
        return ResponseEntity.ok(bPartnerService.findAllVendors());
    }

    @GetMapping("/employees")
    @Operation(summary = "Get all employees")
    public ResponseEntity<List<BPartner>> findAllEmployees() {
        return ResponseEntity.ok(bPartnerService.findAllEmployees());
    }

    @GetMapping("/salesrep/{salesRepId}")
    @Operation(summary = "Get business partners by sales representative")
    public ResponseEntity<List<BPartner>> findBySalesRepId(@PathVariable Integer salesRepId) {
        return ResponseEntity.ok(bPartnerService.findBySalesRepId(salesRepId));
    }

    @GetMapping("/group/{groupId}")
    @Operation(summary = "Get business partners by group")
    public ResponseEntity<List<BPartner>> findByBPartnerGroupId(@PathVariable Integer groupId) {
        return ResponseEntity.ok(bPartnerService.findByBPartnerGroupId(groupId));
    }

    @GetMapping("/active")
    @Operation(summary = "Get all active business partners")
    public ResponseEntity<List<BPartner>> findAllActive() {
        return ResponseEntity.ok(bPartnerService.findAllActive());
    }

    @PostMapping
    @Operation(summary = "Create a new business partner")
    public ResponseEntity<BPartner> create(@RequestBody BPartner bPartner) {
        BPartner saved = bPartnerService.save(bPartner);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing business partner")
    public ResponseEntity<BPartner> update(@PathVariable Integer id, @RequestBody BPartner bPartner) {
        if (!bPartnerService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        bPartner.setCBPartnerId(id);
        BPartner updated = bPartnerService.save(bPartner);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a business partner")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!bPartnerService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        bPartnerService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
