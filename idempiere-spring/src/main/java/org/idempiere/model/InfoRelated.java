package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Info Related entity - AD_InfoRelated table.
 * Defines related info windows.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_InfoRelated")
public class InfoRelated extends BaseEntity {

    @Id
    @Column("AD_InfoRelated_ID")
    private Integer adInfoRelatedId;

    @Column("AD_InfoWindow_ID")
    private Integer adInfoWindowId;

    @Column("RelatedInfo_ID")
    private Integer relatedInfoId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("EntityType")
    private String entityType;

    @Column("AD_Reference_ID")
    private Integer adReferenceId;
}
