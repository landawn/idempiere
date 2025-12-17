package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * W Basket entity - W_Basket table.
 * Web Basket.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_Basket")
public class WBasket extends BaseEntity {

    @Id
    @Column("W_Basket_ID")
    private Integer wBasketId;

    @Column("W_Store_ID")
    private Integer wStoreId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Session_ID")
    private Integer sessionId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("Bill_BPartner_ID")
    private Integer billBPartnerId;

    @Column("Bill_Location_ID")
    private Integer billLocationId;

    @Column("Bill_User_ID")
    private Integer billUserId;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("C_PaymentTerm_ID")
    private Integer cPaymentTermId;

    @Column("C_Order_ID")
    private Integer cOrderId;
}
