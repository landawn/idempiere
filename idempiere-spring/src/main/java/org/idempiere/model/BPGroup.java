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
 * Business Partner Group entity.
 * Maps to C_BP_Group table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BP_Group")
public class BPGroup extends BaseEntity {

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

    @Column("C_Dunning_ID")
    private Integer cDunningId;
}
