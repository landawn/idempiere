package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Alert Rule entity.
 * Maps to AD_AlertRule table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_AlertRule")
public class AlertRule extends BaseEntity {

    @Id
    @Column("AD_AlertRule_ID")
    private Integer adAlertRuleId;

    @Column("AD_Alert_ID")
    private Integer adAlertId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("SelectClause")
    private String selectClause;

    @Column("FromClause")
    private String fromClause;

    @Column("WhereClause")
    private String whereClause;

    @Column("OtherClause")
    private String otherClause;

    @Column("PreProcessing")
    private String preProcessing;

    @Column("PostProcessing")
    private String postProcessing;

    @Column("ErrorMsg")
    private String errorMsg;

    @Column("IsValid")
    private String isValid;
}
