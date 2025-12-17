package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Contract Line entity.
 * Maps to C_ContractLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ContractLine")
public class ContractLine extends BaseEntity {

    @Id
    @Column("C_ContractLine_ID")
    private Integer cContractLineId;

    @Column("C_Contract_ID")
    private Integer cContractId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("Qty")
    private BigDecimal qty;

    @Column("PriceEntered")
    private BigDecimal priceEntered;

    @Column("PriceActual")
    private BigDecimal priceActual;

    @Column("LineNetAmt")
    private BigDecimal lineNetAmt;

    @Column("DateStart")
    private LocalDateTime dateStart;

    @Column("DateEnd")
    private LocalDateTime dateEnd;

    @Column("Processed")
    private String processed;

    @Column("C_Tax_ID")
    private Integer cTaxId;
}
