package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * User BP Access entity - AD_User_BPAccess table.
 * Business Partner access for users.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_User_BPAccess")
public class UserBPAccess extends BaseEntity {

    @Id
    @Column("AD_User_BPAccess_ID")
    private Integer adUserBPAccessId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("BPAccessType")
    private String bpAccessType;

    @Column("RequestConfirm")
    private String requestConfirm;

    @Column("R_RequestType_ID")
    private Integer rRequestTypeId;

    @Column("DocBaseType")
    private String docBaseType;
}
