package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.User;
import org.idempiere.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for User entity operations.
 */
@RestController
@RequestMapping("/api/users")
@Tag(name = "User", description = "User management APIs")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @Operation(summary = "Get all users")
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get user by ID")
    public ResponseEntity<User> findById(@PathVariable Integer id) {
        return userService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/name/{name}")
    @Operation(summary = "Get user by name")
    public ResponseEntity<User> findByName(@PathVariable String name) {
        return userService.findByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/email/{email}")
    @Operation(summary = "Get user by email")
    public ResponseEntity<User> findByEmail(@PathVariable String email) {
        return userService.findByEmail(email)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/client/{clientId}")
    @Operation(summary = "Get users by client ID")
    public ResponseEntity<List<User>> findByClientId(@PathVariable Integer clientId) {
        return ResponseEntity.ok(userService.findByClientId(clientId));
    }

    @GetMapping("/bpartner/{bPartnerId}")
    @Operation(summary = "Get users by business partner ID")
    public ResponseEntity<List<User>> findByBPartnerId(@PathVariable Integer bPartnerId) {
        return ResponseEntity.ok(userService.findByBPartnerId(bPartnerId));
    }

    @GetMapping("/active")
    @Operation(summary = "Get all active users")
    public ResponseEntity<List<User>> findAllActive() {
        return ResponseEntity.ok(userService.findAllActive());
    }

    @PostMapping
    @Operation(summary = "Create a new user")
    public ResponseEntity<User> create(@RequestBody User user) {
        User saved = userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing user")
    public ResponseEntity<User> update(@PathVariable Integer id, @RequestBody User user) {
        if (!userService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        user.setAdUserId(id);
        User updated = userService.save(user);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a user")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!userService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
