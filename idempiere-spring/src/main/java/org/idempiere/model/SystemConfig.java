package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * System Config entity - AD_SysConfig table.
 * System configuration parameters.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_SysConfig")
public class SystemConfig extends BaseEntity {

    @Id
    @Column("AD_SysConfig_ID")
    private Integer adSysConfigId;

    @Column("Name")
    private String name;

    @Column("Value")
    private String value;

    @Column("Description")
    private String description;

    @Column("EntityType")
    private String entityType;

    @Column("ConfigurationLevel")
    private String configurationLevel;
}
