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
 * Subscription Delivery entity - C_Subscription_Delivery table.
 * Subscription delivery record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Subscription_Delivery")
public class SubscriptionDelivery extends BaseEntity {

    @Id
    @Column("C_Subscription_Delivery_ID")
    private Integer cSubscriptionDeliveryId;

    @Column("C_Subscription_ID")
    private Integer cSubscriptionId;

    @Column("M_InOut_ID")
    private Integer mInOutId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("DeliveryDate")
    private LocalDateTime deliveryDate;

    @Column("Processed")
    private String processed;
}
