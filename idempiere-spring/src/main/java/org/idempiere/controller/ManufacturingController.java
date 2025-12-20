package org.idempiere.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.idempiere.model.PPCostCollector;
import org.idempiere.model.PPOrder;
import org.idempiere.model.PPOrderLine;
import org.idempiere.model.PPOrderNode;
import org.idempiere.model.PPOrderWorkflow;
import org.idempiere.model.PPProductPlanning;
import org.idempiere.service.ManufacturingService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Manufacturing operations.
 * Handles PP (Plant & Production) entities.
 */
@RestController
@RequestMapping("/api/manufacturing")
@Tag(name = "Manufacturing", description = "Manufacturing and production management APIs")
public class ManufacturingController {

    private final ManufacturingService manufacturingService;

    public ManufacturingController(ManufacturingService manufacturingService) {
        this.manufacturingService = manufacturingService;
    }

    // ==================== Manufacturing Order Endpoints ====================

    @GetMapping("/orders")
    @Operation(summary = "Get all manufacturing orders")
    public ResponseEntity<List<PPOrder>> findAllOrders() {
        return ResponseEntity.ok(manufacturingService.findAllOrders());
    }

    @GetMapping("/orders/active")
    @Operation(summary = "Get all active manufacturing orders")
    public ResponseEntity<List<PPOrder>> findAllActiveOrders() {
        return ResponseEntity.ok(manufacturingService.findAllActiveOrders());
    }

