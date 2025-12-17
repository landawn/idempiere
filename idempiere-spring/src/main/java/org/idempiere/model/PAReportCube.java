package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * PA Report Cube entity - PA_ReportCube table.
 * Performance Analysis Report Cube.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_ReportCube")
public class PAReportCube extends BaseEntity {

    @Id
    @Column("PA_ReportCube_ID")
    private Integer paReportCubeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("C_Calendar_ID")
    private Integer cCalendarId;

    @Column("LastRecalculated")
    private LocalDateTime lastRecalculated;

    @Column("Processing")
    private String processing;
}
