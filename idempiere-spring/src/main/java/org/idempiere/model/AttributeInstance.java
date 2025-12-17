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
 * Attribute Instance entity - M_AttributeInstance table.
 * Product attribute instance value.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_AttributeInstance")
public class AttributeInstance extends BaseEntity {

    @Id
    @Column("M_AttributeInstance_ID")
    private Integer mAttributeInstanceId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_Attribute_ID")
    private Integer mAttributeId;

    @Column("M_AttributeValue_ID")
    private Integer mAttributeValueId;

    @Column("Value")
    private String value;

    @Column("ValueNumber")
    private BigDecimal valueNumber;
}
