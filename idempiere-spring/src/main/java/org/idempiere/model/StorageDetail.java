package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Storage Detail entity - M_StorageDetail table.
 * Storage detail record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_StorageDetail")
public class StorageDetail extends BaseEntity {

    @Id
    @Column("M_StorageDetail_ID")
    private Integer mStorageDetailId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("QtyType")
    private String qtyType;

    @Column("DateMaterialPolicy")
    private LocalDateTime dateMaterialPolicy;

    @Column("Qty")
    private BigDecimal qty;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("IsSOTrx")
    private String isSOTrx;
}
