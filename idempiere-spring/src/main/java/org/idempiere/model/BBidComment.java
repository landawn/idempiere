package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Bid Comment entity - B_BidComment table.
 * Comment on an auction bid.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("B_BidComment")
public class BBidComment extends BaseEntity {

    @Id
    @Column("B_BidComment_ID")
    private Integer bBidCommentId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("B_Topic_ID")
    private Integer bTopicId;

    @Column("TextMsg")
    private String textMsg;
}
