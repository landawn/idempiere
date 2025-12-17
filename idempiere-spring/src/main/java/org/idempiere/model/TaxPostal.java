package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tax Postal entity - C_TaxPostal table.
 * Tax postal code range definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_TaxPostal")
public class TaxPostal extends BaseEntity {

    @Id
    @Column("C_TaxPostal_ID")
    private Integer cTaxPostalId;

    @Column("C_Tax_ID")
    private Integer cTaxId;

    @Column("Postal")
    private String postal;

    @Column("Postal_To")
    private String postalTo;
}
