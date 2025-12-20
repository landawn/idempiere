package org.idempiere.service;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.AssetAcctDao;
import org.idempiere.dao.AssetAdditionDao;
import org.idempiere.dao.AssetDepreciationDao;
import org.idempiere.dao.AssetDepreciationEntryDao;
import org.idempiere.dao.AssetDisposalDao;
import org.idempiere.dao.AssetRevalDao;
import org.idempiere.dao.AssetTransferDao;
import org.idempiere.model.AssetAcct;
import org.idempiere.model.AssetAddition;
import org.idempiere.model.AssetDepreciation;
import org.idempiere.model.AssetDepreciationEntry;
import org.idempiere.model.AssetDisposal;
import org.idempiere.model.AssetReval;
import org.idempiere.model.AssetTransfer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Asset Management operations.
 * Combines all asset-related DAOs for comprehensive asset management.
 */
@Service
@Transactional
public class AssetManagementService {

    private final AssetAdditionDao assetAdditionDao;
    private final AssetDisposalDao assetDisposalDao;
    private final AssetRevalDao assetRevalDao;
    private final AssetTransferDao assetTransferDao;
    private final AssetDepreciationDao assetDepreciationDao;
    private final AssetDepreciationEntryDao assetDepreciationEntryDao;
    private final AssetAcctDao assetAcctDao;

    public AssetManagementService(
            AssetAdditionDao assetAdditionDao,
            AssetDisposalDao assetDisposalDao,
            AssetRevalDao assetRevalDao,
            AssetTransferDao assetTransferDao,
            AssetDepreciationDao assetDepreciationDao,
            AssetDepreciationEntryDao assetDepreciationEntryDao,
            AssetAcctDao assetAcctDao) {
        this.assetAdditionDao = assetAdditionDao;
        this.assetDisposalDao = assetDisposalDao;
        this.assetRevalDao = assetRevalDao;
        this.assetTransferDao = assetTransferDao;
        this.assetDepreciationDao = assetDepreciationDao;
        this.assetDepreciationEntryDao = assetDepreciationEntryDao;
        this.assetAcctDao = assetAcctDao;
    }

    // ========== Asset Addition Methods ==========

