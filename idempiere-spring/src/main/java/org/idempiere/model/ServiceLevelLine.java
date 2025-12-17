package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Service Level Line entity - M_ServiceLevelLine table.
 * Product service level line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ServiceLevelLine")
public class ServiceLevelLine extends BaseEntity {

    @Id
    @Column("M_ServiceLevelLine_ID")
    private Integer mServiceLevelLineId;

    @Column("M_ServiceLevel_ID")
    private Integer mServiceLevelId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("ServiceDate")
    private LocalDateTime serviceDate;

    @Column("ServiceLevelProvided")
    private BigDecimal serviceLevelProvided;

    @Column("ServiceLevelInvoiced")
    private BigDecimal serviceLevelInvoiced;
}
