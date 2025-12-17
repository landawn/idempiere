package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * OAuth2 Client Token entity - AD_OAuth2_ClientToken table.
 * OAuth2 client token.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_OAuth2_ClientToken")
public class OAuth2ClientToken extends BaseEntity {

    @Id
    @Column("AD_OAuth2_ClientToken_ID")
    private Integer adOAuth2ClientTokenId;

    @Column("AD_OAuth2_Client_ID")
    private Integer adOAuth2ClientId;

    @Column("Token")
    private String token;

    @Column("RefreshToken")
    private String refreshToken;

    @Column("TokenType")
    private String tokenType;

    @Column("ExpireTime")
    private LocalDateTime expireTime;

    @Column("RefreshExpireTime")
    private LocalDateTime refreshExpireTime;

    @Column("Scope")
    private String scope;

    @Column("AD_User_ID")
    private Integer adUserId;
}
