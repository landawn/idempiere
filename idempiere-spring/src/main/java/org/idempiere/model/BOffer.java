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
 * Offer entity - B_Offer table.
 * Online auction offer.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("B_Offer")
public class BOffer extends BaseEntity {

    @Id
    @Column("B_Offer_ID")
    private Integer bOfferId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("B_SellerFunds_ID")
    private Integer bSellerFundsId;

    @Column("B_Topic_ID")
    private Integer bTopicId;

    @Column("IsWillingToCommit")
    private String isWillingToCommit;

    @Column("Name")
    private String name;

    @Column("PrivateNote")
    private String privateNote;

    @Column("TextMsg")
    private String textMsg;
}
