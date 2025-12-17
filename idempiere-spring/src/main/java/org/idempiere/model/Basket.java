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
 * Basket entity - W_Basket table.
 * Web shopping basket header.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_Basket")
public class Basket extends BaseEntity {

    @Id
    @Column("W_Basket_ID")
    private Integer wBasketId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Session_ID")
    private Integer sessionId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("M_PriceList_Version_ID")
    private Integer mPriceListVersionId;
}
