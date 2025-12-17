package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tax Translation entity - C_Tax_Trl table.
 * Tax translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Tax_Trl")
public class TaxTrl extends BaseEntity {

    @Id
    @Column("C_Tax_ID")
    private Integer cTaxId;

    @Id
    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("TaxIndicator")
    private String taxIndicator;

    @Column("IsTranslated")
    private String isTranslated;
}
