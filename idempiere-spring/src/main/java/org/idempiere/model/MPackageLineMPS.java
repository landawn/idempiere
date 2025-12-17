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
 * Package Line MPS entity - M_PackageLineMPS table.
 * Package line for multi-package shipment.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_PackageLineMPS")
public class MPackageLineMPS extends BaseEntity {

    @Id
    @Column("M_PackageLineMPS_ID")
    private Integer mPackageLineMpsId;

    @Column("M_PackageMPS_ID")
    private Integer mPackageMpsId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("Description")
    private String description;

    @Column("Qty")
    private BigDecimal qty;
}
