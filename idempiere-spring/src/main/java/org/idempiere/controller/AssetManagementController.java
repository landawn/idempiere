package org.idempiere.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.idempiere.model.AssetAcct;
import org.idempiere.model.AssetAddition;
import org.idempiere.model.AssetDepreciation;
import org.idempiere.model.AssetDepreciationEntry;
import org.idempiere.model.AssetDisposal;
import org.idempiere.model.AssetReval;
import org.idempiere.model.AssetTransfer;
import org.idempiere.service.AssetManagementService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Asset Management operations.
 * Provides endpoints for additions, disposals, revaluations, transfers, depreciation, and accounting.
 */
@RestController
@RequestMapping("/api/assets/management")
@Tag(name = "Asset Management", description = "Asset Management APIs for additions, disposals, revaluations, transfers, and depreciation")
public class AssetManagementController {

    private final AssetManagementService assetManagementService;

    public AssetManagementController(AssetManagementService assetManagementService) {
        this.assetManagementService = assetManagementService;
    }

    // ========== Asset Addition Endpoints ==========

    @GetMapping("/additions/{id}")
    @Operation(summary = "Get asset addition by ID")
    public ResponseEntity<AssetAddition> getAdditionById(@PathVariable int id) {
        return assetManagementService.findAdditionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/additions/asset/{assetId}")
    @Operation(summary = "Get all additions for an asset")
    public ResponseEntity<List<AssetAddition>> getAdditionsByAsset(@PathVariable int assetId) {
        return ResponseEntity.ok(assetManagementService.findAdditionsByAsset(assetId));
    }

    @GetMapping("/additions/document/{documentNo}")
    @Operation(summary = "Get addition by document number")
    public ResponseEntity<AssetAddition> getAdditionByDocumentNo(
            @PathVariable String documentNo,
            @RequestParam int clientId) {
        return assetManagementService.findAdditionByDocumentNo(documentNo, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/additions/client/{clientId}/org/{orgId}")
    @Operation(summary = "Get additions by client and organization")
    public ResponseEntity<List<AssetAddition>> getAdditionsByClientAndOrg(
            @PathVariable int clientId,
            @PathVariable int orgId) {
        return ResponseEntity.ok(assetManagementService.findAdditionsByClientAndOrg(clientId, orgId));
    }

    @GetMapping("/additions/status/{docStatus}")
    @Operation(summary = "Get additions by document status")
    public ResponseEntity<List<AssetAddition>> getAdditionsByDocStatus(@PathVariable String docStatus) {
        return ResponseEntity.ok(assetManagementService.findAdditionsByDocStatus(docStatus));
    }

    @GetMapping("/additions/invoice/{invoiceId}")
    @Operation(summary = "Get additions by invoice")
    public ResponseEntity<List<AssetAddition>> getAdditionsByInvoice(@PathVariable int invoiceId) {
        return ResponseEntity.ok(assetManagementService.findAdditionsByInvoice(invoiceId));
    }

    @GetMapping("/additions/source-type/{sourceType}")
    @Operation(summary = "Get additions by source type")
    public ResponseEntity<List<AssetAddition>> getAdditionsBySourceType(@PathVariable String sourceType) {
        return ResponseEntity.ok(assetManagementService.findAdditionsBySourceType(sourceType));
    }

    @GetMapping("/additions/processed")
    @Operation(summary = "Get all processed additions")
    public ResponseEntity<List<AssetAddition>> getProcessedAdditions() {
        return ResponseEntity.ok(assetManagementService.findProcessedAdditions());
    }

    @GetMapping("/additions/unprocessed")
    @Operation(summary = "Get all unprocessed additions")
    public ResponseEntity<List<AssetAddition>> getUnprocessedAdditions() {
        return ResponseEntity.ok(assetManagementService.findUnprocessedAdditions());
    }

    @GetMapping("/additions")
    @Operation(summary = "Get all active additions")
    public ResponseEntity<List<AssetAddition>> getAllActiveAdditions() {
        return ResponseEntity.ok(assetManagementService.findAllActiveAdditions());
    }

    @PostMapping("/additions")
    @Operation(summary = "Create a new asset addition")
    public ResponseEntity<AssetAddition> createAddition(@RequestBody AssetAddition assetAddition) {
        AssetAddition saved = assetManagementService.saveAddition(assetAddition);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/additions/{id}")
    @Operation(summary = "Update an asset addition")
    public ResponseEntity<AssetAddition> updateAddition(
            @PathVariable int id,
            @RequestBody AssetAddition assetAddition) {
        assetAddition.setAAssetAdditionId(id);
        AssetAddition updated = assetManagementService.saveAddition(assetAddition);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/additions/{id}")
    @Operation(summary = "Delete an asset addition")
    public ResponseEntity<Void> deleteAddition(@PathVariable int id) {
        assetManagementService.deleteAddition(id);
        return ResponseEntity.noContent().build();
    }

    // ========== Asset Disposal Endpoints ==========

    @GetMapping("/disposals/{id}")
    @Operation(summary = "Get asset disposal by ID")
    public ResponseEntity<AssetDisposal> getDisposalById(@PathVariable int id) {
        return assetManagementService.findDisposalById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/disposals/asset/{assetId}")
    @Operation(summary = "Get all disposals for an asset")
    public ResponseEntity<List<AssetDisposal>> getDisposalsByAsset(@PathVariable int assetId) {
        return ResponseEntity.ok(assetManagementService.findDisposalsByAsset(assetId));
    }

    @GetMapping("/disposals/client/{clientId}/org/{orgId}")
    @Operation(summary = "Get disposals by client and organization")
    public ResponseEntity<List<AssetDisposal>> getDisposalsByClientAndOrg(
            @PathVariable int clientId,
            @PathVariable int orgId) {
        return ResponseEntity.ok(assetManagementService.findDisposalsByClientAndOrg(clientId, orgId));
    }

    @GetMapping("/disposals/method/{method}")
    @Operation(summary = "Get disposals by disposal method")
    public ResponseEntity<List<AssetDisposal>> getDisposalsByMethod(@PathVariable String method) {
        return ResponseEntity.ok(assetManagementService.findDisposalsByMethod(method));
    }

    @GetMapping("/disposals/date-range")
    @Operation(summary = "Get disposals by date range")
    public ResponseEntity<List<AssetDisposal>> getDisposalsByDateRange(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime fromDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime toDate) {
        return ResponseEntity.ok(assetManagementService.findDisposalsByDateRange(fromDate, toDate));
    }

    @GetMapping("/disposals/period/{periodId}")
    @Operation(summary = "Get disposals by period")
    public ResponseEntity<List<AssetDisposal>> getDisposalsByPeriod(@PathVariable int periodId) {
        return ResponseEntity.ok(assetManagementService.findDisposalsByPeriod(periodId));
    }

    @GetMapping("/disposals/processed")
    @Operation(summary = "Get all processed disposals")
    public ResponseEntity<List<AssetDisposal>> getProcessedDisposals() {
        return ResponseEntity.ok(assetManagementService.findProcessedDisposals());
    }

    @GetMapping("/disposals/unprocessed")
    @Operation(summary = "Get all unprocessed disposals")
    public ResponseEntity<List<AssetDisposal>> getUnprocessedDisposals() {
        return ResponseEntity.ok(assetManagementService.findUnprocessedDisposals());
    }

    @GetMapping("/disposals/posting-type/{postingType}")
    @Operation(summary = "Get disposals by posting type")
    public ResponseEntity<List<AssetDisposal>> getDisposalsByPostingType(@PathVariable String postingType) {
        return ResponseEntity.ok(assetManagementService.findDisposalsByPostingType(postingType));
    }

    @GetMapping("/disposals")
    @Operation(summary = "Get all active disposals")
    public ResponseEntity<List<AssetDisposal>> getAllActiveDisposals() {
        return ResponseEntity.ok(assetManagementService.findAllActiveDisposals());
    }

    @PostMapping("/disposals")
    @Operation(summary = "Create a new asset disposal")
    public ResponseEntity<AssetDisposal> createDisposal(@RequestBody AssetDisposal assetDisposal) {
        AssetDisposal saved = assetManagementService.saveDisposal(assetDisposal);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/disposals/{id}")
    @Operation(summary = "Update an asset disposal")
    public ResponseEntity<AssetDisposal> updateDisposal(
            @PathVariable int id,
            @RequestBody AssetDisposal assetDisposal) {
        assetDisposal.setAAssetDisposedId(id);
        AssetDisposal updated = assetManagementService.saveDisposal(assetDisposal);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/disposals/{id}")
    @Operation(summary = "Delete an asset disposal")
    public ResponseEntity<Void> deleteDisposal(@PathVariable int id) {
        assetManagementService.deleteDisposal(id);
        return ResponseEntity.noContent().build();
    }

    // ========== Asset Revaluation Endpoints ==========

    @GetMapping("/revaluations/{id}")
    @Operation(summary = "Get asset revaluation by ID")
    public ResponseEntity<AssetReval> getRevalById(@PathVariable int id) {
        return assetManagementService.findRevalById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/revaluations/asset/{assetId}")
    @Operation(summary = "Get all revaluations for an asset")
    public ResponseEntity<List<AssetReval>> getRevalsByAsset(@PathVariable int assetId) {
        return ResponseEntity.ok(assetManagementService.findRevalsByAsset(assetId));
    }

    @GetMapping("/revaluations/document/{documentNo}")
    @Operation(summary = "Get revaluation by document number")
    public ResponseEntity<AssetReval> getRevalByDocumentNo(
            @PathVariable String documentNo,
            @RequestParam int clientId) {
        return assetManagementService.findRevalByDocumentNo(documentNo, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/revaluations/client/{clientId}/org/{orgId}")
    @Operation(summary = "Get revaluations by client and organization")
    public ResponseEntity<List<AssetReval>> getRevalsByClientAndOrg(
            @PathVariable int clientId,
            @PathVariable int orgId) {
        return ResponseEntity.ok(assetManagementService.findRevalsByClientAndOrg(clientId, orgId));
    }

    @GetMapping("/revaluations/period/{periodId}")
    @Operation(summary = "Get revaluations by period")
    public ResponseEntity<List<AssetReval>> getRevalsByPeriod(@PathVariable int periodId) {
        return ResponseEntity.ok(assetManagementService.findRevalsByPeriod(periodId));
    }

    @GetMapping("/revaluations/date-range")
    @Operation(summary = "Get revaluations by date range")
    public ResponseEntity<List<AssetReval>> getRevalsByDateRange(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime fromDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime toDate) {
        return ResponseEntity.ok(assetManagementService.findRevalsByDateRange(fromDate, toDate));
    }

    @GetMapping("/revaluations/status/{docStatus}")
    @Operation(summary = "Get revaluations by document status")
    public ResponseEntity<List<AssetReval>> getRevalsByDocStatus(@PathVariable String docStatus) {
        return ResponseEntity.ok(assetManagementService.findRevalsByDocStatus(docStatus));
    }

    @GetMapping("/revaluations/processed")
    @Operation(summary = "Get all processed revaluations")
    public ResponseEntity<List<AssetReval>> getProcessedRevals() {
        return ResponseEntity.ok(assetManagementService.findProcessedRevals());
    }

    @GetMapping("/revaluations/unprocessed")
    @Operation(summary = "Get all unprocessed revaluations")
    public ResponseEntity<List<AssetReval>> getUnprocessedRevals() {
        return ResponseEntity.ok(assetManagementService.findUnprocessedRevals());
    }

    @GetMapping("/revaluations/posting-type/{postingType}")
    @Operation(summary = "Get revaluations by posting type")
    public ResponseEntity<List<AssetReval>> getRevalsByPostingType(@PathVariable String postingType) {
        return ResponseEntity.ok(assetManagementService.findRevalsByPostingType(postingType));
    }

    @GetMapping("/revaluations")
    @Operation(summary = "Get all active revaluations")
    public ResponseEntity<List<AssetReval>> getAllActiveRevals() {
        return ResponseEntity.ok(assetManagementService.findAllActiveRevals());
    }

    @PostMapping("/revaluations")
    @Operation(summary = "Create a new asset revaluation")
    public ResponseEntity<AssetReval> createReval(@RequestBody AssetReval assetReval) {
        AssetReval saved = assetManagementService.saveReval(assetReval);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/revaluations/{id}")
    @Operation(summary = "Update an asset revaluation")
    public ResponseEntity<AssetReval> updateReval(
            @PathVariable int id,
            @RequestBody AssetReval assetReval) {
        assetReval.setAAssetRevalEntryId(id);
        AssetReval updated = assetManagementService.saveReval(assetReval);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/revaluations/{id}")
    @Operation(summary = "Delete an asset revaluation")
    public ResponseEntity<Void> deleteReval(@PathVariable int id) {
        assetManagementService.deleteReval(id);
        return ResponseEntity.noContent().build();
    }

    // ========== Asset Transfer Endpoints ==========

    @GetMapping("/transfers/{id}")
    @Operation(summary = "Get asset transfer by ID")
    public ResponseEntity<AssetTransfer> getTransferById(@PathVariable int id) {
        return assetManagementService.findTransferById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/transfers/asset/{assetId}")
    @Operation(summary = "Get all transfers for an asset")
    public ResponseEntity<List<AssetTransfer>> getTransfersByAsset(@PathVariable int assetId) {
        return ResponseEntity.ok(assetManagementService.findTransfersByAsset(assetId));
    }

    @GetMapping("/transfers/document/{documentNo}")
    @Operation(summary = "Get transfer by document number")
    public ResponseEntity<AssetTransfer> getTransferByDocumentNo(
            @PathVariable String documentNo,
            @RequestParam int clientId) {
        return assetManagementService.findTransferByDocumentNo(documentNo, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/transfers/client/{clientId}/org/{orgId}")
    @Operation(summary = "Get transfers by client and organization")
    public ResponseEntity<List<AssetTransfer>> getTransfersByClientAndOrg(
            @PathVariable int clientId,
            @PathVariable int orgId) {
        return ResponseEntity.ok(assetManagementService.findTransfersByClientAndOrg(clientId, orgId));
    }

    @GetMapping("/transfers/period/{periodId}")
    @Operation(summary = "Get transfers by period")
    public ResponseEntity<List<AssetTransfer>> getTransfersByPeriod(@PathVariable int periodId) {
        return ResponseEntity.ok(assetManagementService.findTransfersByPeriod(periodId));
    }

    @GetMapping("/transfers/date-range")
    @Operation(summary = "Get transfers by date range")
    public ResponseEntity<List<AssetTransfer>> getTransfersByDateRange(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime fromDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime toDate) {
        return ResponseEntity.ok(assetManagementService.findTransfersByDateRange(fromDate, toDate));
    }

    @GetMapping("/transfers/status/{docStatus}")
    @Operation(summary = "Get transfers by document status")
    public ResponseEntity<List<AssetTransfer>> getTransfersByDocStatus(@PathVariable String docStatus) {
        return ResponseEntity.ok(assetManagementService.findTransfersByDocStatus(docStatus));
    }

    @GetMapping("/transfers/processed")
    @Operation(summary = "Get all processed transfers")
    public ResponseEntity<List<AssetTransfer>> getProcessedTransfers() {
        return ResponseEntity.ok(assetManagementService.findProcessedTransfers());
    }

    @GetMapping("/transfers/unprocessed")
    @Operation(summary = "Get all unprocessed transfers")
    public ResponseEntity<List<AssetTransfer>> getUnprocessedTransfers() {
        return ResponseEntity.ok(assetManagementService.findUnprocessedTransfers());
    }

    @GetMapping("/transfers/posting-type/{postingType}")
    @Operation(summary = "Get transfers by posting type")
    public ResponseEntity<List<AssetTransfer>> getTransfersByPostingType(@PathVariable String postingType) {
        return ResponseEntity.ok(assetManagementService.findTransfersByPostingType(postingType));
    }

    @GetMapping("/transfers/asset-acct/{assetAcctId}")
    @Operation(summary = "Get transfers by asset account")
    public ResponseEntity<List<AssetTransfer>> getTransfersByAssetAcct(@PathVariable int assetAcctId) {
        return ResponseEntity.ok(assetManagementService.findTransfersByAssetAcct(assetAcctId));
    }

    @GetMapping("/transfers")
    @Operation(summary = "Get all active transfers")
    public ResponseEntity<List<AssetTransfer>> getAllActiveTransfers() {
        return ResponseEntity.ok(assetManagementService.findAllActiveTransfers());
    }

    @PostMapping("/transfers")
    @Operation(summary = "Create a new asset transfer")
    public ResponseEntity<AssetTransfer> createTransfer(@RequestBody AssetTransfer assetTransfer) {
        AssetTransfer saved = assetManagementService.saveTransfer(assetTransfer);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/transfers/{id}")
    @Operation(summary = "Update an asset transfer")
    public ResponseEntity<AssetTransfer> updateTransfer(
            @PathVariable int id,
            @RequestBody AssetTransfer assetTransfer) {
        assetTransfer.setAAssetTransferId(id);
        AssetTransfer updated = assetManagementService.saveTransfer(assetTransfer);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/transfers/{id}")
    @Operation(summary = "Delete an asset transfer")
    public ResponseEntity<Void> deleteTransfer(@PathVariable int id) {
        assetManagementService.deleteTransfer(id);
        return ResponseEntity.noContent().build();
    }

    // ========== Asset Depreciation Entry Endpoints ==========

    @GetMapping("/depreciation-entries/{id}")
    @Operation(summary = "Get depreciation entry by ID")
    public ResponseEntity<AssetDepreciation> getDepreciationById(@PathVariable int id) {
        return assetManagementService.findDepreciationById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/depreciation-entries/acct-schema/{acctSchemaId}")
    @Operation(summary = "Get depreciation entries by accounting schema")
    public ResponseEntity<List<AssetDepreciation>> getDepreciationsByAcctSchema(@PathVariable int acctSchemaId) {
        return ResponseEntity.ok(assetManagementService.findDepreciationsByAcctSchema(acctSchemaId));
    }

    @GetMapping("/depreciation-entries/period/{periodId}")
    @Operation(summary = "Get depreciation entries by period")
    public ResponseEntity<List<AssetDepreciation>> getDepreciationsByPeriod(@PathVariable int periodId) {
        return ResponseEntity.ok(assetManagementService.findDepreciationsByPeriod(periodId));
    }

    @GetMapping("/depreciation-entries/date-range")
    @Operation(summary = "Get depreciation entries by date range")
    public ResponseEntity<List<AssetDepreciation>> getDepreciationsByDateRange(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime fromDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime toDate) {
        return ResponseEntity.ok(assetManagementService.findDepreciationsByDateRange(fromDate, toDate));
    }

    @GetMapping("/depreciation-entries/entry-type/{entryType}")
    @Operation(summary = "Get depreciation entries by entry type")
    public ResponseEntity<List<AssetDepreciation>> getDepreciationsByEntryType(@PathVariable String entryType) {
        return ResponseEntity.ok(assetManagementService.findDepreciationsByEntryType(entryType));
    }

    @GetMapping("/depreciation-entries/posting-type/{postingType}")
    @Operation(summary = "Get depreciation entries by posting type")
    public ResponseEntity<List<AssetDepreciation>> getDepreciationsByPostingType(@PathVariable String postingType) {
        return ResponseEntity.ok(assetManagementService.findDepreciationsByPostingType(postingType));
    }

    @GetMapping("/depreciation-entries/status/{docStatus}")
    @Operation(summary = "Get depreciation entries by document status")
    public ResponseEntity<List<AssetDepreciation>> getDepreciationsByDocStatus(@PathVariable String docStatus) {
        return ResponseEntity.ok(assetManagementService.findDepreciationsByDocStatus(docStatus));
    }

    @GetMapping("/depreciation-entries/processed")
    @Operation(summary = "Get all processed depreciation entries")
    public ResponseEntity<List<AssetDepreciation>> getProcessedDepreciations() {
        return ResponseEntity.ok(assetManagementService.findProcessedDepreciations());
    }

    @GetMapping("/depreciation-entries/unprocessed")
    @Operation(summary = "Get all unprocessed depreciation entries")
    public ResponseEntity<List<AssetDepreciation>> getUnprocessedDepreciations() {
        return ResponseEntity.ok(assetManagementService.findUnprocessedDepreciations());
    }

    @GetMapping("/depreciation-entries/posted/{posted}")
    @Operation(summary = "Get depreciation entries by posted status")
    public ResponseEntity<List<AssetDepreciation>> getDepreciationsByPosted(@PathVariable String posted) {
        return ResponseEntity.ok(assetManagementService.findDepreciationsByPosted(posted));
    }

    @GetMapping("/depreciation-entries/client/{clientId}/org/{orgId}")
    @Operation(summary = "Get depreciation entries by client and organization")
    public ResponseEntity<List<AssetDepreciation>> getDepreciationsByClientAndOrg(
            @PathVariable int clientId,
            @PathVariable int orgId) {
        return ResponseEntity.ok(assetManagementService.findDepreciationsByClientAndOrg(clientId, orgId));
    }

    @GetMapping("/depreciation-entries")
    @Operation(summary = "Get all active depreciation entries")
    public ResponseEntity<List<AssetDepreciation>> getAllActiveDepreciations() {
        return ResponseEntity.ok(assetManagementService.findAllActiveDepreciations());
    }

    @PostMapping("/depreciation-entries")
    @Operation(summary = "Create a new depreciation entry")
    public ResponseEntity<AssetDepreciation> createDepreciation(@RequestBody AssetDepreciation assetDepreciation) {
        AssetDepreciation saved = assetManagementService.saveDepreciation(assetDepreciation);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/depreciation-entries/{id}")
    @Operation(summary = "Update a depreciation entry")
    public ResponseEntity<AssetDepreciation> updateDepreciation(
            @PathVariable int id,
            @RequestBody AssetDepreciation assetDepreciation) {
        assetDepreciation.setADepreciationEntryId(id);
        AssetDepreciation updated = assetManagementService.saveDepreciation(assetDepreciation);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/depreciation-entries/{id}")
    @Operation(summary = "Delete a depreciation entry")
    public ResponseEntity<Void> deleteDepreciation(@PathVariable int id) {
        assetManagementService.deleteDepreciation(id);
        return ResponseEntity.noContent().build();
    }

    // ========== Depreciation (A_Depreciation) Endpoints ==========

    @GetMapping("/depreciations/{id}")
    @Operation(summary = "Get depreciation by ID")
    public ResponseEntity<AssetDepreciationEntry> getDepreciationEntryById(@PathVariable int id) {
        return assetManagementService.findDepreciationEntryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/depreciations/name/{name}")
    @Operation(summary = "Get depreciation by name")
    public ResponseEntity<AssetDepreciationEntry> getDepreciationEntryByName(
            @PathVariable String name,
            @RequestParam int clientId) {
        return assetManagementService.findDepreciationEntryByName(name, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/depreciations/type/{depreciationType}")
    @Operation(summary = "Get depreciations by depreciation type")
    public ResponseEntity<List<AssetDepreciationEntry>> getDepreciationEntriesByType(@PathVariable String depreciationType) {
        return ResponseEntity.ok(assetManagementService.findDepreciationEntriesByType(depreciationType));
    }

    @GetMapping("/depreciations/method/{methodId}")
    @Operation(summary = "Get depreciations by depreciation method")
    public ResponseEntity<List<AssetDepreciationEntry>> getDepreciationEntriesByMethod(@PathVariable int methodId) {
        return ResponseEntity.ok(assetManagementService.findDepreciationEntriesByMethod(methodId));
    }

    @GetMapping("/depreciations/convention/{conventionId}")
    @Operation(summary = "Get depreciations by depreciation convention")
    public ResponseEntity<List<AssetDepreciationEntry>> getDepreciationEntriesByConvention(@PathVariable int conventionId) {
        return ResponseEntity.ok(assetManagementService.findDepreciationEntriesByConvention(conventionId));
    }

    @GetMapping("/depreciations/depreciated")
    @Operation(summary = "Get all depreciated entries")
    public ResponseEntity<List<AssetDepreciationEntry>> getDepreciatedEntries() {
        return ResponseEntity.ok(assetManagementService.findDepreciatedEntries());
    }

    @GetMapping("/depreciations/processed")
    @Operation(summary = "Get all processed depreciations")
    public ResponseEntity<List<AssetDepreciationEntry>> getProcessedDepreciationEntries() {
        return ResponseEntity.ok(assetManagementService.findProcessedDepreciationEntries());
    }

    @GetMapping("/depreciations/unprocessed")
    @Operation(summary = "Get all unprocessed depreciations")
    public ResponseEntity<List<AssetDepreciationEntry>> getUnprocessedDepreciationEntries() {
        return ResponseEntity.ok(assetManagementService.findUnprocessedDepreciationEntries());
    }

    @GetMapping("/depreciations/client/{clientId}/org/{orgId}")
    @Operation(summary = "Get depreciations by client and organization")
    public ResponseEntity<List<AssetDepreciationEntry>> getDepreciationEntriesByClientAndOrg(
            @PathVariable int clientId,
            @PathVariable int orgId) {
        return ResponseEntity.ok(assetManagementService.findDepreciationEntriesByClientAndOrg(clientId, orgId));
    }

    @GetMapping("/depreciations")
    @Operation(summary = "Get all active depreciations")
    public ResponseEntity<List<AssetDepreciationEntry>> getAllActiveDepreciationEntries() {
        return ResponseEntity.ok(assetManagementService.findAllActiveDepreciationEntries());
    }

    @PostMapping("/depreciations")
    @Operation(summary = "Create a new depreciation")
    public ResponseEntity<AssetDepreciationEntry> createDepreciationEntry(@RequestBody AssetDepreciationEntry assetDepreciationEntry) {
        AssetDepreciationEntry saved = assetManagementService.saveDepreciationEntry(assetDepreciationEntry);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/depreciations/{id}")
    @Operation(summary = "Update a depreciation")
    public ResponseEntity<AssetDepreciationEntry> updateDepreciationEntry(
            @PathVariable int id,
            @RequestBody AssetDepreciationEntry assetDepreciationEntry) {
        assetDepreciationEntry.setADepreciationId(id);
        AssetDepreciationEntry updated = assetManagementService.saveDepreciationEntry(assetDepreciationEntry);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/depreciations/{id}")
    @Operation(summary = "Delete a depreciation")
    public ResponseEntity<Void> deleteDepreciationEntry(@PathVariable int id) {
        assetManagementService.deleteDepreciationEntry(id);
        return ResponseEntity.noContent().build();
    }

    // ========== Asset Accounting Endpoints ==========

    @GetMapping("/accounting/{id}")
    @Operation(summary = "Get asset accounting by ID")
    public ResponseEntity<AssetAcct> getAcctById(@PathVariable int id) {
        return assetManagementService.findAcctById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/accounting/asset/{assetId}")
    @Operation(summary = "Get all accounting entries for an asset")
    public ResponseEntity<List<AssetAcct>> getAcctsByAsset(@PathVariable int assetId) {
        return ResponseEntity.ok(assetManagementService.findAcctsByAsset(assetId));
    }

    @GetMapping("/accounting/asset/{assetId}/schema/{acctSchemaId}")
    @Operation(summary = "Get accounting by asset and accounting schema")
    public ResponseEntity<AssetAcct> getAcctByAssetAndAcctSchema(
            @PathVariable int assetId,
            @PathVariable int acctSchemaId) {
        return assetManagementService.findAcctByAssetAndAcctSchema(assetId, acctSchemaId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/accounting/schema/{acctSchemaId}")
    @Operation(summary = "Get accounting entries by accounting schema")
    public ResponseEntity<List<AssetAcct>> getAcctsByAcctSchema(@PathVariable int acctSchemaId) {
        return ResponseEntity.ok(assetManagementService.findAcctsByAcctSchema(acctSchemaId));
    }

    @GetMapping("/accounting/posting-type/{postingType}")
    @Operation(summary = "Get accounting entries by posting type")
    public ResponseEntity<List<AssetAcct>> getAcctsByPostingType(@PathVariable String postingType) {
        return ResponseEntity.ok(assetManagementService.findAcctsByPostingType(postingType));
    }

    @GetMapping("/accounting/depreciation-method/{methodId}")
    @Operation(summary = "Get accounting entries by depreciation method")
    public ResponseEntity<List<AssetAcct>> getAcctsByDepreciationMethod(@PathVariable int methodId) {
        return ResponseEntity.ok(assetManagementService.findAcctsByDepreciationMethod(methodId));
    }

    @GetMapping("/accounting/depreciation-table/{tableHeaderId}")
    @Operation(summary = "Get accounting entries by depreciation table")
    public ResponseEntity<List<AssetAcct>> getAcctsByDepreciationTable(@PathVariable int tableHeaderId) {
        return ResponseEntity.ok(assetManagementService.findAcctsByDepreciationTable(tableHeaderId));
    }

    @GetMapping("/accounting/spread-type/{spreadType}")
    @Operation(summary = "Get accounting entries by asset spread type")
    public ResponseEntity<List<AssetAcct>> getAcctsByAssetSpreadType(@PathVariable int spreadType) {
        return ResponseEntity.ok(assetManagementService.findAcctsByAssetSpreadType(spreadType));
    }

    @GetMapping("/accounting/processing")
    @Operation(summary = "Get all processing accounting entries")
    public ResponseEntity<List<AssetAcct>> getProcessingAccts() {
        return ResponseEntity.ok(assetManagementService.findProcessingAccts());
    }

    @GetMapping("/accounting/client/{clientId}/org/{orgId}")
    @Operation(summary = "Get accounting entries by client and organization")
    public ResponseEntity<List<AssetAcct>> getAcctsByClientAndOrg(
            @PathVariable int clientId,
            @PathVariable int orgId) {
        return ResponseEntity.ok(assetManagementService.findAcctsByClientAndOrg(clientId, orgId));
    }

    @GetMapping("/accounting")
    @Operation(summary = "Get all active accounting entries")
    public ResponseEntity<List<AssetAcct>> getAllActiveAccts() {
        return ResponseEntity.ok(assetManagementService.findAllActiveAccts());
    }

    @PostMapping("/accounting")
    @Operation(summary = "Create a new asset accounting entry")
    public ResponseEntity<AssetAcct> createAcct(@RequestBody AssetAcct assetAcct) {
        AssetAcct saved = assetManagementService.saveAcct(assetAcct);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/accounting/{id}")
    @Operation(summary = "Update an asset accounting entry")
    public ResponseEntity<AssetAcct> updateAcct(
            @PathVariable int id,
            @RequestBody AssetAcct assetAcct) {
        assetAcct.setAAssetAcctId(id);
        AssetAcct updated = assetManagementService.saveAcct(assetAcct);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/accounting/{id}")
    @Operation(summary = "Delete an asset accounting entry")
    public ResponseEntity<Void> deleteAcct(@PathVariable int id) {
        assetManagementService.deleteAcct(id);
        return ResponseEntity.noContent().build();
    }
}
