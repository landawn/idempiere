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
 * Subscription entity.
 * Maps to C_Subscription table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Subscription")
public class Subscription extends BaseEntity {

    @Id
    @Column("C_Subscription_ID")
    private Integer cSubscriptionId;

    @Column("Name")
    private String name;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_SubscriptionType_ID")
    private Integer cSubscriptionTypeId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("StartDate")
    private LocalDateTime startDate;

    @Column("RenewalDate")
    private LocalDateTime renewalDate;

    @Column("PaidUntilDate")
    private LocalDateTime paidUntilDate;

    @Column("IsDue")
    private String isDue;
}
