package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Warehouse Section Type entity - M_Warehouse_SectionType table.
 * Warehouse section type definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Warehouse_SectionType")
public class WarehouseSectionType extends BaseEntity {

    @Id
    @Column("M_Warehouse_SectionType_ID")
    private Integer mWarehouseSectionTypeId;

    @Column("M_Warehouse_Section_ID")
    private Integer mWarehouseSectionId;

    @Column("M_LocatorType_ID")
    private Integer mLocatorTypeId;
}
