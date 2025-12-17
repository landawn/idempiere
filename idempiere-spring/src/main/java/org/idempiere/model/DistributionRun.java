package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Distribution Run entity.
 * Maps to M_DistributionRun table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_DistributionRun")
public class DistributionRun extends BaseEntity {

    @Id
    @Column("M_DistributionRun_ID")
    private Integer mDistributionRunId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("M_DistributionList_ID")
    private Integer mDistributionListId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("IsCreateSingleOrder")
    private String isCreateSingleOrder;

    @Column("Processing")
    private String processing;
}
