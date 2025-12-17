package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Client OAuth entity - AD_ClientOAuth table.
 * Client OAuth configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ClientOAuth")
public class ClientOAuth extends BaseEntity {

    @Id
    @Column("AD_ClientOAuth_ID")
    private Integer adClientOAuthId;

    @Column("AD_Client_ID")
    private Integer adClientId;

    @Column("AD_OAuth2_Client_ID")
    private Integer adOAuth2ClientId;

    @Column("IsDefault")
    private String isDefault;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Role_ID")
    private Integer adRoleId;
}
