package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Organization;
import org.idempiere.service.OrganizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Organization entity operations.
 */
@RestController
@RequestMapping("/api/organizations")
@Tag(name = "Organization", description = "Organization management APIs")
public class OrganizationController {

    private final OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping
    @Operation(summary = "Get all organizations")
    public ResponseEntity<List<Organization>> findAll() {
        return ResponseEntity.ok(organizationService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get organization by ID")
    public ResponseEntity<Organization> findById(@PathVariable Integer id) {
        return organizationService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/value/{value}")
    @Operation(summary = "Get organization by value/code")
    public ResponseEntity<Organization> findByValue(@PathVariable String value) {
        return organizationService.findByValue(value)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/client/{clientId}")
    @Operation(summary = "Get organizations by client ID")
    public ResponseEntity<List<Organization>> findByClientId(@PathVariable Integer clientId) {
        return ResponseEntity.ok(organizationService.findByClientId(clientId));
    }

    @GetMapping("/active")
    @Operation(summary = "Get all active organizations")
    public ResponseEntity<List<Organization>> findAllActive() {
        return ResponseEntity.ok(organizationService.findAllActive());
    }

    @GetMapping("/summary")
    @Operation(summary = "Get all summary organizations")
    public ResponseEntity<List<Organization>> findSummaryOrganizations() {
        return ResponseEntity.ok(organizationService.findSummaryOrganizations());
    }

    @PostMapping
    @Operation(summary = "Create a new organization")
    public ResponseEntity<Organization> create(@RequestBody Organization organization) {
        Organization saved = organizationService.save(organization);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing organization")
    public ResponseEntity<Organization> update(@PathVariable Integer id, @RequestBody Organization organization) {
        if (!organizationService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        organization.setAdOrgId(id);
        Organization updated = organizationService.save(organization);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete an organization")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!organizationService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        organizationService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
