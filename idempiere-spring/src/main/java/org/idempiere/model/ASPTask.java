package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ASP Task entity - ASP_Task table.
 * ASP task configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("ASP_Task")
public class ASPTask extends BaseEntity {

    @Id
    @Column("ASP_Task_ID")
    private Integer aspTaskId;

    @Column("AD_Task_ID")
    private Integer adTaskId;

    @Column("ASP_Level_ID")
    private Integer aspLevelId;

    @Column("ASP_Status")
    private String aspStatus;
}
