package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * 1099 Box entity - C_1099_Box table.
 * IRS 1099 form box definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_1099_Box")
public class C1099Box extends BaseEntity {

    @Id
    @Column("C_1099_Box_ID")
    private Integer c1099BoxId;

    @Column("BoxNumber")
    private String boxNumber;

    @Column("Description")
    private String description;

    @Column("Name")
    private String name;

    @Column("Value")
    private String value;
}
