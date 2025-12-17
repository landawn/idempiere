package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Import Processor Type entity - IMP_Processor_Type table.
 * Type of import processor.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("IMP_Processor_Type")
public class IMPProcessorType extends BaseEntity {

    @Id
    @Column("IMP_Processor_Type_ID")
    private Integer impProcessorTypeId;

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
