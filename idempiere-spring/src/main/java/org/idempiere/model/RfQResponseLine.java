package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * RfQ Response Line entity.
 * Maps to C_RfQResponseLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_RfQResponseLine")
public class RfQResponseLine extends BaseEntity {

    @Id
    @Column("C_RfQResponseLine_ID")
    private Integer cRfQResponseLineId;

    @Column("C_RfQResponse_ID")
    private Integer cRfQResponseId;

    @Column("C_RfQLine_ID")
    private Integer cRfQLineId;

    @Column("DateWorkStart")
    private LocalDateTime dateWorkStart;

    @Column("DateWorkComplete")
    private LocalDateTime dateWorkComplete;

    @Column("DeliveryDays")
    private Integer deliveryDays;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsSelectedWinner")
    private String isSelectedWinner;

    @Column("IsSelfService")
    private String isSelfService;
}
