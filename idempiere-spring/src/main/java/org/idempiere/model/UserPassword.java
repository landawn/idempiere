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
 * User Password entity - AD_User_Password table.
 * User password history.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_User_Password")
public class UserPassword extends BaseEntity {

    @Id
    @Column("AD_User_Password_ID")
    private Integer adUserPasswordId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Password")
    private String password;

    @Column("Salt")
    private String salt;

    @Column("DatePasswordChanged")
    private LocalDateTime datePasswordChanged;
}
