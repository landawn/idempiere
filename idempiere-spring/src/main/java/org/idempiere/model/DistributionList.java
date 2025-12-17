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
 * Distribution List entity.
 * Maps to M_DistributionList table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_DistributionList")
public class DistributionList extends BaseEntity {

    @Id
    @Column("M_DistributionList_ID")
    private Integer mDistributionListId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("RatioTotal")
    private BigDecimal ratioTotal;

    @Column("Processing")
    private String processing;
}
