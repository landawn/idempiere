package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Locator Type entity - M_LocatorType table.
 * Warehouse locator type.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_LocatorType")
public class LocatorType extends BaseEntity {

    @Id
    @Column("M_LocatorType_ID")
    private Integer mLocatorTypeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsAvailable")
    private String isAvailable;
}