    @GetMapping("/orders/{id}")
    @Operation(summary = "Get manufacturing order by ID")
    public ResponseEntity<PPOrder> findOrderById(@PathVariable Integer id) {
        return manufacturingService.findOrderById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/orders/documentno/{documentNo}")
    @Operation(summary = "Get manufacturing order by document number")
    public ResponseEntity<PPOrder> findOrderByDocumentNo(@PathVariable String documentNo) {
        return manufacturingService.findOrderByDocumentNo(documentNo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/orders/product/{productId}")
    @Operation(summary = "Get manufacturing orders by product")
    public ResponseEntity<List<PPOrder>> findOrdersByProduct(@PathVariable Integer productId) {
        return ResponseEntity.ok(manufacturingService.findOrdersByProduct(productId));
    }

    @GetMapping("/orders/status/{docStatus}")
    @Operation(summary = "Get manufacturing orders by document status")
    public ResponseEntity<List<PPOrder>> findOrdersByDocStatus(@PathVariable String docStatus) {
        return ResponseEntity.ok(manufacturingService.findOrdersByDocStatus(docStatus));
    }

    @GetMapping("/orders/warehouse/{warehouseId}")
    @Operation(summary = "Get manufacturing orders by warehouse")
    public ResponseEntity<List<PPOrder>> findOrdersByWarehouse(@PathVariable Integer warehouseId) {
        return ResponseEntity.ok(manufacturingService.findOrdersByWarehouse(warehouseId));
    }

    @GetMapping("/orders/bpartner/{bpartnerId}")
    @Operation(summary = "Get manufacturing orders by business partner")
    public ResponseEntity<List<PPOrder>> findOrdersByBPartner(@PathVariable Integer bpartnerId) {
        return ResponseEntity.ok(manufacturingService.findOrdersByBPartner(bpartnerId));
    }

    @PostMapping("/orders")
    @Operation(summary = "Create a new manufacturing order")
    public ResponseEntity<PPOrder> createOrder(@RequestBody PPOrder order) {
        PPOrder saved = manufacturingService.saveOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/orders/{id}")
    @Operation(summary = "Update an existing manufacturing order")
    public ResponseEntity<PPOrder> updateOrder(@PathVariable Integer id, @RequestBody PPOrder order) {
        if (!manufacturingService.orderExists(id)) {
            return ResponseEntity.notFound().build();
        }
        order.setPpOrderId(id);
        PPOrder updated = manufacturingService.saveOrder(order);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/orders/{id}")
    @Operation(summary = "Delete a manufacturing order")
    public ResponseEntity<Void> deleteOrder(@PathVariable Integer id) {
        if (!manufacturingService.orderExists(id)) {
            return ResponseEntity.notFound().build();
        }
        manufacturingService.deleteOrder(id);
        return ResponseEntity.noContent().build();
    }

    // ==================== Order Line Endpoints ====================

    @GetMapping("/orders/{orderId}/lines")
    @Operation(summary = "Get all lines for a manufacturing order")
    public ResponseEntity<List<PPOrderLine>> findOrderLinesByOrderId(@PathVariable Integer orderId) {
        return ResponseEntity.ok(manufacturingService.findOrderLinesByOrderId(orderId));
    }

    @GetMapping("/orders/{orderId}/lines/{lineId}")
    @Operation(summary = "Get order line by ID")
    public ResponseEntity<PPOrderLine> findOrderLineById(@PathVariable Integer orderId, @PathVariable Integer lineId) {
        return manufacturingService.findOrderLineById(lineId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/orders/{orderId}/lines/pending-delivery")
    @Operation(summary = "Get order lines pending delivery")
    public ResponseEntity<List<PPOrderLine>> findPendingDeliveryLines(@PathVariable Integer orderId) {
        return ResponseEntity.ok(manufacturingService.findPendingDeliveryLines(orderId));
    }

    @GetMapping("/orderlines/critical")
    @Operation(summary = "Get all critical order lines")
    public ResponseEntity<List<PPOrderLine>> findCriticalOrderLines() {
        return ResponseEntity.ok(manufacturingService.findCriticalOrderLines());
    }

    @GetMapping("/orderlines/product/{productId}")
    @Operation(summary = "Get order lines by product")
    public ResponseEntity<List<PPOrderLine>> findOrderLinesByProductId(@PathVariable Integer productId) {
        return ResponseEntity.ok(manufacturingService.findOrderLinesByProductId(productId));
    }

    @GetMapping("/orderlines/componenttype/{componentType}")
    @Operation(summary = "Get order lines by component type")
    public ResponseEntity<List<PPOrderLine>> findOrderLinesByComponentType(@PathVariable String componentType) {
        return ResponseEntity.ok(manufacturingService.findOrderLinesByComponentType(componentType));
    }

    @GetMapping("/orderlines/warehouse/{warehouseId}")
    @Operation(summary = "Get order lines by warehouse")
    public ResponseEntity<List<PPOrderLine>> findOrderLinesByWarehouseId(@PathVariable Integer warehouseId) {
        return ResponseEntity.ok(manufacturingService.findOrderLinesByWarehouseId(warehouseId));
    }

    @PostMapping("/orders/{orderId}/lines")
    @Operation(summary = "Add a line to a manufacturing order")
    public ResponseEntity<PPOrderLine> createOrderLine(@PathVariable Integer orderId, @RequestBody PPOrderLine orderLine) {
        orderLine.setPpOrderId(orderId);
        PPOrderLine saved = manufacturingService.saveOrderLine(orderLine);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/orders/{orderId}/lines/{lineId}")
    @Operation(summary = "Update an order line")
    public ResponseEntity<PPOrderLine> updateOrderLine(@PathVariable Integer orderId, @PathVariable Integer lineId, @RequestBody PPOrderLine orderLine) {
        if (manufacturingService.findOrderLineById(lineId).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        orderLine.setPpOrderBomLineId(lineId);
        orderLine.setPpOrderId(orderId);
        PPOrderLine updated = manufacturingService.saveOrderLine(orderLine);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/orders/{orderId}/lines/{lineId}")
    @Operation(summary = "Delete an order line")
    public ResponseEntity<Void> deleteOrderLine(@PathVariable Integer orderId, @PathVariable Integer lineId) {
        if (manufacturingService.findOrderLineById(lineId).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        manufacturingService.deleteOrderLine(lineId);
        return ResponseEntity.noContent().build();
    }

    // ==================== Order Node Endpoints ====================

    @GetMapping("/orders/{orderId}/nodes")
    @Operation(summary = "Get all nodes for a manufacturing order")
    public ResponseEntity<List<PPOrderNode>> findOrderNodesByOrderId(@PathVariable Integer orderId) {
        return ResponseEntity.ok(manufacturingService.findOrderNodesByOrderId(orderId));
    }

    @GetMapping("/nodes/{nodeId}")
    @Operation(summary = "Get order node by ID")
    public ResponseEntity<PPOrderNode> findOrderNodeById(@PathVariable Integer nodeId) {
        return manufacturingService.findOrderNodeById(nodeId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/nodes/workflow/{workflowId}")
    @Operation(summary = "Get order nodes by workflow")
    public ResponseEntity<List<PPOrderNode>> findOrderNodesByWorkflowId(@PathVariable Integer workflowId) {
        return ResponseEntity.ok(manufacturingService.findOrderNodesByWorkflowId(workflowId));
    }

    @GetMapping("/nodes/resource/{resourceId}")
    @Operation(summary = "Get order nodes by resource")
    public ResponseEntity<List<PPOrderNode>> findOrderNodesByResourceId(@PathVariable Integer resourceId) {
        return ResponseEntity.ok(manufacturingService.findOrderNodesByResourceId(resourceId));
    }

    @GetMapping("/nodes/milestones")
    @Operation(summary = "Get all milestone nodes")
    public ResponseEntity<List<PPOrderNode>> findMilestoneNodes() {
        return ResponseEntity.ok(manufacturingService.findMilestoneNodes());
    }

    @GetMapping("/nodes/subcontracting")
    @Operation(summary = "Get all subcontracting nodes")
    public ResponseEntity<List<PPOrderNode>> findSubcontractingNodes() {
        return ResponseEntity.ok(manufacturingService.findSubcontractingNodes());
    }

    @GetMapping("/nodes/action/{action}")
    @Operation(summary = "Get order nodes by action")
    public ResponseEntity<List<PPOrderNode>> findOrderNodesByAction(@PathVariable String action) {
        return ResponseEntity.ok(manufacturingService.findOrderNodesByAction(action));
    }

    @PostMapping("/orders/{orderId}/nodes")
    @Operation(summary = "Add a node to a manufacturing order")
    public ResponseEntity<PPOrderNode> createOrderNode(@PathVariable Integer orderId, @RequestBody PPOrderNode orderNode) {
        orderNode.setPpOrderId(orderId);
        PPOrderNode saved = manufacturingService.saveOrderNode(orderNode);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/nodes/{nodeId}")
    @Operation(summary = "Update an order node")
    public ResponseEntity<PPOrderNode> updateOrderNode(@PathVariable Integer nodeId, @RequestBody PPOrderNode orderNode) {
        if (manufacturingService.findOrderNodeById(nodeId).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        orderNode.setPpOrderNodeId(nodeId);
        PPOrderNode updated = manufacturingService.saveOrderNode(orderNode);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/nodes/{nodeId}")
    @Operation(summary = "Delete an order node")
    public ResponseEntity<Void> deleteOrderNode(@PathVariable Integer nodeId) {
        if (manufacturingService.findOrderNodeById(nodeId).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        manufacturingService.deleteOrderNode(nodeId);
        return ResponseEntity.noContent().build();
    }

    // ==================== Order Workflow Endpoints ====================

    @GetMapping("/orders/{orderId}/workflow")
    @Operation(summary = "Get workflow for a manufacturing order")
    public ResponseEntity<PPOrderWorkflow> findOrderWorkflowByOrderId(@PathVariable Integer orderId) {
        return manufacturingService.findOrderWorkflowByOrderId(orderId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/workflows/{workflowId}")
    @Operation(summary = "Get order workflow by ID")
    public ResponseEntity<PPOrderWorkflow> findOrderWorkflowById(@PathVariable Integer workflowId) {
        return manufacturingService.findOrderWorkflowById(workflowId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/workflows/template/{workflowId}")
    @Operation(summary = "Get order workflows by base workflow template")
    public ResponseEntity<List<PPOrderWorkflow>> findOrderWorkflowsByWorkflowId(@PathVariable Integer workflowId) {
        return ResponseEntity.ok(manufacturingService.findOrderWorkflowsByWorkflowId(workflowId));
    }

    @GetMapping("/workflows/valid")
    @Operation(summary = "Get all valid workflows")
    public ResponseEntity<List<PPOrderWorkflow>> findValidOrderWorkflows() {
        return ResponseEntity.ok(manufacturingService.findValidOrderWorkflows());
    }

    @GetMapping("/workflows/resource/{resourceId}")
    @Operation(summary = "Get order workflows by resource")
    public ResponseEntity<List<PPOrderWorkflow>> findOrderWorkflowsByResourceId(@PathVariable Integer resourceId) {
        return ResponseEntity.ok(manufacturingService.findOrderWorkflowsByResourceId(resourceId));
    }

    @GetMapping("/workflows/type/{workflowType}")
    @Operation(summary = "Get order workflows by type")
    public ResponseEntity<List<PPOrderWorkflow>> findOrderWorkflowsByType(@PathVariable String workflowType) {
        return ResponseEntity.ok(manufacturingService.findOrderWorkflowsByType(workflowType));
    }

    @GetMapping("/workflows/documentno/{documentNo}")
    @Operation(summary = "Get order workflow by document number")
    public ResponseEntity<PPOrderWorkflow> findOrderWorkflowByDocumentNo(@PathVariable String documentNo) {
        return manufacturingService.findOrderWorkflowByDocumentNo(documentNo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/workflows/priority/{minPriority}")
    @Operation(summary = "Get order workflows by minimum priority")
    public ResponseEntity<List<PPOrderWorkflow>> findOrderWorkflowsByMinPriority(@PathVariable Integer minPriority) {
        return ResponseEntity.ok(manufacturingService.findOrderWorkflowsByMinPriority(minPriority));
    }

    @PostMapping("/orders/{orderId}/workflow")
    @Operation(summary = "Create workflow for a manufacturing order")
    public ResponseEntity<PPOrderWorkflow> createOrderWorkflow(@PathVariable Integer orderId, @RequestBody PPOrderWorkflow orderWorkflow) {
        orderWorkflow.setPpOrderId(orderId);
        PPOrderWorkflow saved = manufacturingService.saveOrderWorkflow(orderWorkflow);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/workflows/{workflowId}")
    @Operation(summary = "Update an order workflow")
    public ResponseEntity<PPOrderWorkflow> updateOrderWorkflow(@PathVariable Integer workflowId, @RequestBody PPOrderWorkflow orderWorkflow) {
        if (manufacturingService.findOrderWorkflowById(workflowId).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        orderWorkflow.setPpOrderWorkflowId(workflowId);
        PPOrderWorkflow updated = manufacturingService.saveOrderWorkflow(orderWorkflow);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/workflows/{workflowId}")
    @Operation(summary = "Delete an order workflow")
    public ResponseEntity<Void> deleteOrderWorkflow(@PathVariable Integer workflowId) {
        if (manufacturingService.findOrderWorkflowById(workflowId).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        manufacturingService.deleteOrderWorkflow(workflowId);
        return ResponseEntity.noContent().build();
    }

    // ==================== Cost Collector Endpoints ====================

    @GetMapping("/costcollectors")
    @Operation(summary = "Get all cost collectors")
    public ResponseEntity<List<PPCostCollector>> findAllCostCollectors() {
        return ResponseEntity.ok(manufacturingService.findCostCollectorsByDocStatus("CO"));
    }

    @GetMapping("/costcollectors/{id}")
    @Operation(summary = "Get cost collector by ID")
    public ResponseEntity<PPCostCollector> findCostCollectorById(@PathVariable Integer id) {
        return manufacturingService.findCostCollectorById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/costcollectors/documentno/{documentNo}")
    @Operation(summary = "Get cost collector by document number")
    public ResponseEntity<PPCostCollector> findCostCollectorByDocumentNo(@PathVariable String documentNo) {
        return manufacturingService.findCostCollectorByDocumentNo(documentNo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/costcollectors/order/{orderId}")
    @Operation(summary = "Get cost collectors by manufacturing order")
    public ResponseEntity<List<PPCostCollector>> findCostCollectorsByOrderId(@PathVariable Integer orderId) {
        return ResponseEntity.ok(manufacturingService.findCostCollectorsByOrderId(orderId));
    }

    @GetMapping("/costcollectors/bomline/{bomLineId}")
    @Operation(summary = "Get cost collectors by BOM line")
    public ResponseEntity<List<PPCostCollector>> findCostCollectorsByBOMLineId(@PathVariable Integer bomLineId) {
        return ResponseEntity.ok(manufacturingService.findCostCollectorsByBOMLineId(bomLineId));
    }

    @GetMapping("/costcollectors/node/{nodeId}")
    @Operation(summary = "Get cost collectors by order node")
    public ResponseEntity<List<PPCostCollector>> findCostCollectorsByNodeId(@PathVariable Integer nodeId) {
        return ResponseEntity.ok(manufacturingService.findCostCollectorsByNodeId(nodeId));
    }

    @GetMapping("/costcollectors/product/{productId}")
    @Operation(summary = "Get cost collectors by product")
    public ResponseEntity<List<PPCostCollector>> findCostCollectorsByProductId(@PathVariable Integer productId) {
        return ResponseEntity.ok(manufacturingService.findCostCollectorsByProductId(productId));
    }

    @GetMapping("/costcollectors/warehouse/{warehouseId}")
    @Operation(summary = "Get cost collectors by warehouse")
    public ResponseEntity<List<PPCostCollector>> findCostCollectorsByWarehouseId(@PathVariable Integer warehouseId) {
        return ResponseEntity.ok(manufacturingService.findCostCollectorsByWarehouseId(warehouseId));
    }

    @GetMapping("/costcollectors/status/{docStatus}")
    @Operation(summary = "Get cost collectors by document status")
    public ResponseEntity<List<PPCostCollector>> findCostCollectorsByDocStatus(@PathVariable String docStatus) {
        return ResponseEntity.ok(manufacturingService.findCostCollectorsByDocStatus(docStatus));
    }

    @GetMapping("/costcollectors/collectortype/{collectorType}")
    @Operation(summary = "Get cost collectors by collector type")
    public ResponseEntity<List<PPCostCollector>> findCostCollectorsByCollectorType(@PathVariable String collectorType) {
        return ResponseEntity.ok(manufacturingService.findCostCollectorsByCollectorType(collectorType));
    }

    @GetMapping("/costcollectors/movementtype/{movementType}")
    @Operation(summary = "Get cost collectors by movement type")
    public ResponseEntity<List<PPCostCollector>> findCostCollectorsByMovementType(@PathVariable String movementType) {
        return ResponseEntity.ok(manufacturingService.findCostCollectorsByMovementType(movementType));
    }

    @GetMapping("/costcollectors/daterange")
    @Operation(summary = "Get cost collectors by date range")
    public ResponseEntity<List<PPCostCollector>> findCostCollectorsByDateRange(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate) {
        return ResponseEntity.ok(manufacturingService.findCostCollectorsByDateRange(startDate, endDate));
    }

    @GetMapping("/costcollectors/subcontracting")
    @Operation(summary = "Get all subcontracting cost collectors")
    public ResponseEntity<List<PPCostCollector>> findSubcontractingCostCollectors() {
        return ResponseEntity.ok(manufacturingService.findSubcontractingCostCollectors());
    }

    @PostMapping("/costcollectors")
    @Operation(summary = "Create a new cost collector")
    public ResponseEntity<PPCostCollector> createCostCollector(@RequestBody PPCostCollector costCollector) {
        PPCostCollector saved = manufacturingService.saveCostCollector(costCollector);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/costcollectors/{id}")
    @Operation(summary = "Update an existing cost collector")
    public ResponseEntity<PPCostCollector> updateCostCollector(@PathVariable Integer id, @RequestBody PPCostCollector costCollector) {
        if (manufacturingService.findCostCollectorById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        costCollector.setPpCostCollectorId(id);
        PPCostCollector updated = manufacturingService.saveCostCollector(costCollector);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/costcollectors/{id}")
    @Operation(summary = "Delete a cost collector")
    public ResponseEntity<Void> deleteCostCollector(@PathVariable Integer id) {
        if (manufacturingService.findCostCollectorById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        manufacturingService.deleteCostCollector(id);
        return ResponseEntity.noContent().build();
    }

    // ==================== Product Planning Endpoints ====================

    @GetMapping("/planning/{id}")
    @Operation(summary = "Get product planning by ID")
    public ResponseEntity<PPProductPlanning> findProductPlanningById(@PathVariable Integer id) {
        return manufacturingService.findProductPlanningById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/planning/product/{productId}/warehouse/{warehouseId}")
    @Operation(summary = "Get product planning by product and warehouse")
    public ResponseEntity<PPProductPlanning> findProductPlanningByProductAndWarehouse(
            @PathVariable Integer productId,
            @PathVariable Integer warehouseId) {
        return manufacturingService.findProductPlanningByProductAndWarehouse(productId, warehouseId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/planning/product/{productId}")
    @Operation(summary = "Get product planning by product")
    public ResponseEntity<List<PPProductPlanning>> findProductPlanningByProductId(@PathVariable Integer productId) {
        return ResponseEntity.ok(manufacturingService.findProductPlanningByProductId(productId));
    }

    @GetMapping("/planning/warehouse/{warehouseId}")
    @Operation(summary = "Get product planning by warehouse")
    public ResponseEntity<List<PPProductPlanning>> findProductPlanningByWarehouseId(@PathVariable Integer warehouseId) {
        return ResponseEntity.ok(manufacturingService.findProductPlanningByWarehouseId(warehouseId));
    }

    @GetMapping("/planning/resource/{resourceId}")
    @Operation(summary = "Get product planning by resource")
    public ResponseEntity<List<PPProductPlanning>> findProductPlanningByResourceId(@PathVariable Integer resourceId) {
        return ResponseEntity.ok(manufacturingService.findProductPlanningByResourceId(resourceId));
    }

    @GetMapping("/planning/mrp")
    @Operation(summary = "Get product planning requiring MRP")
    public ResponseEntity<List<PPProductPlanning>> findProductPlanningRequiringMRP() {
        return ResponseEntity.ok(manufacturingService.findProductPlanningRequiringMRP());
    }

    @GetMapping("/planning/drp")
    @Operation(summary = "Get product planning requiring DRP")
    public ResponseEntity<List<PPProductPlanning>> findProductPlanningRequiringDRP() {
        return ResponseEntity.ok(manufacturingService.findProductPlanningRequiringDRP());
    }

    @GetMapping("/planning/createplan")
    @Operation(summary = "Get product planning with create plan flag")
    public ResponseEntity<List<PPProductPlanning>> findProductPlanningWithCreatePlan() {
        return ResponseEntity.ok(manufacturingService.findProductPlanningWithCreatePlan());
    }

    @GetMapping("/planning/phantom")
    @Operation(summary = "Get phantom products")
    public ResponseEntity<List<PPProductPlanning>> findPhantomProducts() {
        return ResponseEntity.ok(manufacturingService.findPhantomProducts());
    }

    @GetMapping("/planning/mps")
    @Operation(summary = "Get MPS items")
    public ResponseEntity<List<PPProductPlanning>> findMPSItems() {
        return ResponseEntity.ok(manufacturingService.findMPSItems());
    }

    @GetMapping("/planning/orderpolicy/{orderPolicy}")
    @Operation(summary = "Get product planning by order policy")
    public ResponseEntity<List<PPProductPlanning>> findProductPlanningByOrderPolicy(@PathVariable String orderPolicy) {
        return ResponseEntity.ok(manufacturingService.findProductPlanningByOrderPolicy(orderPolicy));
    }

    @GetMapping("/planning/planner/{plannerId}")
    @Operation(summary = "Get product planning by planner")
    public ResponseEntity<List<PPProductPlanning>> findProductPlanningByPlannerId(@PathVariable Integer plannerId) {
        return ResponseEntity.ok(manufacturingService.findProductPlanningByPlannerId(plannerId));
    }

    @PostMapping("/planning")
    @Operation(summary = "Create new product planning")
    public ResponseEntity<PPProductPlanning> createProductPlanning(@RequestBody PPProductPlanning productPlanning) {
        PPProductPlanning saved = manufacturingService.saveProductPlanning(productPlanning);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/planning/{id}")
    @Operation(summary = "Update product planning")
    public ResponseEntity<PPProductPlanning> updateProductPlanning(@PathVariable Integer id, @RequestBody PPProductPlanning productPlanning) {
        if (manufacturingService.findProductPlanningById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        productPlanning.setPpProductPlanningId(id);
        PPProductPlanning updated = manufacturingService.saveProductPlanning(productPlanning);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/planning/{id}")
    @Operation(summary = "Delete product planning")
    public ResponseEntity<Void> deleteProductPlanning(@PathVariable Integer id) {
        if (manufacturingService.findProductPlanningById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        manufacturingService.deleteProductPlanning(id);
        return ResponseEntity.noContent().build();
    }
}
