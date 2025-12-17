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
 * Request for Quotation Line entity.
 * Maps to C_RfQLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_RfQLine")
public class RfQLine extends BaseEntity {

    @Id
    @Column("C_RfQLine_ID")
    private Integer cRfQLineId;

    @Column("C_RfQ_ID")
    private Integer cRfQId;

    @Column("Line")
    private Integer line;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("DateWorkStart")
    private LocalDateTime dateWorkStart;

    @Column("DateWorkComplete")
    private LocalDateTime dateWorkComplete;

    @Column("DeliveryDays")
    private Integer deliveryDays;
}
