package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * User Defined Info entity - AD_UserDef_Info table.
 * User-defined info window customization.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_UserDef_Info")
public class UserDefInfo extends BaseEntity {

    @Id
    @Column("AD_UserDef_Info_ID")
    private Integer adUserDefInfoId;

    @Column("AD_InfoWindow_ID")
    private Integer adInfoWindowId;

    @Column("AD_Language")
    private String adLanguage;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
