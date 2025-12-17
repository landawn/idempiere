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
 * Time and Expense Report entity - S_TimeExpense table.
 * Time and expense report header.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("S_TimeExpense")
public class STimeExpense extends BaseEntity {

    @Id
    @Column("S_TimeExpense_ID")
    private Integer sTimeExpenseId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Approved")
    private String approved;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("DateReport")
    private LocalDateTime dateReport;

    @Column("Description")
    private String description;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocumentNo")
    private String documentNo;

    @Column("IsApproved")
    private String isApproved;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("TotalAmt")
    private BigDecimal totalAmt;
}
