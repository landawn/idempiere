package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product Attribute entity.
 * Maps to M_Attribute table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Attribute")
public class Attribute extends BaseEntity {

    @Id
    @Column("M_Attribute_ID")
    private Integer mAttributeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AttributeValueType")
    private String attributeValueType;

    @Column("IsInstanceAttribute")
    private String isInstanceAttribute;

    @Column("IsMandatory")
    private String isMandatory;

    @Column("M_AttributeSearch_ID")
    private Integer mAttributeSearchId;
}
