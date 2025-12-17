package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Price List Version entity.
 * Maps to M_PriceList_Version table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_PriceList_Version")
public class PriceListVersion extends BaseEntity {

    @Id
    @Column("M_PriceList_Version_ID")
    private Integer mPriceListVersionId;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("M_DiscountSchema_ID")
    private Integer mDiscountSchemaId;

    @Column("M_Pricelist_Version_Base_ID")
    private Integer mPricelistVersionBaseId;
}
