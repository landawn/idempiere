package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Organization Type entity - AD_OrgType table.
 * Organization type definitions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_OrgType")
public class OrgType extends BaseEntity {

    @Id
    @Column("AD_OrgType_ID")
    private Integer adOrgTypeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_PrintColor_ID")
    private Integer adPrintColorId;
}
