package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Quality Management Specification Line entity.
 * Maps to QM_SpecificationLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("QM_SpecificationLine")
public class QMSpecificationLine extends BaseEntity {

    @Id
    @Column("QM_SpecificationLine_ID")
    private Integer qmSpecificationLineId;

    @Column("QM_Specification_ID")
    private Integer qmSpecificationId;

    @Column("M_Attribute_ID")
    private Integer mAttributeId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("Operation")
    private String operation;

    @Column("QtyPercent")
    private BigDecimal qtyPercent;

    @Column("ValidFrom")
    private java.time.LocalDateTime validFrom;

    @Column("ValidTo")
    private java.time.LocalDateTime validTo;

    @Column("AndOr")
    private String andOr;
}
