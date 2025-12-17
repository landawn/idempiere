package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * BP Product entity - C_BPartner_Product table.
 * Business partner product association.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BPartner_Product")
public class BPProduct extends BaseEntity {

    @Id
    @Column("C_BPartner_Product_ID")
    private Integer cBPartnerProductId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Description")
    private String description;

    @Column("ShelfLifeMinPct")
    private Integer shelfLifeMinPct;

    @Column("ShelfLifeMinDays")
    private Integer shelfLifeMinDays;

    @Column("Quality")
    private java.math.BigDecimal quality;
}
