package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Accounting Schema entity - defines the accounting rules and settings.
 * Maps to C_AcctSchema table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AcctSchema")
public class AccountSchema extends BaseEntity {

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("C_AcctSchema_UU")
    private String cAcctSchemaUu;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("IsAccrual")
    private String isAccrual;

    @Column("CostingMethod")
    private String costingMethod;

    @Column("CostingLevel")
    private String costingLevel;

    @Column("GAAP_ID")
    private Integer gaapId;

    @Column("CommitmentType")
    private String commitmentType;

    @Column("TaxCorrectionType")
    private String taxCorrectionType;

    @Column("Period_OpenHistory")
    private Integer periodOpenHistory;

    @Column("Period_OpenFuture")
    private Integer periodOpenFuture;
}
