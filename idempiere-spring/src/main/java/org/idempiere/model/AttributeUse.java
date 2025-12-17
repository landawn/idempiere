package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Attribute Use entity - M_AttributeUse table.
 * Attribute use in attribute set.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_AttributeUse")
public class AttributeUse extends BaseEntity {

    @Id
    @Column("M_Attribute_ID")
    private Integer mAttributeId;

    @Id
    @Column("M_AttributeSet_ID")
    private Integer mAttributeSetId;

    @Column("SeqNo")
    private Integer seqNo;
}
