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
 * Partner Group entity - C_BP_Group table.
 * Business partner group.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BP_Group")
public class PartnerGroup extends BaseEntity {

    @Id
    @Column("C_BP_Group_ID")
    private Integer cBpGroupId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsConfidentialInfo")
    private String isConfidentialInfo;

    @Column("PriorityBase")
    private String priorityBase;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("PO_PriceList_ID")
    private Integer poPriceListId;

    @Column("M_DiscountSchema_ID")
    private Integer mDiscountSchemaId;

    @Column("PO_DiscountSchema_ID")
    private Integer poDiscountSchemaId;

    @Column("CreditWatchPercent")
    private BigDecimal creditWatchPercent;
}
