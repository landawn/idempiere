package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Postal Code entity - U_Postal table.
 * User-defined postal code table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("U_Postal")
public class UPostal extends BaseEntity {

    @Id
    @Column("U_Postal_ID")
    private Integer uPostalId;

    @Column("C_Country_ID")
    private Integer cCountryId;

    @Column("C_Region_ID")
    private Integer cRegionId;

    @Column("City")
    private String city;

    @Column("Postal")
    private String postal;

    @Column("RegionName")
    private String regionName;
}
