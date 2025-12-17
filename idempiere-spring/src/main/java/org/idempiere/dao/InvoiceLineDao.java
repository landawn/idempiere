package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.InvoiceLine;

/**
 * DAO interface for InvoiceLine entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface InvoiceLineDao extends CrudDao<InvoiceLine, Integer, SQLBuilder.NSC, InvoiceLineDao> {

    /**
     * Find all invoice lines for an invoice
     */
    @Select("SELECT * FROM C_InvoiceLine WHERE C_Invoice_ID = :invoiceId AND IsActive = 'Y' ORDER BY Line")
    List<InvoiceLine> findByInvoiceId(Integer invoiceId);

    /**
     * Find invoice lines by product
     */
    @Select("SELECT * FROM C_InvoiceLine WHERE M_Product_ID = :productId AND IsActive = 'Y' ORDER BY Created DESC")
    List<InvoiceLine> findByProductId(Integer productId);

    /**
     * Find invoice lines by order line
     */
    @Select("SELECT * FROM C_InvoiceLine WHERE C_OrderLine_ID = :orderLineId AND IsActive = 'Y' ORDER BY Created DESC")
    List<InvoiceLine> findByOrderLineId(Integer orderLineId);

    /**
     * Find description lines for an invoice
     */
    @Select("SELECT * FROM C_InvoiceLine WHERE C_Invoice_ID = :invoiceId AND IsDescription = 'Y' AND IsActive = 'Y' ORDER BY Line")
    List<InvoiceLine> findDescriptionLinesByInvoiceId(Integer invoiceId);

    /**
     * Find invoice lines by charge
     */
    @Select("SELECT * FROM C_InvoiceLine WHERE C_Charge_ID = :chargeId AND IsActive = 'Y' ORDER BY Created DESC")
    List<InvoiceLine> findByChargeId(Integer chargeId);

    /**
     * Find invoice lines by project
     */
    @Select("SELECT * FROM C_InvoiceLine WHERE C_Project_ID = :projectId AND IsActive = 'Y' ORDER BY Created DESC")
    List<InvoiceLine> findByProjectId(Integer projectId);

    /**
     * Find invoice lines by asset
     */
    @Select("SELECT * FROM C_InvoiceLine WHERE A_Asset_ID = :assetId AND IsActive = 'Y' ORDER BY Created DESC")
    List<InvoiceLine> findByAssetId(Integer assetId);
}
