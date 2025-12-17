package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Client;
import org.idempiere.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Client entity operations.
 */
@RestController
@RequestMapping("/api/clients")
@Tag(name = "Client", description = "Client management APIs")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    @Operation(summary = "Get all clients")
    public ResponseEntity<List<Client>> findAll() {
        return ResponseEntity.ok(clientService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get client by ID")
    public ResponseEntity<Client> findById(@PathVariable Integer id) {
        return clientService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/value/{value}")
    @Operation(summary = "Get client by value/code")
    public ResponseEntity<Client> findByValue(@PathVariable String value) {
        return clientService.findByValue(value)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/active")
    @Operation(summary = "Get all active clients")
    public ResponseEntity<List<Client>> findAllActive() {
        return ResponseEntity.ok(clientService.findAllActive());
    }

    @PostMapping
    @Operation(summary = "Create a new client")
    public ResponseEntity<Client> create(@RequestBody Client client) {
        Client saved = clientService.save(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing client")
    public ResponseEntity<Client> update(@PathVariable Integer id, @RequestBody Client client) {
        if (!clientService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        client.setAdClientId(id);
        Client updated = clientService.save(client);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a client")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!clientService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        clientService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
