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
 * Package MPS entity - M_PackageMPS table.
 * Multi-piece shipment package.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_PackageMPS")
public class PackageMPS extends BaseEntity {

    @Id
    @Column("M_PackageMPS_ID")
    private Integer mPackageMpsId;

    @Column("M_Package_ID")
    private Integer mPackageId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("Weight")
    private BigDecimal weight;

    @Column("Length")
    private BigDecimal length;

    @Column("Width")
    private BigDecimal width;

    @Column("Height")
    private BigDecimal height;

    @Column("TrackingNo")
    private String trackingNo;

    @Column("LabelData")
    private byte[] labelData;
}
