package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Promotion Group entity.
 * Maps to M_Promotion_Group table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Promotion_Group")
public class PromotionGroup extends BaseEntity {

    @Id
    @Column("M_Promotion_Group_ID")
    private Integer mPromotionGroupId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
