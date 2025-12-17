package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Zoom Condition entity - AD_ZoomCondition table.
 * Conditional zoom target definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ZoomCondition")
public class ZoomCondition extends BaseEntity {

    @Id
    @Column("AD_ZoomCondition_ID")
    private Integer adZoomConditionId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("WhereClause")
    private String whereClause;
}
