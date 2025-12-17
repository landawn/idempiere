package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Export Processor Parameter entity - EXP_ProcessorParameter table.
 * Parameters for export processor.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("EXP_ProcessorParameter")
public class EXPProcessorParameter extends BaseEntity {

    @Id
    @Column("EXP_ProcessorParameter_ID")
    private Integer expProcessorParameterId;

    @Column("EXP_Processor_ID")
    private Integer expProcessorId;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Name")
    private String name;

    @Column("ParameterValue")
    private String parameterValue;

    @Column("Value")
    private String value;
}
