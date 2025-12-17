package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Import Processor Parameter entity - IMP_ProcessorParameter table.
 * Parameters for import processor.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("IMP_ProcessorParameter")
public class IMPProcessorParameter extends BaseEntity {

    @Id
    @Column("IMP_ProcessorParameter_ID")
    private Integer impProcessorParameterId;

    @Column("IMP_Processor_ID")
    private Integer impProcessorId;

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
