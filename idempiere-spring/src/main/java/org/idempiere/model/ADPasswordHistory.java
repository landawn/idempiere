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
 * Password History entity - AD_Password_History table.
 * User password history.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Password_History")
public class ADPasswordHistory extends BaseEntity {

    @Id
    @Column("AD_Password_History_ID")
    private Integer adPasswordHistoryId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("DatePasswordChanged")
    private LocalDateTime datePasswordChanged;

    @Column("Password")
    private String password;

    @Column("Salt")
    private String salt;
}
