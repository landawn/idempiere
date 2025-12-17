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
 * BOM Line Temporary entity - T_BOMLine table.
 * Temporary table for BOM line explosion.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_BOMLine")
public class TBOMLine extends BaseEntity {

    @Id
    @Column("T_BOMLine_ID")
    private Integer tBomLineId;

    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Cost")
    private BigDecimal cost;

    @Column("CostStd")
    private BigDecimal costStd;

    @Column("Levels")
    private Integer levels;

    @Column("LevelNo")
    private Integer levelNo;

    @Column("M_CostElement_ID")
    private Integer mCostElementId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("PP_Product_BOM_ID")
    private Integer ppProductBomId;

    @Column("PP_Product_BOMLine_ID")
    private Integer ppProductBomLineId;

    @Column("Qty")
    private BigDecimal qty;

    @Column("QtyBOM")
    private BigDecimal qtyBOM;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("Sel_Product_ID")
    private Integer selProductId;
}
