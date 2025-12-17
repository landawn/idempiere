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
 * POS tender type configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_POSTenderType")
public class POSTenderType extends BaseEntity {

    @Id
    @Column("C_POSTenderType_ID")
    private Integer cPOSTenderTypeId;

    @Column("C_POSTerminal_ID")
    private Integer cPOSTerminalId;

    @Column("Name")
    private String name;

    @Column("TenderType")
    private String tenderType;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("C_CashBook_ID")
    private Integer cCashBookId;

    @Column("IsPostDated")
    private String isPostDated;
}
