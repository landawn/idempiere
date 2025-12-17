package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Service Contract entity - C_Contract table.
 * Service contract.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Contract")
public class ServiceContract extends BaseEntity {

    @Id
    @Column("C_Contract_ID")
    private Integer cContractId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("C_ContractType_ID")
    private Integer cContractTypeId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("DateContract")
    private LocalDate dateContract;

    @Column("StartDate")
    private LocalDate startDate;

    @Column("EndDate")
    private LocalDate endDate;

    @Column("RenewalDate")
    private LocalDate renewalDate;

    @Column("ContractAmt")
    private BigDecimal contractAmt;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("IsAutoRenew")
    private String isAutoRenew;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processed")
    private String processed;
}
