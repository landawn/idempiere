package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * POS Tender Type entity - C_POSTenderType table.
 * Point of Sale tender type.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_POSTenderType")
public class CPOSTenderType extends BaseEntity {

    @Id
    @Column("C_POSTenderType_ID")
    private Integer cPosTenderTypeId;

    @Column("C_POS_ID")
    private Integer cPosId;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("C_CashBook_ID")
    private Integer cCashBookId;

    @Column("IsPostDated")
    private String isPostDated;

    @Column("MaximumDailyAmt")
    private java.math.BigDecimal maximumDailyAmt;

    @Column("TenderType")
    private String tenderType;
}
