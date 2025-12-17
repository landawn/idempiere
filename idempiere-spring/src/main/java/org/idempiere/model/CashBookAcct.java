package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Cash Book Accounting entity - C_CashBook_Acct table.
 * Cash book accounting configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_CashBook_Acct")
public class CashBookAcct extends BaseEntity {

    @Id
    @Column("C_CashBook_ID")
    private Integer cCashBookId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("CB_Asset_Acct")
    private Integer cbAssetAcct;

    @Column("CB_CashTransfer_Acct")
    private Integer cbCashTransferAcct;

    @Column("CB_Differences_Acct")
    private Integer cbDifferencesAcct;

    @Column("CB_Expense_Acct")
    private Integer cbExpenseAcct;

    @Column("CB_Receipt_Acct")
    private Integer cbReceiptAcct;
}
