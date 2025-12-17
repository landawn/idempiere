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
 * Service Level Line entity - C_ServiceLevelLine table.
 * Service level line item.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ServiceLevelLine")
public class CServiceLevelLine extends BaseEntity {

    @Id
    @Column("C_ServiceLevelLine_ID")
    private Integer cServiceLevelLineId;

    @Column("C_ServiceLevel_ID")
    private Integer cServiceLevelId;

    @Column("Description")
    private String description;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("ServiceDate")
    private LocalDateTime serviceDate;

    @Column("ServiceLevelInvoiced")
    private BigDecimal serviceLevelInvoiced;

    @Column("ServiceLevelProvided")
    private BigDecimal serviceLevelProvided;
}
