package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Export Processor entity - EXP_Processor table.
 * Data export processor.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("EXP_Processor")
public class EXPProcessor extends BaseEntity {

    @Id
    @Column("EXP_Processor_ID")
    private Integer expProcessorId;

    @Column("EXP_Processor_Type_ID")
    private Integer expProcessorTypeId;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Host")
    private String host;

    @Column("Name")
    private String name;

    @Column("Password")
    private String password;

    @Column("Port")
    private Integer port;

    @Column("UserName")
    private String userName;

    @Column("Value")
    private String value;
}
