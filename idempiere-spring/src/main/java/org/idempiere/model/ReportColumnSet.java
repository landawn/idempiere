package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Report Column Set entity - PA_ReportColumnSet table.
 * Financial report column set definitions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_ReportColumnSet")
public class ReportColumnSet extends BaseEntity {

    @Id
    @Column("PA_ReportColumnSet_ID")
    private Integer paReportColumnSetId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Processing")
    private String processing;
}
