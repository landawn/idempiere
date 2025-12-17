package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Info Window Column entity - AD_InfoWindowColumn table.
 * Info window column definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_InfoWindowColumn")
public class InfoWindowColumn extends BaseEntity {

    @Id
    @Column("AD_InfoWindowColumn_ID")
    private Integer adInfoWindowColumnId;

    @Column("AD_InfoWindow_ID")
    private Integer adInfoWindowId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("AD_Reference_Value_ID")
    private Integer adReferenceValueId;

    @Column("IsDisplayed")
    private String isDisplayed;

    @Column("IsQueryCriteria")
    private String isQueryCriteria;

    @Column("SelectClause")
    private String selectClause;
}
