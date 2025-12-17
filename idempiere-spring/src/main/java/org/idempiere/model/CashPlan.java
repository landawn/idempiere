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
 * Cash Plan entity.
 * Maps to C_CashPlan table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_CashPlan")
public class CashPlan extends BaseEntity {

    @Id
    @Column("C_CashPlan_ID")
    private Integer cCashPlanId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("DateFrom")
    private LocalDateTime dateFrom;

    @Column("DateTo")
    private LocalDateTime dateTo;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("TotalAmt")
    private BigDecimal totalAmt;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;
}
