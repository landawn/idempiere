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
 * Charge entity - additional charges (freight, handling, etc.).
 * Maps to C_Charge table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Charge")
public class Charge extends BaseEntity {

    @Id
    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("ChargeAmt")
    private BigDecimal chargeAmt;

    @Column("IsSameCurrency")
    private String isSameCurrency;

    @Column("IsSameTax")
    private String isSameTax;

    @Column("IsTaxIncluded")
    private String isTaxIncluded;

    @Column("C_TaxCategory_ID")
    private Integer cTaxCategoryId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_ChargeType_ID")
    private Integer cChargeTypeId;
}
