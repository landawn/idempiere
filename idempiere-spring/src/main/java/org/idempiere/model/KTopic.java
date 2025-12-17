package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * K Topic entity - K_Topic table.
 * Knowledge Topic.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("K_Topic")
public class KTopic extends BaseEntity {

    @Id
    @Column("K_Topic_ID")
    private Integer kTopicId;

    @Column("K_Type_ID")
    private Integer kTypeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsPublic")
    private String isPublic;
}
