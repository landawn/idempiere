package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tax Category Translation entity - C_TaxCategory_Trl table.
 * Tax category translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_TaxCategory_Trl")
public class TaxCategoryTrl extends BaseEntity {

    @Id
    @Column("C_TaxCategory_ID")
    private Integer cTaxCategoryId;

    @Id
    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsTranslated")
    private String isTranslated;
}
