package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Scheduler Parameter entity - AD_Scheduler_Para table.
 * Parameters for scheduler processes.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Scheduler_Para")
public class SchedulerPara extends BaseEntity {

    @Id
    @Column("AD_Scheduler_Para_ID")
    private Integer adSchedulerParaId;

    @Column("AD_Scheduler_ID")
    private Integer adSchedulerId;

    @Column("AD_Process_Para_ID")
    private Integer adProcessParaId;

    @Column("ParameterDefault")
    private String parameterDefault;

    @Column("ParameterToDefault")
    private String parameterToDefault;

    @Column("Description")
    private String description;
}
