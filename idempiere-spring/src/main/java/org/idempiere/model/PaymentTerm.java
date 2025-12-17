package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Payment Term entity.
 * Maps to C_PaymentTerm table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_PaymentTerm")
public class PaymentTerm extends BaseEntity {

    @Id
    @Column("C_PaymentTerm_ID")
    private Integer cPaymentTermId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("DocumentNote")
    private String documentNote;

    @Column("AfterDelivery")
    private String afterDelivery;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsValid")
    private String isValid;

    @Column("IsDueFixed")
    private String isDueFixed;

    @Column("IsNextBusinessDay")
    private String isNextBusinessDay;

    @Column("NetDays")
    private Integer netDays;

    @Column("GraceDays")
    private Integer graceDays;

    @Column("DiscountDays")
    private Integer discountDays;

    @Column("Discount")
    private BigDecimal discount;

    @Column("DiscountDays2")
    private Integer discountDays2;

    @Column("Discount2")
    private BigDecimal discount2;

    @Column("FixMonthDay")
    private Integer fixMonthDay;

    @Column("FixMonthCutoff")
    private Integer fixMonthCutoff;

    @Column("FixMonthOffset")
    private Integer fixMonthOffset;

    @Column("PaymentTermUsage")
    private String paymentTermUsage;
}
