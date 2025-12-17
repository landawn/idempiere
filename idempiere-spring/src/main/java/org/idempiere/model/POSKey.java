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
 * POS Key entity.
 * Maps to C_POSKey table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_POSKey")
public class POSKey extends BaseEntity {

    @Id
    @Column("C_POSKey_ID")
    private Integer cPosKeyId;

    @Column("C_POSKeyLayout_ID")
    private Integer cPosKeyLayoutId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Qty")
    private BigDecimal qty;

    @Column("AD_PrintColor_ID")
    private Integer adPrintColorId;

    @Column("AD_PrintFont_ID")
    private Integer adPrintFontId;

    @Column("SpanX")
    private Integer spanX;

    @Column("SpanY")
    private Integer spanY;

    @Column("SubKeyLayout_ID")
    private Integer subKeyLayoutId;

    @Column("Text")
    private String text;

    @Column("AD_Image_ID")
    private Integer adImageId;
}
