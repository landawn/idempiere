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
 * Subscription entity - C_Subscription table.
 * Recurring product subscription.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Subscription")
public class CSubscription extends BaseEntity {

    @Id
    @Column("C_Subscription_ID")
    private Integer cSubscriptionId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_SubscriptionType_ID")
    private Integer cSubscriptionTypeId;

    @Column("IsDue")
    private String isDue;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Name")
    private String name;

    @Column("PaidUntilDate")
    private LocalDateTime paidUntilDate;

    @Column("RenewalDate")
    private LocalDateTime renewalDate;

    @Column("StartDate")
    private LocalDateTime startDate;
}
