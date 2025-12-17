package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Reference Table entity - table validation.
 * Maps to AD_Ref_Table table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Ref_Table")
public class RefTable extends BaseEntity {

    @Id
    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("AD_Key")
    private Integer adKey;

    @Column("AD_Display")
    private Integer adDisplay;

    @Column("IsValueDisplayed")
    private String isValueDisplayed;

    @Column("OrderByClause")
    private String orderByClause;

    @Column("EntityType")
    private String entityType;

    @Column("WhereClause")
    private String whereClause;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("IsAlert")
    private String isAlert;

    @Column("DisplaySQL")
    private String displaySQL;
}
