package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Export Format entity - EXP_Format table.
 * Format definition for data export.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("EXP_Format")
public class EXPFormat extends BaseEntity {

    @Id
    @Column("EXP_Format_ID")
    private Integer expFormatId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Name")
    private String name;

    @Column("Value")
    private String value;

    @Column("Version")
    private String version;

    @Column("AD_ReplicationStrategy_ID")
    private Integer adReplicationStrategyId;

    @Column("TestExportModel")
    private String testExportModel;
}
