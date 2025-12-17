package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * User Defined Window entity.
 * Maps to AD_UserDef_Win table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_UserDef_Win")
public class UserDefWin extends BaseEntity {

    @Id
    @Column("AD_UserDef_Win_ID")
    private Integer adUserDefWinId;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsReadWrite")
    private String isReadWrite;

    @Column("IsUserUpdateable")
    private String isUserUpdateable;
}
