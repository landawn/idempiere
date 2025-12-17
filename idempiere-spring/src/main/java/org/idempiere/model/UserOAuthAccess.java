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
 * User OAuth Access entity - AD_UserOAuthAccess table.
 * User OAuth access configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_UserOAuthAccess")
public class UserOAuthAccess extends BaseEntity {

    @Id
    @Column("AD_UserOAuthAccess_ID")
    private Integer adUserOAuthAccessId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_OAuth2_Client_ID")
    private Integer adOAuth2ClientId;

    @Column("AccessToken")
    private String accessToken;

    @Column("RefreshToken")
    private String refreshToken;

    @Column("ExpireDate")
    private LocalDateTime expireDate;

    @Column("Scope")
    private String scope;
}
