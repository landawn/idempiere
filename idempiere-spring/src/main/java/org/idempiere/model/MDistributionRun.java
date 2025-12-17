package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Distribution Run entity - M_DistributionRun table.
 * Distribution run configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_DistributionRun")
public class MDistributionRun extends BaseEntity {

    @Id
    @Column("M_DistributionRun_ID")
    private Integer mDistributionRunId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("CreateSingleOrder")
    private String createSingleOrder;

    @Column("Description")
    private String description;

    @Column("IsCreateConfirmed")
    private String isCreateConfirmed;

    @Column("Name")
    private String name;

    @Column("Processing")
    private String processing;
}
