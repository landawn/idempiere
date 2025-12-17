package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * POS Key entity - C_POSKey table.
 * Point of Sale function key.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_POSKey")
public class CPOSKey extends BaseEntity {

    @Id
    @Column("C_POSKey_ID")
    private Integer cPosKeyId;

    @Column("C_POSKeyLayout_ID")
    private Integer cPosKeyLayoutId;

    @Column("AD_PrintColor_ID")
    private Integer adPrintColorId;

    @Column("AD_PrintFont_ID")
    private Integer adPrintFontId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_ProductCategory_ID")
    private Integer mProductCategoryId;

    @Column("Name")
    private String name;

    @Column("Qty")
    private java.math.BigDecimal qty;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("SpanX")
    private Integer spanX;

    @Column("SpanY")
    private Integer spanY;

    @Column("SubKeyLayout_ID")
    private Integer subKeyLayoutId;

    @Column("Text")
    private String text;
}
