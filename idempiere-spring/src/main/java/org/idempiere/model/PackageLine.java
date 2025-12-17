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
 * Package Line entity.
 * Maps to M_PackageLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_PackageLine")
public class PackageLine extends BaseEntity {

    @Id
    @Column("M_PackageLine_ID")
    private Integer mPackageLineId;

    @Column("M_Package_ID")
    private Integer mPackageId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("Qty")
    private BigDecimal qty;

    @Column("Description")
    private String description;
}
