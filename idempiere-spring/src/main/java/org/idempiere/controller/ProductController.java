package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Product;
import org.idempiere.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Product entity operations.
 */
@RestController
@RequestMapping("/api/products")
@Tag(name = "Product", description = "Product management APIs")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    @Operation(summary = "Get all products")
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get product by ID")
    public ResponseEntity<Product> findById(@PathVariable Integer id) {
        return productService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/value/{value}")
    @Operation(summary = "Get product by value/SKU")
    public ResponseEntity<Product> findByValue(@PathVariable String value) {
        return productService.findByValue(value)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/name/{name}")
    @Operation(summary = "Get product by name")
    public ResponseEntity<Product> findByName(@PathVariable String name) {
        return productService.findByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/category/{categoryId}")
    @Operation(summary = "Get products by category")
    public ResponseEntity<List<Product>> findByProductCategoryId(@PathVariable Integer categoryId) {
        return ResponseEntity.ok(productService.findByProductCategoryId(categoryId));
    }

    @GetMapping("/stocked")
    @Operation(summary = "Get all stocked products")
    public ResponseEntity<List<Product>> findAllStocked() {
        return ResponseEntity.ok(productService.findAllStocked());
    }

    @GetMapping("/purchased")
    @Operation(summary = "Get all purchased products")
    public ResponseEntity<List<Product>> findAllPurchased() {
        return ResponseEntity.ok(productService.findAllPurchased());
    }

    @GetMapping("/sold")
    @Operation(summary = "Get all sold products")
    public ResponseEntity<List<Product>> findAllSold() {
        return ResponseEntity.ok(productService.findAllSold());
    }

    @GetMapping("/type/{productType}")
    @Operation(summary = "Get products by type")
    public ResponseEntity<List<Product>> findByProductType(@PathVariable String productType) {
        return ResponseEntity.ok(productService.findByProductType(productType));
    }

    @GetMapping("/active")
    @Operation(summary = "Get all active products")
    public ResponseEntity<List<Product>> findAllActive() {
        return ResponseEntity.ok(productService.findAllActive());
    }

    @PostMapping
    @Operation(summary = "Create a new product")
    public ResponseEntity<Product> create(@RequestBody Product product) {
        Product saved = productService.save(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing product")
    public ResponseEntity<Product> update(@PathVariable Integer id, @RequestBody Product product) {
        if (!productService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        product.setMProductId(id);
        Product updated = productService.save(product);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a product")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!productService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
