package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Authorization Provider entity - AD_AuthorizationProvider table.
 * OAuth authorization provider configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_AuthorizationProvider")
public class ADAuthorizationProvider extends BaseEntity {

    @Id
    @Column("AD_AuthorizationProvider_ID")
    private Integer adAuthorizationProviderId;

    @Column("AD_AuthorizationType")
    private String adAuthorizationType;

    @Column("AuthorizationEndpoint")
    private String authorizationEndpoint;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Name")
    private String name;

    @Column("RevokeEndpoint")
    private String revokeEndpoint;

    @Column("TokenEndpoint")
    private String tokenEndpoint;
}
