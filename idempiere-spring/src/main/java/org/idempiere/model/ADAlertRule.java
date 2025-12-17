package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Alert Rule entity - AD_AlertRule table.
 * Alert Rule.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_AlertRule")
public class ADAlertRule extends BaseEntity {

    @Id
    @Column("AD_AlertRule_ID")
    private Integer adAlertRuleId;

    @Column("AD_Alert_ID")
    private Integer adAlertId;

    @Column("Name")
    private String name;

    @Column("IsValid")
    private String isValid;

    @Column("SelectClause")
    private String selectClause;

    @Column("FromClause")
    private String fromClause;

    @Column("WhereClause")
    private String whereClause;

    @Column("PreProcessing")
    private String preProcessing;

    @Column("PostProcessing")
    private String postProcessing;

    @Column("TableName")
    private String tableName;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("ErrorMsg")
    private String errorMsg;
}
