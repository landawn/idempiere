package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tax BP Group entity - C_TaxBPGroup table.
 * Tax business partner group.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_TaxBPGroup")
public class TaxBPGroup extends BaseEntity {

    @Id
    @Column("C_TaxBPGroup_ID")
    private Integer cTaxBPGroupId;

    @Column("C_TaxGroup_ID")
    private Integer cTaxGroupId;

    @Column("C_BP_Group_ID")
    private Integer cBpGroupId;

    @Column("IsExempt")
    private String isExempt;
}
