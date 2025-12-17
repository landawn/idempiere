package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Report Cube entity - PA_ReportCube table.
 * OLAP report cube definitions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_ReportCube")
public class ReportCube extends BaseEntity {

    @Id
    @Column("PA_ReportCube_ID")
    private Integer paReportCubeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_Calendar_ID")
    private Integer cCalendarId;

    @Column("PA_Hierarchy_ID")
    private Integer paHierarchyId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Processing")
    private String processing;

    @Column("LastRecalculated")
    private LocalDateTime lastRecalculated;
}
