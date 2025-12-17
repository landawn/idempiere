package org.idempiere.service;

import java.util.List;
import java.util.Optional;

import org.idempiere.dao.DocTypeDao;
import org.idempiere.model.DocType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Document Type business operations.
 */
@Service
@Transactional
public class DocTypeService {

    private final DocTypeDao docTypeDao;

    public DocTypeService(DocTypeDao docTypeDao) {
        this.docTypeDao = docTypeDao;
    }

    /**
     * Find document type by ID.
     */
    public Optional<DocType> findById(int docTypeId) {
        return docTypeDao.findById(docTypeId);
    }

    /**
     * Find document type by name.
     */
    public Optional<DocType> findByName(String name) {
        return docTypeDao.findByName(name);
    }

    /**
     * Find all document types for a client and organization.
     */
    public List<DocType> findByClientAndOrg(int clientId, int orgId) {
        return docTypeDao.findByClientAndOrg(clientId, orgId);
    }

    /**
     * Find document types by base type.
     */
    public List<DocType> findByDocBaseType(String docBaseType, int clientId, int orgId) {
        return docTypeDao.findByDocBaseType(docBaseType, clientId, orgId);
    }

    /**
     * Find document types by base type and sales transaction flag.
     */
    public List<DocType> findByDocBaseTypeAndSOTrx(String docBaseType, boolean isSOTrx, int clientId) {
        return docTypeDao.findByDocBaseTypeAndSOTrx(docBaseType, isSOTrx ? "Y" : "N", clientId);
    }

    /**
     * Find default document type by base type.
     */
    public Optional<DocType> findDefaultByDocBaseType(String docBaseType, int clientId, int orgId) {
        return docTypeDao.findDefaultByDocBaseType(docBaseType, clientId, orgId);
    }

    /**
     * Get document type for Sales Order.
     */
    public Optional<DocType> getSalesOrderDocType(int clientId, int orgId) {
        return findDefaultByDocBaseType("SOO", clientId, orgId);
    }

    /**
     * Get document type for Purchase Order.
     */
    public Optional<DocType> getPurchaseOrderDocType(int clientId, int orgId) {
        return findDefaultByDocBaseType("POO", clientId, orgId);
    }

    /**
     * Get document type for AR Invoice.
     */
    public Optional<DocType> getARInvoiceDocType(int clientId, int orgId) {
        return findDefaultByDocBaseType("ARI", clientId, orgId);
    }

    /**
     * Get document type for AP Invoice.
     */
    public Optional<DocType> getAPInvoiceDocType(int clientId, int orgId) {
        return findDefaultByDocBaseType("API", clientId, orgId);
    }

    /**
     * Get document type for AR Receipt.
     */
    public Optional<DocType> getARReceiptDocType(int clientId, int orgId) {
        return findDefaultByDocBaseType("ARR", clientId, orgId);
    }

    /**
     * Get document type for AP Payment.
     */
    public Optional<DocType> getAPPaymentDocType(int clientId, int orgId) {
        return findDefaultByDocBaseType("APP", clientId, orgId);
    }

    /**
     * Get document type for Material Receipt.
     */
    public Optional<DocType> getMaterialReceiptDocType(int clientId, int orgId) {
        return findDefaultByDocBaseType("MMR", clientId, orgId);
    }

    /**
     * Get document type for Material Shipment.
     */
    public Optional<DocType> getMaterialShipmentDocType(int clientId, int orgId) {
        return findDefaultByDocBaseType("MMS", clientId, orgId);
    }

    /**
     * Get document type for GL Journal.
     */
    public Optional<DocType> getGLJournalDocType(int clientId, int orgId) {
        return findDefaultByDocBaseType("GLJ", clientId, orgId);
    }

    /**
     * Find all active document types.
     */
    public List<DocType> findAllActive() {
        return docTypeDao.findAllActive();
    }

    /**
     * Save a document type.
     */
    public DocType save(DocType docType) {
        if (docType.getCDocTypeId() == null || docType.getCDocTypeId() == 0) {
            docTypeDao.insert(docType);
        } else {
            docTypeDao.update(docType);
        }
        return docType;
    }

    /**
     * Delete a document type.
     */
    public void delete(int docTypeId) {
        docTypeDao.deleteById(docTypeId);
    }
}
