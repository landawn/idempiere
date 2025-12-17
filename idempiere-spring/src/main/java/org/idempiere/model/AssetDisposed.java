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
 * Asset Disposed entity - A_Asset_Disposed table.
 * Asset disposal record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Disposed")
public class AssetDisposed extends BaseEntity {

    @Id
    @Column("A_Asset_Disposed_ID")
    private Integer aAssetDisposedId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("A_Asset_Trade_ID")
    private Integer aAssetTradeId;

    @Column("A_Disposed_Date")
    private LocalDateTime aDisposedDate;

    @Column("A_Disposed_Method")
    private String aDisposedMethod;

    @Column("A_Disposed_Reason")
    private String aDisposedReason;

    @Column("A_Proceeds")
    private BigDecimal aProceeds;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("Processed")
    private String processed;
}
