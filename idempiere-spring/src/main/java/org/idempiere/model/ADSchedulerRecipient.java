package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Scheduler Recipient entity - AD_SchedulerRecipient table.
 * Scheduler Recipient.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_SchedulerRecipient")
public class ADSchedulerRecipient extends BaseEntity {

    @Id
    @Column("AD_SchedulerRecipient_ID")
    private Integer adSchedulerRecipientId;

    @Column("AD_Scheduler_ID")
    private Integer adSchedulerId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Role_ID")
    private Integer adRoleId;
}
