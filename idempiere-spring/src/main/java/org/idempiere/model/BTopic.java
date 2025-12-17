package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Auction Topic entity - B_Topic table.
 * Online auction topic.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("B_Topic")
public class BTopic extends BaseEntity {

    @Id
    @Column("B_Topic_ID")
    private Integer bTopicId;

    @Column("B_TopicCategory_ID")
    private Integer bTopicCategoryId;

    @Column("B_TopicType_ID")
    private Integer bTopicTypeId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("DecisionDate")
    private LocalDateTime decisionDate;

    @Column("Description")
    private String description;

    @Column("DocumentNo")
    private String documentNo;

    @Column("IsPublished")
    private String isPublished;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Name")
    private String name;

    @Column("ProcessedOn")
    private BigDecimal processedOn;

    @Column("Qty")
    private BigDecimal qty;

    @Column("TextMsg")
    private String textMsg;

    @Column("TopicAction")
    private String topicAction;

    @Column("TopicStatus")
    private String topicStatus;
}
