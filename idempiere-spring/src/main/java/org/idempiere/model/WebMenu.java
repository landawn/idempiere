package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Menu entity - W_MailMsg table.
 * Web store email message template.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_MailMsg")
public class WebMenu extends BaseEntity {

    @Id
    @Column("W_MailMsg_ID")
    private Integer wMailMsgId;

    @Column("W_Store_ID")
    private Integer wStoreId;

    @Column("MailMsgType")
    private String mailMsgType;

    @Column("Subject")
    private String subject;

    @Column("Message")
    private String message;

    @Column("Message2")
    private String message2;

    @Column("Message3")
    private String message3;
}
