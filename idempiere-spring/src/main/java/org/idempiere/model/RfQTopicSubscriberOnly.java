package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * RfQ Topic Subscriber Restriction entity.
 * Maps to C_RfQ_TopicSubscriberOnly table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_RfQ_TopicSubscriberOnly")
public class RfQTopicSubscriberOnly extends BaseEntity {

    @Id
    @Column("C_RfQ_TopicSubscriberOnly_ID")
    private Integer cRfQTopicSubscriberOnlyId;

    @Column("C_RfQ_TopicSubscriber_ID")
    private Integer cRfQTopicSubscriberId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Product_Category_ID")
    private Integer mProductCategoryId;

    @Column("Description")
    private String description;
}
