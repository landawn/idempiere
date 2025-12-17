package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * Asset Retirement entity - A_Asset_Retirement table.
 * Asset retirement record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Retirement")
public class AssetRetirement extends BaseEntity {

    @Id
    @Column("A_Asset_Retirement_ID")
    private Integer aAssetRetirementId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("AssetMarketValueAmt")
    private BigDecimal assetMarketValueAmt;

    @Column("AssetValueAmt")
    private BigDecimal assetValueAmt;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;
}
