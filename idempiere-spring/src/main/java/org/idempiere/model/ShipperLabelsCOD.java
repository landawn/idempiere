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
 * Shipper Labels COD entity - M_ShipperLabelsCOD table.
 * Cash on delivery shipper label configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ShipperLabelsCOD")
public class ShipperLabelsCOD extends BaseEntity {

    @Id
    @Column("M_ShipperLabelsCOD_ID")
    private Integer mShipperLabelsCodId;

    @Column("M_ShipperLabels_ID")
    private Integer mShipperLabelsId;

    @Column("CODCollectionType")
    private String codCollectionType;

    @Column("CODAmt")
    private BigDecimal codAmt;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("IsCOD")
    private String isCOD;
}
