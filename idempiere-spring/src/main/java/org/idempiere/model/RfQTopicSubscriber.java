package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Request for Quotation Topic Subscriber entity.
 * Maps to C_RfQ_TopicSubscriber table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_RfQ_TopicSubscriber")
public class RfQTopicSubscriber extends BaseEntity {

    @Id
    @Column("C_RfQ_TopicSubscriber_ID")
    private Integer cRfQTopicSubscriberId;

    @Column("C_RfQ_Topic_ID")
    private Integer cRfQTopicId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("OptOutDate")
    private LocalDateTime optOutDate;

    @Column("SubscribeDate")
    private LocalDateTime subscribeDate;
}
