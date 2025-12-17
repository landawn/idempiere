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
 * Request for Quotation entity.
 * Maps to C_RfQ table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_RfQ")
public class RfQ extends BaseEntity {

    @Id
    @Column("C_RfQ_ID")
    private Integer cRfQId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("DocumentNo")
    private String documentNo;

    @Column("C_RfQ_Topic_ID")
    private Integer cRfQTopicId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("DateWorkStart")
    private LocalDateTime dateWorkStart;

    @Column("DateWorkComplete")
    private LocalDateTime dateWorkComplete;

    @Column("DeliveryDays")
    private Integer deliveryDays;

    @Column("DateResponse")
    private LocalDateTime dateResponse;

    @Column("QuoteType")
    private String quoteType;

    @Column("IsQuoteAllQty")
    private String isQuoteAllQty;

    @Column("IsQuoteTotalAmt")
    private String isQuoteTotalAmt;

    @Column("IsSelfService")
    private String isSelfService;

    @Column("IsInvitedVendorsOnly")
    private String isInvitedVendorsOnly;

    @Column("IsRfQResponseAccepted")
    private String isRfQResponseAccepted;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("Margin")
    private Integer margin;
}
