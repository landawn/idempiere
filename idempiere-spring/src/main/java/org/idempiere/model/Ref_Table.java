package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Reference Table entity - AD_Ref_Table table.
 * Table reference definitions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Ref_Table")
public class Ref_Table extends BaseEntity {

    @Id
    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("AD_Key")
    private Integer adKey;

    @Column("AD_Display")
    private Integer adDisplay;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("IsValueDisplayed")
    private String isValueDisplayed;

    @Column("OrderByClause")
    private String orderByClause;

    @Column("WhereClause")
    private String whereClause;

    @Column("EntityType")
    private String entityType;

    @Column("IsAlert")
    private String isAlert;

    @Column("DisplaySQL")
    private String displaySQL;
}
