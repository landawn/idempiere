package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Project Line entity - individual project line items.
 * Maps to C_ProjectLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ProjectLine")
public class ProjectLine extends BaseEntity {

    @Id
    @Column("C_ProjectLine_ID")
    private Integer cProjectLineId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_ProjectPhase_ID")
    private Integer cProjectPhaseId;

    @Column("C_ProjectTask_ID")
    private Integer cProjectTaskId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Product_Category_ID")
    private Integer mProductCategoryId;

    @Column("PlannedAmt")
    private BigDecimal plannedAmt;

    @Column("PlannedQty")
    private BigDecimal plannedQty;

    @Column("PlannedPrice")
    private BigDecimal plannedPrice;

    @Column("PlannedMarginAmt")
    private BigDecimal plannedMarginAmt;

    @Column("CommittedAmt")
    private BigDecimal committedAmt;

    @Column("CommittedQty")
    private BigDecimal committedQty;

    @Column("InvoicedAmt")
    private BigDecimal invoicedAmt;

    @Column("InvoicedQty")
    private BigDecimal invoicedQty;

    @Column("IsPrinted")
    private String isPrinted;

    @Column("Processed")
    private String processed;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_OrderPO_ID")
    private Integer cOrderPoId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("DoInvoice")
    private String doInvoice;
}
