package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Asset Info Tax entity - A_Asset_Info_Tax table.
 * Tax information for assets.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Info_Tax")
public class AssetInfoTax extends BaseEntity {

    @Id
    @Column("A_Asset_Info_Tax_ID")
    private Integer aAssetInfoTaxId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("A_Finance_Meth")
    private String aFinanceMeth;

    @Column("A_Investment_CR")
    private Integer aInvestmentCr;

    @Column("A_New_Used")
    private String aNewUsed;

    @Column("A_State")
    private String aState;

    @Column("A_Tax_Entity")
    private String aTaxEntity;

    @Column("TextMsg")
    private String textMsg;
}
