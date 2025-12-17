package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * RfQ Response entity.
 * Maps to C_RfQResponse table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_RfQResponse")
public class RfQResponse extends BaseEntity {

    @Id
    @Column("C_RfQResponse_ID")
    private Integer cRfQResponseId;

    @Column("C_RfQ_ID")
    private Integer cRfQId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("DateResponse")
    private LocalDateTime dateResponse;

    @Column("DateWorkStart")
    private LocalDateTime dateWorkStart;

    @Column("DateWorkComplete")
    private LocalDateTime dateWorkComplete;

    @Column("DeliveryDays")
    private Integer deliveryDays;

    @Column("Price")
    private BigDecimal price;

    @Column("Ranking")
    private Integer ranking;

    @Column("IsComplete")
    private String isComplete;

    @Column("IsSelectedWinner")
    private String isSelectedWinner;

    @Column("IsSelfService")
    private String isSelfService;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("CheckComplete")
    private String checkComplete;
}
