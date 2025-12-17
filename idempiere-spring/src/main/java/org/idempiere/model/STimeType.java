package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Time Type entity - S_TimeType table.
 * Type of time activity (e.g., regular, overtime).
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("S_TimeType")
public class STimeType extends BaseEntity {

    @Id
    @Column("S_TimeType_ID")
    private Integer sTimeTypeId;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Name")
    private String name;

    @Column("Value")
    private String value;
}
