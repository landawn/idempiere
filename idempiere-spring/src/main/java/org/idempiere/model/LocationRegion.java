package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Region entity - C_Region table.
 * Country region/state definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Region")
public class LocationRegion extends BaseEntity {

    @Id
    @Column("C_Region_ID")
    private Integer cRegionId;

    @Column("C_Country_ID")
    private Integer cCountryId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsDefault")
    private String isDefault;
}
