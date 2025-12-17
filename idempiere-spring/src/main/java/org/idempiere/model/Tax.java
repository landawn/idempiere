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
 * Tax entity - tax definitions.
 * Maps to C_Tax table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Tax")
public class Tax extends BaseEntity {

    @Id
    @Column("C_Tax_ID")
    private Integer cTaxId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("TaxIndicator")
    private String taxIndicator;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("C_TaxCategory_ID")
    private Integer cTaxCategoryId;

    @Column("IsDocumentLevel")
    private String isDocumentLevel;

    @Column("IsSummary")
    private String isSummary;

    @Column("IsSalesTax")
    private String isSalesTax;

    @Column("SOPOType")
    private String sopoType;

    @Column("Rate")
    private BigDecimal rate;

    @Column("Parent_Tax_ID")
    private Integer parentTaxId;

    @Column("C_Country_ID")
    private Integer cCountryId;

    @Column("C_Region_ID")
    private Integer cRegionId;

    @Column("To_Country_ID")
    private Integer toCountryId;

    @Column("To_Region_ID")
    private Integer toRegionId;

    @Column("RequiresTaxCertificate")
    private String requiresTaxCertificate;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsTaxExempt")
    private String isTaxExempt;

    @Column("C_TaxProvider_ID")
    private Integer cTaxProviderId;
}
