package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Alert Recipient entity - AD_AlertRecipient table.
 * Alert Recipient.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_AlertRecipient")
public class ADAlertRecipient extends BaseEntity {

    @Id
    @Column("AD_AlertRecipient_ID")
    private Integer adAlertRecipientId;

    @Column("AD_Alert_ID")
    private Integer adAlertId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Role_ID")
    private Integer adRoleId;
}
