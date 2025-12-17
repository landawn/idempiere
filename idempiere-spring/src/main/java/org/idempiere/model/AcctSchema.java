package org.idempiere.model;

import java.math.BigDecimal;

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
public class AcctSchema extends BaseEntity {

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("GAAP")
    private String gaap;

    @Column("IsAccrual")
    private String isAccrual;

    @Column("CostingMethod")
    private String costingMethod;

    @Column("CostingLevel")
    private String costingLevel;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("M_CostType_ID")
    private Integer mCostTypeId;

    @Column("HasAlias")
    private String hasAlias;

    @Column("HasCombination")
    private String hasCombination;

    @Column("IsTradeDiscountPosted")
    private String isTradeDiscountPosted;

    @Column("IsPostServices")
    private String isPostServices;

    @Column("IsExplicitCostAdjustment")
    private String isExplicitCostAdjustment;

    @Column("CommitmentType")
    private String commitmentType;

    @Column("TaxCorrectionType")
    private String taxCorrectionType;

    @Column("AutoPeriodControl")
    private String autoPeriodControl;

    @Column("Period_OpenHistory")
    private Integer periodOpenHistory;

    @Column("Period_OpenFuture")
    private Integer periodOpenFuture;

    @Column("Separator")
    private String separator;
}
