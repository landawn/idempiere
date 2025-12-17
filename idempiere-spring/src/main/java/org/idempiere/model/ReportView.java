package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Report View entity.
 * Maps to AD_ReportView table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ReportView")
public class ReportView extends BaseEntity {

    @Id
    @Column("AD_ReportView_ID")
    private Integer adReportViewId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("EntityType")
    private String entityType;

    @Column("WhereClause")
    private String whereClause;

    @Column("OrderByClause")
    private String orderByClause;

    @Column("IsCentrallyMaintained")
    private String isCentrallyMaintained;
}
