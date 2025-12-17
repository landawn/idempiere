package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * User Defined Process entity - AD_UserDef_Proc table.
 * User-defined process customization.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_UserDef_Proc")
public class UserDefProc extends BaseEntity {

    @Id
    @Column("AD_UserDef_Proc_ID")
    private Integer adUserDefProcId;

    @Column("AD_Process_ID")
    private Integer adProcessId;

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

    @Column("Help")
    private String help;
}
