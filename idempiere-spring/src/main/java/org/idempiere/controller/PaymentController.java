package org.idempiere.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.idempiere.model.Payment;
import org.idempiere.service.PaymentService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Payment entity operations.
 */
@RestController
@RequestMapping("/api/payments")
@Tag(name = "Payment", description = "Payment management APIs")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    @Operation(summary = "Get all payments")
    public ResponseEntity<List<Payment>> findAll() {
        return ResponseEntity.ok(paymentService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get payment by ID")
    public ResponseEntity<Payment> findById(@PathVariable Integer id) {
        return paymentService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/documentno/{documentNo}")
    @Operation(summary = "Get payment by document number")
    public ResponseEntity<Payment> findByDocumentNo(@PathVariable String documentNo) {
        return paymentService.findByDocumentNo(documentNo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/bpartner/{bPartnerId}")
    @Operation(summary = "Get payments by business partner")
    public ResponseEntity<List<Payment>> findByBPartnerId(@PathVariable Integer bPartnerId) {
        return ResponseEntity.ok(paymentService.findByBPartnerId(bPartnerId));
    }

    @GetMapping("/status/{docStatus}")
    @Operation(summary = "Get payments by document status")
    public ResponseEntity<List<Payment>> findByDocStatus(@PathVariable String docStatus) {
        return ResponseEntity.ok(paymentService.findByDocStatus(docStatus));
    }

    @GetMapping("/receipts")
    @Operation(summary = "Get all receipts")
    public ResponseEntity<List<Payment>> findAllReceipts() {
        return ResponseEntity.ok(paymentService.findAllReceipts());
    }

    @GetMapping("/outgoing")
    @Operation(summary = "Get all outgoing payments")
    public ResponseEntity<List<Payment>> findAllPayments() {
        return ResponseEntity.ok(paymentService.findAllPayments());
    }

    @GetMapping("/daterange")
    @Operation(summary = "Get payments by date range")
    public ResponseEntity<List<Payment>> findByDateRange(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate) {
        return ResponseEntity.ok(paymentService.findByDateRange(startDate, endDate));
    }

    @GetMapping("/unallocated")
    @Operation(summary = "Get all unallocated payments")
    public ResponseEntity<List<Payment>> findUnallocated() {
        return ResponseEntity.ok(paymentService.findUnallocated());
    }

    @GetMapping("/unallocated/bpartner/{bPartnerId}")
    @Operation(summary = "Get unallocated payments for a business partner")
    public ResponseEntity<List<Payment>> findUnallocatedByBPartnerId(@PathVariable Integer bPartnerId) {
        return ResponseEntity.ok(paymentService.findUnallocatedByBPartnerId(bPartnerId));
    }

    @GetMapping("/invoice/{invoiceId}")
    @Operation(summary = "Get payments by invoice")
    public ResponseEntity<List<Payment>> findByInvoiceId(@PathVariable Integer invoiceId) {
        return ResponseEntity.ok(paymentService.findByInvoiceId(invoiceId));
    }

    @GetMapping("/order/{orderId}")
    @Operation(summary = "Get payments by order")
    public ResponseEntity<List<Payment>> findByOrderId(@PathVariable Integer orderId) {
        return ResponseEntity.ok(paymentService.findByOrderId(orderId));
    }

    @GetMapping("/bankaccount/{bankAccountId}")
    @Operation(summary = "Get payments by bank account")
    public ResponseEntity<List<Payment>> findByBankAccountId(@PathVariable Integer bankAccountId) {
        return ResponseEntity.ok(paymentService.findByBankAccountId(bankAccountId));
    }

    @GetMapping("/tendertype/{tenderType}")
    @Operation(summary = "Get payments by tender type")
    public ResponseEntity<List<Payment>> findByTenderType(@PathVariable String tenderType) {
        return ResponseEntity.ok(paymentService.findByTenderType(tenderType));
    }

    @GetMapping("/prepayments")
    @Operation(summary = "Get all prepayments")
    public ResponseEntity<List<Payment>> findAllPrepayments() {
        return ResponseEntity.ok(paymentService.findAllPrepayments());
    }

    @GetMapping("/draft")
    @Operation(summary = "Get all draft payments")
    public ResponseEntity<List<Payment>> findAllDraft() {
        return ResponseEntity.ok(paymentService.findAllDraft());
    }

    @GetMapping("/completed")
    @Operation(summary = "Get all completed payments")
    public ResponseEntity<List<Payment>> findAllCompleted() {
        return ResponseEntity.ok(paymentService.findAllCompleted());
    }

    @PostMapping
    @Operation(summary = "Create a new payment")
    public ResponseEntity<Payment> create(@RequestBody Payment payment) {
        Payment saved = paymentService.save(payment);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing payment")
    public ResponseEntity<Payment> update(@PathVariable Integer id, @RequestBody Payment payment) {
        if (!paymentService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        payment.setCPaymentId(id);
        Payment updated = paymentService.save(payment);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a payment")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!paymentService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        paymentService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
