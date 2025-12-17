package org.idempiere.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.idempiere.model.Order;
import org.idempiere.model.OrderLine;
import org.idempiere.service.OrderService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Order and OrderLine entity operations.
 */
@RestController
@RequestMapping("/api/orders")
@Tag(name = "Order", description = "Order management APIs")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Order endpoints

    @GetMapping
    @Operation(summary = "Get all orders")
    public ResponseEntity<List<Order>> findAll() {
        return ResponseEntity.ok(orderService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get order by ID")
    public ResponseEntity<Order> findById(@PathVariable Integer id) {
        return orderService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/documentno/{documentNo}")
    @Operation(summary = "Get order by document number")
    public ResponseEntity<Order> findByDocumentNo(@PathVariable String documentNo) {
        return orderService.findByDocumentNo(documentNo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/bpartner/{bPartnerId}")
    @Operation(summary = "Get orders by business partner")
    public ResponseEntity<List<Order>> findByBPartnerId(@PathVariable Integer bPartnerId) {
        return ResponseEntity.ok(orderService.findByBPartnerId(bPartnerId));
    }

    @GetMapping("/status/{docStatus}")
    @Operation(summary = "Get orders by document status")
    public ResponseEntity<List<Order>> findByDocStatus(@PathVariable String docStatus) {
        return ResponseEntity.ok(orderService.findByDocStatus(docStatus));
    }

    @GetMapping("/sales")
    @Operation(summary = "Get all sales orders")
    public ResponseEntity<List<Order>> findAllSalesOrders() {
        return ResponseEntity.ok(orderService.findAllSalesOrders());
    }

    @GetMapping("/purchase")
    @Operation(summary = "Get all purchase orders")
    public ResponseEntity<List<Order>> findAllPurchaseOrders() {
        return ResponseEntity.ok(orderService.findAllPurchaseOrders());
    }

    @GetMapping("/daterange")
    @Operation(summary = "Get orders by date range")
    public ResponseEntity<List<Order>> findByDateRange(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate) {
        return ResponseEntity.ok(orderService.findByDateRange(startDate, endDate));
    }

    @GetMapping("/draft")
    @Operation(summary = "Get all draft orders")
    public ResponseEntity<List<Order>> findAllDraft() {
        return ResponseEntity.ok(orderService.findAllDraft());
    }

    @GetMapping("/completed")
    @Operation(summary = "Get all completed orders")
    public ResponseEntity<List<Order>> findAllCompleted() {
        return ResponseEntity.ok(orderService.findAllCompleted());
    }

    @GetMapping("/salesrep/{salesRepId}")
    @Operation(summary = "Get orders by sales representative")
    public ResponseEntity<List<Order>> findBySalesRepId(@PathVariable Integer salesRepId) {
        return ResponseEntity.ok(orderService.findBySalesRepId(salesRepId));
    }

    @PostMapping
    @Operation(summary = "Create a new order")
    public ResponseEntity<Order> create(@RequestBody Order order) {
        Order saved = orderService.save(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing order")
    public ResponseEntity<Order> update(@PathVariable Integer id, @RequestBody Order order) {
        if (!orderService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        order.setCOrderId(id);
        Order updated = orderService.save(order);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete an order")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!orderService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        orderService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // OrderLine endpoints

    @GetMapping("/{orderId}/lines")
    @Operation(summary = "Get all lines for an order")
    public ResponseEntity<List<OrderLine>> findLinesByOrderId(@PathVariable Integer orderId) {
        return ResponseEntity.ok(orderService.findLinesByOrderId(orderId));
    }

    @GetMapping("/{orderId}/lines/{lineId}")
    @Operation(summary = "Get order line by ID")
    public ResponseEntity<OrderLine> findLineById(@PathVariable Integer orderId, @PathVariable Integer lineId) {
        return orderService.findLineById(lineId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{orderId}/lines/pending-delivery")
    @Operation(summary = "Get order lines pending delivery")
    public ResponseEntity<List<OrderLine>> findPendingDeliveryLines(@PathVariable Integer orderId) {
        return ResponseEntity.ok(orderService.findPendingDeliveryLines(orderId));
    }

    @GetMapping("/{orderId}/lines/pending-invoice")
    @Operation(summary = "Get order lines pending invoice")
    public ResponseEntity<List<OrderLine>> findPendingInvoiceLines(@PathVariable Integer orderId) {
        return ResponseEntity.ok(orderService.findPendingInvoiceLines(orderId));
    }

    @PostMapping("/{orderId}/lines")
    @Operation(summary = "Add a line to an order")
    public ResponseEntity<OrderLine> createLine(@PathVariable Integer orderId, @RequestBody OrderLine orderLine) {
        orderLine.setCOrderId(orderId);
        OrderLine saved = orderService.saveLine(orderLine);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{orderId}/lines/{lineId}")
    @Operation(summary = "Update an order line")
    public ResponseEntity<OrderLine> updateLine(@PathVariable Integer orderId, @PathVariable Integer lineId, @RequestBody OrderLine orderLine) {
        if (orderService.findLineById(lineId).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        orderLine.setCOrderLineId(lineId);
        orderLine.setCOrderId(orderId);
        OrderLine updated = orderService.saveLine(orderLine);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{orderId}/lines/{lineId}")
    @Operation(summary = "Delete an order line")
    public ResponseEntity<Void> deleteLine(@PathVariable Integer orderId, @PathVariable Integer lineId) {
        if (orderService.findLineById(lineId).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        orderService.deleteLine(lineId);
        return ResponseEntity.noContent().build();
    }
}
