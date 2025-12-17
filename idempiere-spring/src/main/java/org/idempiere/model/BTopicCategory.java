package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Auction Topic Category entity - B_TopicCategory table.
 * Category for auction topics.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("B_TopicCategory")
public class BTopicCategory extends BaseEntity {

    @Id
    @Column("B_TopicCategory_ID")
    private Integer bTopicCategoryId;

    @Column("Description")
    private String description;

    @Column("Name")
    private String name;
}
