package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Withholding Accounting entity - C_Withholding_Acct table.
 * Withholding tax accounting configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Withholding_Acct")
public class WithholdingAcct extends BaseEntity {

    @Id
    @Column("C_Withholding_Acct_ID")
    private Integer cWithholdingAcctId;

    @Column("C_Withholding_ID")
    private Integer cWithholdingId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Withholding_Acct")
    private Integer withholdingAcct;
}
