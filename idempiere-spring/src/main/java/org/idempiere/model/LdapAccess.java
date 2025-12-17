package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * LDAP Access entity - AD_LdapAccess table.
 * LDAP access log records.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_LdapAccess")
public class LdapAccess extends BaseEntity {

    @Id
    @Column("AD_LdapAccess_ID")
    private Integer adLdapAccessId;

    @Column("AD_LdapProcessor_ID")
    private Integer adLdapProcessorId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("R_InterestArea_ID")
    private Integer rInterestAreaId;

    @Column("Summary")
    private String summary;

    @Column("Description")
    private String description;

    @Column("IsError")
    private String isError;

    @Column("Reference")
    private String reference;

    @Column("TextMsg")
    private String textMsg;
}
