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
 * User Mail entity - AD_UserMail table.
 * User mail sent record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_UserMail")
public class UserMail extends BaseEntity {

    @Id
    @Column("AD_UserMail_ID")
    private Integer adUserMailId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("R_MailText_ID")
    private Integer rMailTextId;

    @Column("W_MailMsg_ID")
    private Integer wMailMsgId;

    @Column("MailTo")
    private String mailTo;

    @Column("MailCc")
    private String mailCc;

    @Column("MailBcc")
    private String mailBcc;

    @Column("Subject")
    private String subject;

    @Column("MessageID")
    private String messageId;

    @Column("DeliveryConfirmation")
    private String deliveryConfirmation;

    @Column("IsDelivered")
    private String isDelivered;

    @Column("DateDelivered")
    private LocalDateTime dateDelivered;
}
