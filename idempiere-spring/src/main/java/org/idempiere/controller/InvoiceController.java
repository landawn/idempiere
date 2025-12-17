package org.idempiere.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.idempiere.model.Invoice;
import org.idempiere.model.InvoiceLine;
import org.idempiere.service.InvoiceService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Invoice and InvoiceLine entity operations.
 */
@RestController
@RequestMapping("/api/invoices")
@Tag(name = "Invoice", description = "Invoice management APIs")
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    // Invoice endpoints

    @GetMapping
    @Operation(summary = "Get all invoices")
    public ResponseEntity<List<Invoice>> findAll() {
        return ResponseEntity.ok(invoiceService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get invoice by ID")
    public ResponseEntity<Invoice> findById(@PathVariable Integer id) {
        return invoiceService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/documentno/{documentNo}")
    @Operation(summary = "Get invoice by document number")
    public ResponseEntity<Invoice> findByDocumentNo(@PathVariable String documentNo) {
        return invoiceService.findByDocumentNo(documentNo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/bpartner/{bPartnerId}")
    @Operation(summary = "Get invoices by business partner")
    public ResponseEntity<List<Invoice>> findByBPartnerId(@PathVariable Integer bPartnerId) {
        return ResponseEntity.ok(invoiceService.findByBPartnerId(bPartnerId));
    }

    @GetMapping("/status/{docStatus}")
    @Operation(summary = "Get invoices by document status")
    public ResponseEntity<List<Invoice>> findByDocStatus(@PathVariable String docStatus) {
        return ResponseEntity.ok(invoiceService.findByDocStatus(docStatus));
    }

    @GetMapping("/customer")
    @Operation(summary = "Get all customer invoices")
    public ResponseEntity<List<Invoice>> findAllCustomerInvoices() {
        return ResponseEntity.ok(invoiceService.findAllCustomerInvoices());
    }

    @GetMapping("/vendor")
    @Operation(summary = "Get all vendor invoices")
    public ResponseEntity<List<Invoice>> findAllVendorInvoices() {
        return ResponseEntity.ok(invoiceService.findAllVendorInvoices());
    }

    @GetMapping("/daterange")
    @Operation(summary = "Get invoices by date range")
    public ResponseEntity<List<Invoice>> findByDateRange(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate) {
        return ResponseEntity.ok(invoiceService.findByDateRange(startDate, endDate));
    }

    @GetMapping("/unpaid")
    @Operation(summary = "Get all unpaid invoices")
    public ResponseEntity<List<Invoice>> findUnpaid() {
        return ResponseEntity.ok(invoiceService.findUnpaid());
    }

    @GetMapping("/unpaid/bpartner/{bPartnerId}")
    @Operation(summary = "Get unpaid invoices for a business partner")
    public ResponseEntity<List<Invoice>> findUnpaidByBPartnerId(@PathVariable Integer bPartnerId) {
        return ResponseEntity.ok(invoiceService.findUnpaidByBPartnerId(bPartnerId));
    }

    @GetMapping("/dispute")
    @Operation(summary = "Get invoices in dispute")
    public ResponseEntity<List<Invoice>> findInDispute() {
        return ResponseEntity.ok(invoiceService.findInDispute());
    }

    @GetMapping("/draft")
    @Operation(summary = "Get all draft invoices")
    public ResponseEntity<List<Invoice>> findAllDraft() {
        return ResponseEntity.ok(invoiceService.findAllDraft());
    }

    @GetMapping("/completed")
    @Operation(summary = "Get all completed invoices")
    public ResponseEntity<List<Invoice>> findAllCompleted() {
        return ResponseEntity.ok(invoiceService.findAllCompleted());
    }

    @GetMapping("/order/{orderId}")
    @Operation(summary = "Get invoices by order")
    public ResponseEntity<List<Invoice>> findByOrderId(@PathVariable Integer orderId) {
        return ResponseEntity.ok(invoiceService.findByOrderId(orderId));
    }

    @GetMapping("/salesrep/{salesRepId}")
    @Operation(summary = "Get invoices by sales representative")
    public ResponseEntity<List<Invoice>> findBySalesRepId(@PathVariable Integer salesRepId) {
        return ResponseEntity.ok(invoiceService.findBySalesRepId(salesRepId));
    }

    @PostMapping
    @Operation(summary = "Create a new invoice")
    public ResponseEntity<Invoice> create(@RequestBody Invoice invoice) {
        Invoice saved = invoiceService.save(invoice);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing invoice")
    public ResponseEntity<Invoice> update(@PathVariable Integer id, @RequestBody Invoice invoice) {
        if (!invoiceService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        invoice.setCInvoiceId(id);
        Invoice updated = invoiceService.save(invoice);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete an invoice")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!invoiceService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        invoiceService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // InvoiceLine endpoints

    @GetMapping("/{invoiceId}/lines")
    @Operation(summary = "Get all lines for an invoice")
    public ResponseEntity<List<InvoiceLine>> findLinesByInvoiceId(@PathVariable Integer invoiceId) {
        return ResponseEntity.ok(invoiceService.findLinesByInvoiceId(invoiceId));
    }

    @GetMapping("/{invoiceId}/lines/{lineId}")
    @Operation(summary = "Get invoice line by ID")
    public ResponseEntity<InvoiceLine> findLineById(@PathVariable Integer invoiceId, @PathVariable Integer lineId) {
        return invoiceService.findLineById(lineId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/{invoiceId}/lines")
    @Operation(summary = "Add a line to an invoice")
    public ResponseEntity<InvoiceLine> createLine(@PathVariable Integer invoiceId, @RequestBody InvoiceLine invoiceLine) {
        invoiceLine.setCInvoiceId(invoiceId);
        InvoiceLine saved = invoiceService.saveLine(invoiceLine);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{invoiceId}/lines/{lineId}")
    @Operation(summary = "Update an invoice line")
    public ResponseEntity<InvoiceLine> updateLine(@PathVariable Integer invoiceId, @PathVariable Integer lineId, @RequestBody InvoiceLine invoiceLine) {
        if (invoiceService.findLineById(lineId).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        invoiceLine.setCInvoiceLineId(lineId);
        invoiceLine.setCInvoiceId(invoiceId);
        InvoiceLine updated = invoiceService.saveLine(invoiceLine);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{invoiceId}/lines/{lineId}")
    @Operation(summary = "Delete an invoice line")
    public ResponseEntity<Void> deleteLine(@PathVariable Integer invoiceId, @PathVariable Integer lineId) {
        if (invoiceService.findLineById(lineId).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        invoiceService.deleteLine(lineId);
        return ResponseEntity.noContent().build();
    }
}
