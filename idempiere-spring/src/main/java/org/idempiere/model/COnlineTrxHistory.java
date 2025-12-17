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
 * Online transaction history.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_OnlineTrxHistory")
public class COnlineTrxHistory extends BaseEntity {

    @Id
    @Column("C_OnlineTrxHistory_ID")
    private Integer cOnlineTrxHistoryId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Amount")
    private BigDecimal amount;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("IsApproved")
    private String isApproved;

    @Column("R_AvsAddr")
    private String rAvsAddr;

    @Column("R_AvsZip")
    private String rAvsZip;

    @Column("R_CVV2Match")
    private String rCvv2Match;

    @Column("R_Info")
    private String rInfo;

    @Column("R_PnRef")
    private String rPnRef;

    @Column("R_RespMsg")
    private String rRespMsg;

    @Column("R_Result")
    private String rResult;

    @Column("Record_ID")
    private Integer recordId;

    @Column("TrxType")
    private String trxType;
}
