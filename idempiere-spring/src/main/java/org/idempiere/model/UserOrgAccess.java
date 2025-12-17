package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * User Organization Access entity - AD_User_OrgAccess table.
 * User access to organizations.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_User_OrgAccess")
public class UserOrgAccess extends BaseEntity {

    @Id
    @Column("AD_User_OrgAccess_ID")
    private Integer adUserOrgAccessId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Org_ID")
    private Integer adOrgId;

    @Column("IsReadOnly")
    private String isReadOnly;
}
