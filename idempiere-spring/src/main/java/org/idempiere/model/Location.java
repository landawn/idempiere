package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Address/Location entity.
 * Maps to C_Location table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Location")
public class Location extends BaseEntity {

    @Id
    @Column("C_Location_ID")
    private Integer cLocationId;

    @Column("Address1")
    private String address1;

    @Column("Address2")
    private String address2;

    @Column("Address3")
    private String address3;

    @Column("Address4")
    private String address4;

    @Column("Address5")
    private String address5;

    @Column("City")
    private String city;

    @Column("C_City_ID")
    private Integer cCityId;

    @Column("Postal")
    private String postal;

    @Column("Postal_Add")
    private String postalAdd;

    @Column("C_Region_ID")
    private Integer cRegionId;

    @Column("RegionName")
    private String regionName;

    @Column("C_Country_ID")
    private Integer cCountryId;

    @Column("Comments")
    private String comments;
}
