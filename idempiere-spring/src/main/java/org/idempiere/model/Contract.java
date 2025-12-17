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
 * Contract entity.
 * Maps to C_Contract table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Contract")
public class Contract extends BaseEntity {

    @Id
    @Column("C_Contract_ID")
    private Integer cContractId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("DateStart")
    private LocalDateTime dateStart;

    @Column("DateEnd")
    private LocalDateTime dateEnd;

    @Column("ContractType")
    private String contractType;

    @Column("ContractStatus")
    private String contractStatus;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("TotalAmt")
    private BigDecimal totalAmt;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("IsSOTrx")
    private String isSOTrx;
}
