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
 * UOM Conversion entity.
 * Maps to C_UOM_Conversion table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_UOM_Conversion")
public class UOMConversion extends BaseEntity {

    @Id
    @Column("C_UOM_Conversion_ID")
    private Integer cUomConversionId;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("C_UOM_To_ID")
    private Integer cUomToId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("MultiplyRate")
    private BigDecimal multiplyRate;

    @Column("DivideRate")
    private BigDecimal divideRate;
}
