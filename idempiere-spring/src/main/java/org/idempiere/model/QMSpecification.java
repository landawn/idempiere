package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Quality Management Specification entity.
 * Maps to QM_Specification table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("QM_Specification")
public class QMSpecification extends BaseEntity {

    @Id
    @Column("QM_Specification_ID")
    private Integer qmSpecificationId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_AttributeSet_ID")
    private Integer mAttributeSetId;

    @Column("PP_Product_BOM_ID")
    private Integer ppProductBomId;

    @Column("ValidFrom")
    private java.time.LocalDateTime validFrom;

    @Column("ValidTo")
    private java.time.LocalDateTime validTo;
}
