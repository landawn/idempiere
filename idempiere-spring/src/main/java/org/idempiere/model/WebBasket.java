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
 * Web Basket entity.
 * Maps to W_Basket table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_Basket")
public class WebBasket extends BaseEntity {

    @Id
    @Column("W_Basket_ID")
    private Integer wBasketId;

    @Column("W_Store_ID")
    private Integer wStoreId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("Session_ID")
    private String sessionId;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("C_PaymentTerm_ID")
    private Integer cPaymentTermId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("DateOrdered")
    private LocalDateTime dateOrdered;

    @Column("TotalAmt")
    private BigDecimal totalAmt;
}
