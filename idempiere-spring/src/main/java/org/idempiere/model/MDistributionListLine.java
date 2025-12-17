package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * Distribution List Line entity - M_DistributionListLine table.
 * Line item in distribution list.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_DistributionListLine")
public class MDistributionListLine extends BaseEntity {

    @Id
    @Column("M_DistributionListLine_ID")
    private Integer mDistributionListLineId;

    @Column("M_DistributionList_ID")
    private Integer mDistributionListId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("Description")
    private String description;

    @Column("MinQty")
    private BigDecimal minQty;

    @Column("Ratio")
    private BigDecimal ratio;
}
