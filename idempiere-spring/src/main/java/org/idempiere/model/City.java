package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * City entity.
 * Maps to C_City table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_City")
public class City extends BaseEntity {

    @Id
    @Column("C_City_ID")
    private Integer cCityId;

    @Column("C_Country_ID")
    private Integer cCountryId;

    @Column("C_Region_ID")
    private Integer cRegionId;

    @Column("Name")
    private String name;

    @Column("Postal")
    private String postal;

    @Column("AreaCode")
    private String areaCode;

    @Column("Locode")
    private String locode;

    @Column("Coordinates")
    private String coordinates;
}
