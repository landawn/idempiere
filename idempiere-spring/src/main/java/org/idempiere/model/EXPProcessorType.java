package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Export Processor Type entity - EXP_Processor_Type table.
 * Type of data export processor.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("EXP_Processor_Type")
public class EXPProcessorType extends BaseEntity {

    @Id
    @Column("EXP_Processor_Type_ID")
    private Integer expProcessorTypeId;

    @Column("Classname")
    private String classname;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Name")
    private String name;

    @Column("Value")
    private String value;
}
