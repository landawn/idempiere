package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Subscription Type entity - C_SubscriptionType table.
 * Type of subscription.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_SubscriptionType")
public class CSubscriptionType extends BaseEntity {

    @Id
    @Column("C_SubscriptionType_ID")
    private Integer cSubscriptionTypeId;

    @Column("Description")
    private String description;

    @Column("Frequency")
    private Integer frequency;

    @Column("FrequencyType")
    private String frequencyType;

    @Column("Name")
    private String name;
}
