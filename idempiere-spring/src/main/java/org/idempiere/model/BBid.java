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
 * Bid entity - B_Bid table.
 * Online auction bid.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("B_Bid")
public class BBid extends BaseEntity {

    @Id
    @Column("B_Bid_ID")
    private Integer bBidId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("B_BuyerFunds_ID")
    private Integer bBuyerFundsId;

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
