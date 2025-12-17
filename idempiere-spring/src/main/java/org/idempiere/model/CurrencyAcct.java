package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Currency Accounting entity.
 * Maps to C_Currency_Acct table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Currency_Acct")
public class CurrencyAcct extends BaseEntity {

    @Id
    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Realized_Gain_Acct")
    private Integer realizedGainAcct;

    @Column("Realized_Loss_Acct")
    private Integer realizedLossAcct;

    @Column("Unrealized_Gain_Acct")
    private Integer unrealizedGainAcct;

    @Column("Unrealized_Loss_Acct")
    private Integer unrealizedLossAcct;
}
