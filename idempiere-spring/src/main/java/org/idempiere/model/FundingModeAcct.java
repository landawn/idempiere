package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Funding Mode Acct entity - A_FundingMode_Acct table.
 * Asset funding mode accounting.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_FundingMode_Acct")
public class FundingModeAcct extends BaseEntity {

    @Id
    @Column("A_FundingMode_ID")
    private Integer aFundingModeId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("A_FundingMode_Acct")
    private Integer aFundingModeAcct;
}
