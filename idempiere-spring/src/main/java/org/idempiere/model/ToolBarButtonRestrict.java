package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Toolbar Button Restriction entity.
 * Maps to AD_ToolBarButtonRestrict table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ToolBarButtonRestrict")
public class ToolBarButtonRestrict extends BaseEntity {

    @Id
    @Column("AD_ToolBarButtonRestrict_ID")
    private Integer adToolBarButtonRestrictId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("AD_ToolBarButton_ID")
    private Integer adToolBarButtonId;

    @Column("IsExclude")
    private String isExclude;
}
