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
 * Online Transaction History entity - C_OnlineTrxHistory table.
 * History of online transactions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_OnlineTrxHistory")
public class OnlineTrxHistory extends BaseEntity {

    @Id
    @Column("C_OnlineTrxHistory_ID")
    private Integer cOnlineTrxHistoryId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("C_PaymentProcessor_ID")
    private Integer cPaymentProcessorId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("TrxType")
    private String trxType;

    @Column("Amount")
    private BigDecimal amount;

    @Column("IsApproved")
    private String isApproved;

    @Column("IsVoided")
    private String isVoided;

    @Column("R_AuthCode")
    private String rAuthCode;

    @Column("R_Info")
    private String rInfo;

    @Column("R_RespMsg")
    private String rRespMsg;

    @Column("R_Result")
    private String rResult;

    @Column("R_PnRef")
    private String rPnRef;

    @Column("DateTrx")
    private LocalDateTime dateTrx;
}
