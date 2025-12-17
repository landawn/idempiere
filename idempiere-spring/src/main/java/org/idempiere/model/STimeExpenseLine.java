package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Time and Expense Line entity - S_TimeExpenseLine table.
 * Line item in time and expense report.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("S_TimeExpenseLine")
public class STimeExpenseLine extends BaseEntity {

    @Id
    @Column("S_TimeExpenseLine_ID")
    private Integer sTimeExpenseLineId;

    @Column("S_TimeExpense_ID")
    private Integer sTimeExpenseId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_ProjectPhase_ID")
    private Integer cProjectPhaseId;

    @Column("C_ProjectTask_ID")
    private Integer cProjectTaskId;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("ConvertedAmt")
    private BigDecimal convertedAmt;

    @Column("DateExpense")
    private LocalDateTime dateExpense;

    @Column("Description")
    private String description;

    @Column("ExpenseAmt")
    private BigDecimal expenseAmt;

    @Column("InvoicePrice")
    private BigDecimal invoicePrice;

    @Column("IsInvoiced")
    private String isInvoiced;

    @Column("IsTimeReport")
    private String isTimeReport;

    @Column("Line")
    private Integer line;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("PriceInvoiced")
    private BigDecimal priceInvoiced;

    @Column("PriceReimbursed")
    private BigDecimal priceReimbursed;

    @Column("Qty")
    private BigDecimal qty;

    @Column("QtyInvoiced")
    private BigDecimal qtyInvoiced;

    @Column("QtyReimbursed")
    private BigDecimal qtyReimbursed;

    @Column("S_ResourceAssignment_ID")
    private Integer sResourceAssignmentId;

    @Column("S_TimeType_ID")
    private Integer sTimeTypeId;
}
