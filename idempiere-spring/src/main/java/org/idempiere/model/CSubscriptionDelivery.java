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
 * Subscription Delivery entity - C_SubscriptionDelivery table.
 * Delivery record for subscription.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_SubscriptionDelivery")
public class CSubscriptionDelivery extends BaseEntity {

    @Id
    @Column("C_SubscriptionDelivery_ID")
    private Integer cSubscriptionDeliveryId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("C_Subscription_ID")
    private Integer cSubscriptionId;

    @Column("DeliveryDate")
    private LocalDateTime deliveryDate;
}
