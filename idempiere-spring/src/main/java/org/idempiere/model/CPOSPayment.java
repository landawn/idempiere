package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * POS Payment entity - C_POSPayment table.
 * Point of Sale payment.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_POSPayment")
public class CPOSPayment extends BaseEntity {

    @Id
    @Column("C_POSPayment_ID")
    private Integer cPosPaymentId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("IsPostDated")
    private String isPostDated;

    @Column("PayAmt")
    private BigDecimal payAmt;

    @Column("TenderType")
    private String tenderType;
}
