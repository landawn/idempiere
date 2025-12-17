package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Authorization Account entity - AD_AuthorizationAccount table.
 * OAuth authorization account.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_AuthorizationAccount")
public class ADAuthorizationAccount extends BaseEntity {

    @Id
    @Column("AD_AuthorizationAccount_ID")
    private Integer adAuthorizationAccountId;

    @Column("AD_AuthorizationCredential_ID")
    private Integer adAuthorizationCredentialId;

    @Column("AD_AuthorizationScopes")
    private String adAuthorizationScopes;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AccessToken")
    private String accessToken;

    @Column("AccessTokenTimestamp")
    private LocalDateTime accessTokenTimestamp;

    @Column("EMail")
    private String email;

    @Column("ExpireInSeconds")
    private BigDecimal expireInSeconds;

    @Column("Help")
    private String help;

    @Column("IsAccessRevoked")
    private String isAccessRevoked;

    @Column("IsAuthorized")
    private String isAuthorized;

    @Column("Preferred_UserName")
    private String preferredUserName;

    @Column("RefreshToken")
    private String refreshToken;
}
