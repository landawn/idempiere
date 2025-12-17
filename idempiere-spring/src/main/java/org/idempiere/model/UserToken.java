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
 * User Token entity - AD_UserToken table.
 * User authentication tokens.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_UserToken")
public class UserToken extends BaseEntity {

    @Id
    @Column("AD_UserToken_ID")
    private Integer adUserTokenId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Client_ID")
    private Integer adClientId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("Token")
    private String token;

    @Column("TokenType")
    private String tokenType;

    @Column("ExpireDate")
    private LocalDateTime expireDate;

    @Column("IsExpired")
    private String isExpired;

    @Column("Description")
    private String description;
}
