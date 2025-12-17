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
 * Import Confirmation entity - I_InOutLineConfirm table.
 * Shipment confirmation import.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("I_InOutLineConfirm")
public class ImportConfirmation extends BaseEntity {

    @Id
    @Column("I_InOutLineConfirm_ID")
    private Integer iInOutLineConfirmId;

    @Column("M_InOutLineConfirm_ID")
    private Integer mInOutLineConfirmId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("ConfirmationNo")
    private String confirmationNo;

    @Column("ConfirmedQty")
    private BigDecimal confirmedQty;

    @Column("ScrappedQty")
    private BigDecimal scrappedQty;

    @Column("DifferenceQty")
    private BigDecimal differenceQty;

    @Column("Description")
    private String description;

    @Column("ConfirmationDate")
    private LocalDateTime confirmationDate;

    @Column("IsError")
    private String isError;

    @Column("I_ErrorMsg")
    private String iErrorMsg;

    @Column("I_IsImported")
    private String iIsImported;

    @Column("Processed")
    private String processed;
}
