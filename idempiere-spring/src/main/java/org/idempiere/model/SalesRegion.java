package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Sales Region entity.
 * Maps to C_SalesRegion table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_SalesRegion")
public class SalesRegion extends BaseEntity {

    @Id
    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsSummary")
    private String isSummary;

    @Column("IsDefault")
    private String isDefault;

    @Column("SalesRep_ID")
    private Integer salesRepId;
}
