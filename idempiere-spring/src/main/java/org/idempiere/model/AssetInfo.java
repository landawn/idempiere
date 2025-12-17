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
 * Asset Info entity - A_Asset_Info_Fin table.
 * Asset financial information.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Info_Fin")
public class AssetInfo extends BaseEntity {

    @Id
    @Column("A_Asset_Info_Fin_ID")
    private Integer aAssetInfoFinId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("A_Finance_Meth")
    private String aFinanceMeth;

    @Column("A_Purchase_Option")
    private String aPurchaseOption;

    @Column("A_Purchase_Option_Credit")
    private BigDecimal aPurchaseOptionCredit;

    @Column("A_Purchase_Price")
    private BigDecimal aPurchasePrice;

    @Column("A_Contract_Date")
    private LocalDateTime aContractDate;

    @Column("A_Expired_Date")
    private LocalDateTime aExpiredDate;

    @Column("A_Monthly_Payment")
    private BigDecimal aMonthlyPayment;

    @Column("A_Due_On")
    private Integer aDueOn;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("TextMsg")
    private String textMsg;
}
