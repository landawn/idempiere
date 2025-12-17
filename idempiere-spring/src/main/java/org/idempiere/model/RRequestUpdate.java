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
 * R Request Update entity - R_RequestUpdate table.
 * Request Update.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_RequestUpdate")
public class RRequestUpdate extends BaseEntity {

    @Id
    @Column("R_RequestUpdate_ID")
    private Integer rRequestUpdateId;

    @Column("R_Request_ID")
    private Integer rRequestId;

    @Column("ConfidentialType")
    private String confidentialType;

    @Column("Result")
    private String result;

    @Column("QtySpent")
    private BigDecimal qtySpent;

    @Column("QtyInvoiced")
    private BigDecimal qtyInvoiced;

    @Column("M_ProductSpent_ID")
    private Integer mProductSpentId;

    @Column("StartTime")
    private LocalDateTime startTime;

    @Column("EndTime")
    private LocalDateTime endTime;
}
