package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Subscription Type entity.
 * Maps to C_SubscriptionType table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_SubscriptionType")
public class SubscriptionType extends BaseEntity {

    @Id
    @Column("C_SubscriptionType_ID")
    private Integer cSubscriptionTypeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Frequency")
    private Integer frequency;

    @Column("FrequencyType")
    private String frequencyType;
}
