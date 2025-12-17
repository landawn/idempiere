package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Scheduler Para entity - AD_Scheduler_Para table.
 * Scheduler Parameter.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Scheduler_Para")
public class ADSchedulerPara extends BaseEntity {

    @Id
    @Column("AD_Scheduler_ID")
    private Integer adSchedulerId;

    @Id
    @Column("AD_Process_Para_ID")
    private Integer adProcessParaId;

    @Column("ParameterDefault")
    private String parameterDefault;

    @Column("ParameterToDefault")
    private String parameterToDefault;

    @Column("Description")
    private String description;
}
