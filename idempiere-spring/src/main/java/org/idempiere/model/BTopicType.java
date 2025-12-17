package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Auction Topic Type entity - B_TopicType table.
 * Type of auction topic.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("B_TopicType")
public class BTopicType extends BaseEntity {

    @Id
    @Column("B_TopicType_ID")
    private Integer bTopicTypeId;

    @Column("AuctionType")
    private String auctionType;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("M_ProductCategory_ID")
    private Integer mProductCategoryId;

    @Column("Name")
    private String name;
}
