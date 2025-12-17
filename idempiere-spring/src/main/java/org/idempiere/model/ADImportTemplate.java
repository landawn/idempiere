package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Import Template entity - AD_ImportTemplate table.
 * Template for data import.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ImportTemplate")
public class ADImportTemplate extends BaseEntity {

    @Id
    @Column("AD_ImportTemplate_ID")
    private Integer adImportTemplateId;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("CharacterSet")
    private String characterSet;

    @Column("Description")
    private String description;

    @Column("IsRawDataTable")
    private String isRawDataTable;

    @Column("Name")
    private String name;

    @Column("RawDelimiter")
    private String rawDelimiter;

    @Column("Separator")
    private String separator;
}
