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
 * Return Material Authorization entity.
 * Maps to M_RMA table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_RMA")
public class RMA extends BaseEntity {

    @Id
    @Column("M_RMA_ID")
    private Integer mRmaId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("M_RMAType_ID")
    private Integer mRmaTypeId;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("M_InOut_ID")
    private Integer mInOutId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("Amt")
    private BigDecimal amt;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processed")
    private String processed;

    @Column("IsApproved")
    private String isApproved;

    @Column("GenerateTo")
    private String generateTo;

    @Column("Help")
    private String help;
}
