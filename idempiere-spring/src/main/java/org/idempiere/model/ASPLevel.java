package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ASP Level entity - ASP_Level table.
 * Application Service Provider subscription level.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("ASP_Level")
public class ASPLevel extends BaseEntity {

    @Id
    @Column("ASP_Level_ID")
    private Integer aspLevelId;

    @Column("ASP_Module_ID")
    private Integer aspModuleId;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Name")
    private String name;

    @Column("Processing")
    private String processing;

    @Column("Value")
    private String value;
}
