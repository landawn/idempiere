package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Production;
import org.idempiere.model.ProductionLine;
import org.idempiere.model.BOM;
import org.idempiere.model.BOMLine;
import org.idempiere.service.ProductionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for Production operations.
 */
@RestController
@RequestMapping("/api/production")
public class ProductionController {

    private final ProductionService productionService;

    public ProductionController(ProductionService productionService) {
        this.productionService = productionService;
    }

    // Production endpoints
    @GetMapping
    public ResponseEntity<List<Production>> getAllProductions() {
        return ResponseEntity.ok(productionService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Production> getProductionById(@PathVariable Integer id) {
        return productionService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/document")
    public ResponseEntity<Production> getProductionByDocumentNo(@RequestParam String documentNo, @RequestParam Integer clientId) {
        return productionService.findByDocumentNo(documentNo, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/status/{docStatus}/client/{clientId}")
    public ResponseEntity<List<Production>> getProductionsByStatus(@PathVariable String docStatus, @PathVariable Integer clientId) {
        return ResponseEntity.ok(productionService.findByDocStatus(docStatus, clientId));
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<Production>> getProductionsByProduct(@PathVariable Integer productId) {
        return ResponseEntity.ok(productionService.findByProduct(productId));
    }

    @PostMapping
    public ResponseEntity<Production> createProduction(@RequestBody Production production) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productionService.save(production));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Production> updateProduction(@PathVariable Integer id, @RequestBody Production production) {
        if (!productionService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        production.setMProductionId(id);
        return ResponseEntity.ok(productionService.save(production));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduction(@PathVariable Integer id) {
        if (!productionService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        productionService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // ProductionLine endpoints
    @GetMapping("/{productionId}/lines")
    public ResponseEntity<List<ProductionLine>> getProductionLines(@PathVariable Integer productionId) {
        return ResponseEntity.ok(productionService.findLinesByProduction(productionId));
    }

    @PostMapping("/{productionId}/lines")
    public ResponseEntity<ProductionLine> createProductionLine(@PathVariable Integer productionId, @RequestBody ProductionLine line) {
        line.setMProductionId(productionId);
        return ResponseEntity.status(HttpStatus.CREATED).body(productionService.saveLine(line));
    }

    @PutMapping("/lines/{id}")
    public ResponseEntity<ProductionLine> updateProductionLine(@PathVariable Integer id, @RequestBody ProductionLine line) {
        line.setMProductionLineId(id);
        return ResponseEntity.ok(productionService.saveLine(line));
    }

    // BOM endpoints
    @GetMapping("/bom/{id}")
    public ResponseEntity<BOM> getBOMById(@PathVariable Integer id) {
        return productionService.findBOMById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/bom/product/{productId}")
    public ResponseEntity<List<BOM>> getBOMsByProduct(@PathVariable Integer productId) {
        return ResponseEntity.ok(productionService.findBOMsByProduct(productId));
    }

    @GetMapping("/bom/client/{clientId}")
    public ResponseEntity<List<BOM>> getBOMsByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(productionService.findBOMsByClient(clientId));
    }

    @GetMapping("/bom/product/{productId}/type/{bomType}")
    public ResponseEntity<BOM> getBOMByProductAndType(@PathVariable Integer productId, @PathVariable String bomType) {
        return productionService.findBOMByProductAndType(productId, bomType)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/bom")
    public ResponseEntity<BOM> createBOM(@RequestBody BOM bom) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productionService.saveBOM(bom));
    }

    @PutMapping("/bom/{id}")
    public ResponseEntity<BOM> updateBOM(@PathVariable Integer id, @RequestBody BOM bom) {
        if (!productionService.findBOMById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        bom.setMBomId(id);
        return ResponseEntity.ok(productionService.saveBOM(bom));
    }

    // BOMLine endpoints
    @GetMapping("/bom/{bomId}/lines")
    public ResponseEntity<List<BOMLine>> getBOMLines(@PathVariable Integer bomId) {
        return ResponseEntity.ok(productionService.findBOMLinesByBOM(bomId));
    }

    @PostMapping("/bom/{bomId}/lines")
    public ResponseEntity<BOMLine> createBOMLine(@PathVariable Integer bomId, @RequestBody BOMLine line) {
        line.setMBomId(bomId);
        return ResponseEntity.status(HttpStatus.CREATED).body(productionService.saveBOMLine(line));
    }

    @PutMapping("/bom/lines/{id}")
    public ResponseEntity<BOMLine> updateBOMLine(@PathVariable Integer id, @RequestBody BOMLine line) {
        line.setMBomLineId(id);
        return ResponseEntity.ok(productionService.saveBOMLine(line));
    }
}
