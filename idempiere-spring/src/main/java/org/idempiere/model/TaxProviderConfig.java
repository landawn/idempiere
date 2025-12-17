package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tax Provider Config entity - C_TaxProviderCfg table.
 * Tax provider configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_TaxProviderCfg")
public class TaxProviderConfig extends BaseEntity {

    @Id
    @Column("C_TaxProviderCfg_ID")
    private Integer cTaxProviderCfgId;

    @Column("C_TaxProvider_ID")
    private Integer cTaxProviderId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("URL")
    private String url;

    @Column("Account")
    private String account;

    @Column("License")
    private String license;

    @Column("CompanyCode")
    private String companyCode;

    @Column("RequiresTaxCertificate")
    private String requiresTaxCertificate;
}
