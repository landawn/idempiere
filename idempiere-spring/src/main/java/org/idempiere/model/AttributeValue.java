package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product Attribute Value entity.
 * Maps to M_AttributeValue table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_AttributeValue")
public class AttributeValue extends BaseEntity {

    @Id
    @Column("M_AttributeValue_ID")
    private Integer mAttributeValueId;

    @Column("M_Attribute_ID")
    private Integer mAttributeId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
