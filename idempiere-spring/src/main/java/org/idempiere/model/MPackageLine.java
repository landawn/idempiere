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
 * Package Line entity - M_PackageLine table.
 * Shipment package line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_PackageLine")
public class MPackageLine extends BaseEntity {

    @Id
    @Column("M_PackageLine_ID")
    private Integer mPackageLineId;

    @Column("Description")
    private String description;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("M_Package_ID")
    private Integer mPackageId;

    @Column("Qty")
    private BigDecimal qty;
}
