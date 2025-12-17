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
 * Service Contract Line entity - C_ContractLine table.
 * Service contract line items.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ContractLine")
public class ServiceContractLine extends BaseEntity {

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

    @Column("Qty")
    private BigDecimal qty;

    @Column("PriceEntered")
    private BigDecimal priceEntered;

    @Column("LineNetAmt")
    private BigDecimal lineNetAmt;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("Processed")
    private String processed;
}
