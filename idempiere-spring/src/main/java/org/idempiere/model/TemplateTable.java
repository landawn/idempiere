package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Template Table entity - CM_TemplateTable table.
 * Web template table definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_TemplateTable")
public class TemplateTable extends BaseEntity {

    @Id
    @Column("CM_TemplateTable_ID")
    private Integer cmTemplateTableId;

    @Column("CM_Template_ID")
    private Integer cmTemplateId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Name")
    private String name;

    @Column("OtherClause")
    private String otherClause;

    @Column("WhereClause")
    private String whereClause;
}
