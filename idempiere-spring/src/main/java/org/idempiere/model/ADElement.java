package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * System Element entity - data dictionary element.
 * Maps to AD_Element table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Element")
public class ADElement extends BaseEntity {

    @Id
    @Column("AD_Element_ID")
    private Integer adElementId;

    @Column("ColumnName")
    private String columnName;

    @Column("Name")
    private String name;

    @Column("PrintName")
    private String printName;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("PO_Name")
    private String poName;

    @Column("PO_PrintName")
    private String poPrintName;

    @Column("PO_Description")
    private String poDescription;

    @Column("PO_Help")
    private String poHelp;

    @Column("EntityType")
    private String entityType;

    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("AD_Reference_Value_ID")
    private Integer adReferenceValueId;

    @Column("FieldLength")
    private Integer fieldLength;

    @Column("Placeholder")
    private String placeholder;
}
