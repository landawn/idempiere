package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Package MPS Detail entity - M_PackageMPSDetail table.
 * Multi-Package Shipment detail.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_PackageMPSDetail")
public class PackageMPSDetail extends BaseEntity {

    @Id
    @Column("M_PackageMPSDetail_ID")
    private Integer mPackageMPSDetailId;

    @Column("M_PackageMPS_ID")
    private Integer mPackageMPSId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("Description")
    private String description;

    @Column("SeqNo")
    private Integer seqNo;
}
