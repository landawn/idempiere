package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Recent Item entity - AD_RecentItem table.
 * Recent Item.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_RecentItem")
public class ADRecent extends BaseEntity {

    @Id
    @Column("AD_RecentItem_ID")
    private Integer adRecentItemId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("AD_InfoWindow_ID")
    private Integer adInfoWindowId;

    @Column("AD_Menu_ID")
    private Integer adMenuId;
}
