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
 * Match Purchase Order entity - M_MatchPO table.
 * Match receipt line to purchase order line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_MatchPO")
public class MMatchPO extends BaseEntity {

    @Id
    @Column("M_MatchPO_ID")
    private Integer mMatchPoId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("Description")
    private String description;

    @Column("DocumentNo")
    private String documentNo;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Posted")
    private String posted;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("Qty")
    private BigDecimal qty;

    @Column("Reversal_ID")
    private Integer reversalId;
}
