package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Attribute Set Instance entity - specific product instance attributes.
 * Maps to M_AttributeSetInstance table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_AttributeSetInstance")
public class AttributeSetInstance extends BaseEntity {

    @Id
    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_AttributeSet_ID")
    private Integer mAttributeSetId;

    @Column("SerNo")
    private String serNo;

    @Column("Lot")
    private String lot;

    @Column("M_Lot_ID")
    private Integer mLotId;

    @Column("GuaranteeDate")
    private LocalDateTime guaranteeDate;

    @Column("Description")
    private String description;
}
