package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Country Translation entity - C_Country_Trl table.
 * Country translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Country_Trl")
public class CountryTrl extends BaseEntity {

    @Id
    @Column("C_Country_ID")
    private Integer cCountryId;

    @Id
    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("RegionName")
    private String regionName;

    @Column("IsTranslated")
    private String isTranslated;
}
