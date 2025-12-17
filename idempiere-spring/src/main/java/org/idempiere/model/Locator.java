package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Locator entity - warehouse storage locations.
 * Maps to M_Locator table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Locator")
public class Locator extends BaseEntity {

    @Id
    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("Value")
    private String value;

    @Column("X")
    private String x;

    @Column("Y")
    private String y;

    @Column("Z")
    private String z;

    @Column("IsDefault")
    private String isDefault;

    @Column("PriorityNo")
    private Integer priorityNo;

    @Column("M_LocatorType_ID")
    private Integer mLocatorTypeId;
}
