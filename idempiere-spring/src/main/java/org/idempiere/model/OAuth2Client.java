package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * OAuth2 Client entity - AD_OAuth2_Client table.
 * OAuth2 client configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_OAuth2_Client")
public class OAuth2Client extends BaseEntity {

    @Id
    @Column("AD_OAuth2_Client_ID")
    private Integer adOAuth2ClientId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("OAuth2_ClientId")
    private String oauth2ClientId;

    @Column("OAuth2_ClientSecret")
    private String oauth2ClientSecret;

    @Column("OAuth2_ClientToken")
    private String oauth2ClientToken;

    @Column("OAuth2_RedirectUri")
    private String oauth2RedirectUri;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("IsConfidential")
    private String isConfidential;
}
