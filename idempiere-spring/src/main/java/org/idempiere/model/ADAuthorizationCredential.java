package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Authorization Credential entity - AD_AuthorizationCredential table.
 * OAuth authorization credential configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_AuthorizationCredential")
public class ADAuthorizationCredential extends BaseEntity {

    @Id
    @Column("AD_AuthorizationCredential_ID")
    private Integer adAuthorizationCredentialId;

    @Column("AD_AuthorizationProvider_ID")
    private Integer adAuthorizationProviderId;

    @Column("AD_AuthorizationScopeList")
    private String adAuthorizationScopeList;

    @Column("AuthorizationClientId")
    private String authorizationClientId;

    @Column("AuthorizationClientSecret")
    private String authorizationClientSecret;

    @Column("AuthorizationRedirectURL")
    private String authorizationRedirectUrl;

    @Column("Help")
    private String help;

    @Column("Name")
    private String name;
}
