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
 * Payment Selection entity - represents payment selection headers.
 * Maps to C_PaySelection table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_PaySelection")
public class PaySelection extends BaseEntity {

    @Id
    @Column("C_PaySelection_ID")
    private Integer cPaySelectionId;

    @Column("C_PaySelection_UU")
    private String cPaySelectionUu;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("PayDate")
    private LocalDateTime payDate;

    @Column("IsApproved")
    private String isApproved;

    @Column("ProcessedOn")
    private BigDecimal processedOn;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("TotalAmt")
    private BigDecimal totalAmt;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("CreateFrom")
    private String createFrom;
}
