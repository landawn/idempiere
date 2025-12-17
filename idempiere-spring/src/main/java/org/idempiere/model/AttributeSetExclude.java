package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Attribute Set Exclude entity - M_AttributeSetExclude table.
 * Attribute set exclude from table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_AttributeSetExclude")
public class AttributeSetExclude extends BaseEntity {

    @Id
    @Column("M_AttributeSetExclude_ID")
    private Integer mAttributeSetExcludeId;

    @Column("M_AttributeSet_ID")
    private Integer mAttributeSetId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("IsSOTrx")
    private String isSOTrx;
}
