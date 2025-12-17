package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * SLA Criteria entity - PA_SLA_Criteria table.
 * Service Level Agreement criteria/measures.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_SLA_Criteria")
public class SLACriteria extends BaseEntity {

    @Id
    @Column("PA_SLA_Criteria_ID")
    private Integer paSlaCriteriaId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Classname")
    private String classname;

    @Column("IsManual")
    private String isManual;
}
