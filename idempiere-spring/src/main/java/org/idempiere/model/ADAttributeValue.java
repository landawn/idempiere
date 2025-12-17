package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Attribute Value entity - AD_Attribute_Value table.
 * System attribute value.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Attribute_Value")
public class ADAttributeValue extends BaseEntity {

    @Id
    @Column("AD_Attribute_ID")
    private Integer adAttributeId;

    @Id
    @Column("Record_ID")
    private Integer recordId;

    @Column("V_Date")
    private java.time.LocalDateTime vDate;

    @Column("V_Number")
    private java.math.BigDecimal vNumber;

    @Column("V_String")
    private String vString;
}
