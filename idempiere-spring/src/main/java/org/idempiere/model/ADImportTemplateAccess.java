package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Import Template Access entity - AD_ImportTemplateAccess table.
 * Role access to import templates.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ImportTemplateAccess")
public class ADImportTemplateAccess extends BaseEntity {

    @Id
    @Column("AD_ImportTemplateAccess_ID")
    private Integer adImportTemplateAccessId;

    @Column("AD_ImportTemplate_ID")
    private Integer adImportTemplateId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("IsReadWrite")
    private String isReadWrite;
}
