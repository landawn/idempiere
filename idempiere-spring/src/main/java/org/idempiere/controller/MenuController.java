package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Menu;
import org.idempiere.service.MenuService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Menu entity operations.
 */
@RestController
@RequestMapping("/api/menus")
@Tag(name = "Menu", description = "Menu management APIs")
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping
    @Operation(summary = "Get all menus")
    public ResponseEntity<List<Menu>> findAll() {
        return ResponseEntity.ok(menuService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get menu by ID")
    public ResponseEntity<Menu> findById(@PathVariable Integer id) {
        return menuService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new menu")
    public ResponseEntity<Menu> create(@RequestBody Menu menu) {
        Menu saved = menuService.save(menu);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing menu")
    public ResponseEntity<Menu> update(@PathVariable Integer id, @RequestBody Menu menu) {
        if (!menuService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        menu.setAdMenuId(id);
        Menu updated = menuService.save(menu);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a menu")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!menuService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        menuService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
