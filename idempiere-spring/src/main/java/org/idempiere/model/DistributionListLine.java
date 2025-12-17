package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Distribution List Line entity.
 * Maps to M_DistributionListLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_DistributionListLine")
public class DistributionListLine extends BaseEntity {

    @Id
    @Column("M_DistributionListLine_ID")
    private Integer mDistributionListLineId;

    @Column("M_DistributionList_ID")
    private Integer mDistributionListId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("Ratio")
    private BigDecimal ratio;

    @Column("MinQty")
    private BigDecimal minQty;

    @Column("Description")
    private String description;
}
