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
 * Broadcast Message entity - AD_BroadcastMessage table.
 * Broadcast message for users.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_BroadcastMessage")
public class BroadcastMessage extends BaseEntity {

    @Id
    @Column("AD_BroadcastMessage_ID")
    private Integer adBroadcastMessageId;

    @Column("BroadcastType")
    private String broadcastType;

    @Column("BroadcastFrequency")
    private String broadcastFrequency;

    @Column("Target")
    private String target;

    @Column("BroadcastMessage")
    private String broadcastMessage;

    @Column("Notification")
    private String notification;

    @Column("Expired")
    private String expired;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("ValidTo")
    private LocalDateTime validTo;
}
