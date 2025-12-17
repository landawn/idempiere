package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Country Group Country entity - C_Country_Group_Country table.
 * Countries assigned to a country group.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Country_Group_Country")
public class CountryGroupCountry extends BaseEntity {

    @Id
    @Column("C_Country_Group_Country_ID")
    private Integer cCountryGroupCountryId;

    @Column("C_Country_Group_ID")
    private Integer cCountryGroupId;

    @Column("C_Country_ID")
    private Integer cCountryId;
}