    public Optional<AssetAddition> findAdditionById(int id) {
        try {
            return Optional.ofNullable(assetAdditionDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<AssetAddition> findAdditionsByAsset(int assetId) {
        return assetAdditionDao.findByAsset(assetId);
    }

    public Optional<AssetAddition> findAdditionByDocumentNo(String documentNo, int clientId) {
        return assetAdditionDao.findByDocumentNo(documentNo, clientId);
    }

    public List<AssetAddition> findAdditionsByClientAndOrg(int clientId, int orgId) {
        return assetAdditionDao.findByClientAndOrg(clientId, orgId);
    }

    public List<AssetAddition> findAdditionsByDocStatus(String docStatus) {
        return assetAdditionDao.findByDocStatus(docStatus);
    }

    public List<AssetAddition> findAdditionsByInvoice(int invoiceId) {
        return assetAdditionDao.findByInvoice(invoiceId);
    }

    public List<AssetAddition> findAdditionsBySourceType(String sourceType) {
        return assetAdditionDao.findBySourceType(sourceType);
    }

    public List<AssetAddition> findProcessedAdditions() {
        return assetAdditionDao.findProcessed();
    }

    public List<AssetAddition> findUnprocessedAdditions() {
        return assetAdditionDao.findUnprocessed();
    }

    public List<AssetAddition> findAllActiveAdditions() {
        return assetAdditionDao.findAllActive();
    }

    public AssetAddition saveAddition(AssetAddition assetAddition) {
        try {
            if (assetAddition.getAAssetAdditionId() == null || assetAddition.getAAssetAdditionId() == 0) {
                assetAdditionDao.insert(assetAddition);
            } else {
                assetAdditionDao.update(assetAddition);
            }
            return assetAddition;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteAddition(int id) {
        try {
            assetAdditionDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    // ========== Asset Disposal Methods ==========

    public Optional<AssetDisposal> findDisposalById(int id) {
        try {
            return Optional.ofNullable(assetDisposalDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<AssetDisposal> findDisposalsByAsset(int assetId) {
        return assetDisposalDao.findByAsset(assetId);
    }

    public List<AssetDisposal> findDisposalsByClientAndOrg(int clientId, int orgId) {
        return assetDisposalDao.findByClientAndOrg(clientId, orgId);
    }

    public List<AssetDisposal> findDisposalsByMethod(String method) {
        return assetDisposalDao.findByDisposalMethod(method);
    }

    public List<AssetDisposal> findDisposalsByDateRange(LocalDateTime fromDate, LocalDateTime toDate) {
        return assetDisposalDao.findByDateRange(fromDate, toDate);
    }

    public List<AssetDisposal> findDisposalsByPeriod(int periodId) {
        return assetDisposalDao.findByPeriod(periodId);
    }

    public List<AssetDisposal> findProcessedDisposals() {
        return assetDisposalDao.findProcessed();
    }

    public List<AssetDisposal> findUnprocessedDisposals() {
        return assetDisposalDao.findUnprocessed();
    }

    public List<AssetDisposal> findDisposalsByPostingType(String postingType) {
        return assetDisposalDao.findByPostingType(postingType);
    }

    public List<AssetDisposal> findAllActiveDisposals() {
        return assetDisposalDao.findAllActive();
    }

    public AssetDisposal saveDisposal(AssetDisposal assetDisposal) {
        try {
            if (assetDisposal.getAAssetDisposedId() == null || assetDisposal.getAAssetDisposedId() == 0) {
                assetDisposalDao.insert(assetDisposal);
            } else {
                assetDisposalDao.update(assetDisposal);
            }
            return assetDisposal;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteDisposal(int id) {
        try {
            assetDisposalDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    // ========== Asset Revaluation Methods ==========

    public Optional<AssetReval> findRevalById(int id) {
        try {
            return Optional.ofNullable(assetRevalDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<AssetReval> findRevalsByAsset(int assetId) {
        return assetRevalDao.findByAsset(assetId);
    }

    public Optional<AssetReval> findRevalByDocumentNo(String documentNo, int clientId) {
        return assetRevalDao.findByDocumentNo(documentNo, clientId);
    }

    public List<AssetReval> findRevalsByClientAndOrg(int clientId, int orgId) {
        return assetRevalDao.findByClientAndOrg(clientId, orgId);
    }

    public List<AssetReval> findRevalsByPeriod(int periodId) {
        return assetRevalDao.findByPeriod(periodId);
    }

    public List<AssetReval> findRevalsByDateRange(LocalDateTime fromDate, LocalDateTime toDate) {
        return assetRevalDao.findByDateRange(fromDate, toDate);
    }

    public List<AssetReval> findRevalsByDocStatus(String docStatus) {
        return assetRevalDao.findByDocStatus(docStatus);
    }

    public List<AssetReval> findProcessedRevals() {
        return assetRevalDao.findProcessed();
    }

    public List<AssetReval> findUnprocessedRevals() {
        return assetRevalDao.findUnprocessed();
    }

    public List<AssetReval> findRevalsByPostingType(String postingType) {
        return assetRevalDao.findByPostingType(postingType);
    }

    public List<AssetReval> findAllActiveRevals() {
        return assetRevalDao.findAllActive();
    }

    public AssetReval saveReval(AssetReval assetReval) {
        try {
            if (assetReval.getAAssetRevalEntryId() == null || assetReval.getAAssetRevalEntryId() == 0) {
                assetRevalDao.insert(assetReval);
            } else {
                assetRevalDao.update(assetReval);
            }
            return assetReval;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteReval(int id) {
        try {
            assetRevalDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    // ========== Asset Transfer Methods ==========

    public Optional<AssetTransfer> findTransferById(int id) {
        try {
            return Optional.ofNullable(assetTransferDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<AssetTransfer> findTransfersByAsset(int assetId) {
        return assetTransferDao.findByAsset(assetId);
    }

    public Optional<AssetTransfer> findTransferByDocumentNo(String documentNo, int clientId) {
        return assetTransferDao.findByDocumentNo(documentNo, clientId);
    }

    public List<AssetTransfer> findTransfersByClientAndOrg(int clientId, int orgId) {
        return assetTransferDao.findByClientAndOrg(clientId, orgId);
    }

    public List<AssetTransfer> findTransfersByPeriod(int periodId) {
        return assetTransferDao.findByPeriod(periodId);
    }

    public List<AssetTransfer> findTransfersByDateRange(LocalDateTime fromDate, LocalDateTime toDate) {
        return assetTransferDao.findByDateRange(fromDate, toDate);
    }

    public List<AssetTransfer> findTransfersByDocStatus(String docStatus) {
        return assetTransferDao.findByDocStatus(docStatus);
    }

    public List<AssetTransfer> findProcessedTransfers() {
        return assetTransferDao.findProcessed();
    }

    public List<AssetTransfer> findUnprocessedTransfers() {
        return assetTransferDao.findUnprocessed();
    }

    public List<AssetTransfer> findTransfersByPostingType(String postingType) {
        return assetTransferDao.findByPostingType(postingType);
    }

    public List<AssetTransfer> findTransfersByAssetAcct(int assetAcctId) {
        return assetTransferDao.findByAssetAcct(assetAcctId);
    }

    public List<AssetTransfer> findAllActiveTransfers() {
        return assetTransferDao.findAllActive();
    }

    public AssetTransfer saveTransfer(AssetTransfer assetTransfer) {
        try {
            if (assetTransfer.getAAssetTransferId() == null || assetTransfer.getAAssetTransferId() == 0) {
                assetTransferDao.insert(assetTransfer);
            } else {
                assetTransferDao.update(assetTransfer);
            }
            return assetTransfer;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteTransfer(int id) {
        try {
            assetTransferDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    // ========== Asset Depreciation Entry Methods ==========

    public Optional<AssetDepreciation> findDepreciationById(int id) {
        try {
            return Optional.ofNullable(assetDepreciationDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<AssetDepreciation> findDepreciationsByAcctSchema(int acctSchemaId) {
        return assetDepreciationDao.findByAcctSchema(acctSchemaId);
    }

    public List<AssetDepreciation> findDepreciationsByPeriod(int periodId) {
        return assetDepreciationDao.findByPeriod(periodId);
    }

    public List<AssetDepreciation> findDepreciationsByDateRange(LocalDateTime fromDate, LocalDateTime toDate) {
        return assetDepreciationDao.findByDateRange(fromDate, toDate);
    }

    public List<AssetDepreciation> findDepreciationsByEntryType(String entryType) {
        return assetDepreciationDao.findByEntryType(entryType);
    }

    public List<AssetDepreciation> findDepreciationsByPostingType(String postingType) {
        return assetDepreciationDao.findByPostingType(postingType);
    }

    public List<AssetDepreciation> findDepreciationsByDocStatus(String docStatus) {
        return assetDepreciationDao.findByDocStatus(docStatus);
    }

    public List<AssetDepreciation> findProcessedDepreciations() {
        return assetDepreciationDao.findProcessed();
    }

    public List<AssetDepreciation> findUnprocessedDepreciations() {
        return assetDepreciationDao.findUnprocessed();
    }

    public List<AssetDepreciation> findDepreciationsByPosted(String posted) {
        return assetDepreciationDao.findByPosted(posted);
    }

    public List<AssetDepreciation> findDepreciationsByClientAndOrg(int clientId, int orgId) {
        return assetDepreciationDao.findByClientAndOrg(clientId, orgId);
    }

    public List<AssetDepreciation> findAllActiveDepreciations() {
        return assetDepreciationDao.findAllActive();
    }

    public AssetDepreciation saveDepreciation(AssetDepreciation assetDepreciation) {
        try {
            if (assetDepreciation.getADepreciationEntryId() == null || assetDepreciation.getADepreciationEntryId() == 0) {
                assetDepreciationDao.insert(assetDepreciation);
            } else {
                assetDepreciationDao.update(assetDepreciation);
            }
            return assetDepreciation;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteDepreciation(int id) {
        try {
            assetDepreciationDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    // ========== Asset Depreciation Entry (A_Depreciation) Methods ==========

    public Optional<AssetDepreciationEntry> findDepreciationEntryById(int id) {
        try {
            return Optional.ofNullable(assetDepreciationEntryDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public Optional<AssetDepreciationEntry> findDepreciationEntryByName(String name, int clientId) {
        return assetDepreciationEntryDao.findByName(name, clientId);
    }

    public List<AssetDepreciationEntry> findDepreciationEntriesByType(String depreciationType) {
        return assetDepreciationEntryDao.findByDepreciationType(depreciationType);
    }

    public List<AssetDepreciationEntry> findDepreciationEntriesByMethod(int methodId) {
        return assetDepreciationEntryDao.findByDepreciationMethod(methodId);
    }

    public List<AssetDepreciationEntry> findDepreciationEntriesByConvention(int conventionId) {
        return assetDepreciationEntryDao.findByDepreciationConvention(conventionId);
    }

    public List<AssetDepreciationEntry> findDepreciatedEntries() {
        return assetDepreciationEntryDao.findDepreciated();
    }

    public List<AssetDepreciationEntry> findProcessedDepreciationEntries() {
        return assetDepreciationEntryDao.findProcessed();
    }

    public List<AssetDepreciationEntry> findUnprocessedDepreciationEntries() {
        return assetDepreciationEntryDao.findUnprocessed();
    }

    public List<AssetDepreciationEntry> findDepreciationEntriesByClientAndOrg(int clientId, int orgId) {
        return assetDepreciationEntryDao.findByClientAndOrg(clientId, orgId);
    }

    public List<AssetDepreciationEntry> findAllActiveDepreciationEntries() {
        return assetDepreciationEntryDao.findAllActive();
    }

    public AssetDepreciationEntry saveDepreciationEntry(AssetDepreciationEntry assetDepreciationEntry) {
        try {
            if (assetDepreciationEntry.getADepreciationId() == null || assetDepreciationEntry.getADepreciationId() == 0) {
                assetDepreciationEntryDao.insert(assetDepreciationEntry);
            } else {
                assetDepreciationEntryDao.update(assetDepreciationEntry);
            }
            return assetDepreciationEntry;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteDepreciationEntry(int id) {
        try {
            assetDepreciationEntryDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    // ========== Asset Accounting Methods ==========

    public Optional<AssetAcct> findAcctById(int id) {
        try {
            return Optional.ofNullable(assetAcctDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<AssetAcct> findAcctsByAsset(int assetId) {
        return assetAcctDao.findByAsset(assetId);
    }

    public Optional<AssetAcct> findAcctByAssetAndAcctSchema(int assetId, int acctSchemaId) {
        return assetAcctDao.findByAssetAndAcctSchema(assetId, acctSchemaId);
    }

    public List<AssetAcct> findAcctsByAcctSchema(int acctSchemaId) {
        return assetAcctDao.findByAcctSchema(acctSchemaId);
    }

    public List<AssetAcct> findAcctsByPostingType(String postingType) {
        return assetAcctDao.findByPostingType(postingType);
    }

    public List<AssetAcct> findAcctsByDepreciationMethod(int methodId) {
        return assetAcctDao.findByDepreciationMethod(methodId);
    }

    public List<AssetAcct> findAcctsByDepreciationTable(int tableHeaderId) {
        return assetAcctDao.findByDepreciationTable(tableHeaderId);
    }

    public List<AssetAcct> findAcctsByAssetSpreadType(int spreadType) {
        return assetAcctDao.findByAssetSpreadType(spreadType);
    }

    public List<AssetAcct> findProcessingAccts() {
        return assetAcctDao.findProcessing();
    }

    public List<AssetAcct> findAcctsByClientAndOrg(int clientId, int orgId) {
        return assetAcctDao.findByClientAndOrg(clientId, orgId);
    }

    public List<AssetAcct> findAllActiveAccts() {
        return assetAcctDao.findAllActive();
    }

    public AssetAcct saveAcct(AssetAcct assetAcct) {
        try {
            if (assetAcct.getAAssetAcctId() == null || assetAcct.getAAssetAcctId() == 0) {
                assetAcctDao.insert(assetAcct);
            } else {
                assetAcctDao.update(assetAcct);
            }
            return assetAcct;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteAcct(int id) {
        try {
            assetAcctDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }
}
