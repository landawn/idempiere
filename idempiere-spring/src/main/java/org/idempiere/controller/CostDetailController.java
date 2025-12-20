package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.CostDetail;
import org.idempiere.model.CostType;
import org.idempiere.service.CostDetailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for Cost Detail operations.
 */
@RestController
@RequestMapping("/api/costs")
public class CostDetailController {

    private final CostDetailService costDetailService;

    public CostDetailController(CostDetailService costDetailService) {
        this.costDetailService = costDetailService;
    }

    // CostDetail endpoints
    @GetMapping("/details/{id}")
    public ResponseEntity<CostDetail> getCostDetailById(@PathVariable Integer id) {
        return costDetailService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/details/product/{productId}")
    public ResponseEntity<List<CostDetail>> getCostDetailsByProduct(@PathVariable Integer productId) {
        return ResponseEntity.ok(costDetailService.findByProduct(productId));
    }

    @GetMapping("/details/invoice-line/{invoiceLineId}")
    public ResponseEntity<List<CostDetail>> getCostDetailsByInvoiceLine(@PathVariable Integer invoiceLineId) {
        return ResponseEntity.ok(costDetailService.findByInvoiceLine(invoiceLineId));
    }

    @GetMapping("/details/inout-line/{inOutLineId}")
    public ResponseEntity<List<CostDetail>> getCostDetailsByInOutLine(@PathVariable Integer inOutLineId) {
        return ResponseEntity.ok(costDetailService.findByInOutLine(inOutLineId));
    }

    @GetMapping("/details/movement-line/{movementLineId}")
    public ResponseEntity<List<CostDetail>> getCostDetailsByMovementLine(@PathVariable Integer movementLineId) {
        return ResponseEntity.ok(costDetailService.findByMovementLine(movementLineId));
    }

    @PostMapping("/details")
    public ResponseEntity<CostDetail> createCostDetail(@RequestBody CostDetail costDetail) {
        return ResponseEntity.status(HttpStatus.CREATED).body(costDetailService.save(costDetail));
    }

    @PutMapping("/details/{id}")
    public ResponseEntity<CostDetail> updateCostDetail(@PathVariable Integer id, @RequestBody CostDetail costDetail) {
        if (!costDetailService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        costDetail.setMCostDetailId(id);
        return ResponseEntity.ok(costDetailService.save(costDetail));
    }

    @DeleteMapping("/details/{id}")
    public ResponseEntity<Void> deleteCostDetail(@PathVariable Integer id) {
        if (!costDetailService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        costDetailService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // CostType endpoints
    @GetMapping("/types/{id}")
    public ResponseEntity<CostType> getCostTypeById(@PathVariable Integer id) {
        return costDetailService.findCostTypeById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/types/client/{clientId}")
    public ResponseEntity<List<CostType>> getCostTypesByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(costDetailService.findCostTypesByClient(clientId));
    }

    @GetMapping("/types/name")
    public ResponseEntity<CostType> getCostTypeByName(@RequestParam String name, @RequestParam Integer clientId) {
        return costDetailService.findCostTypeByName(name, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/types")
    public ResponseEntity<CostType> createCostType(@RequestBody CostType costType) {
        return ResponseEntity.status(HttpStatus.CREATED).body(costDetailService.saveCostType(costType));
    }

    @PutMapping("/types/{id}")
    public ResponseEntity<CostType> updateCostType(@PathVariable Integer id, @RequestBody CostType costType) {
        if (!costDetailService.findCostTypeById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        costType.setMCostTypeId(id);
        return ResponseEntity.ok(costDetailService.saveCostType(costType));
    }
}
