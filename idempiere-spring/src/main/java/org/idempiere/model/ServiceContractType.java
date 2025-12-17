package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Service Contract Type entity - C_ContractType table.
 * Service contract type definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ContractType")
public class ServiceContractType extends BaseEntity {

    @Id
    @Column("C_ContractType_ID")
    private Integer cContractTypeId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("DurationUnit")
    private String durationUnit;

    @Column("Duration")
    private Integer duration;

    @Column("IsAutoRenew")
    private String isAutoRenew;

    @Column("RenewalNotice")
    private Integer renewalNotice;
}
