package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Report Line Set entity - PA_ReportLineSet table.
 * Financial report line set definitions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_ReportLineSet")
public class ReportLineSet extends BaseEntity {

    @Id
    @Column("PA_ReportLineSet_ID")
    private Integer paReportLineSetId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Processing")
    private String processing;
}
