package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Sub Account entity.
 * Maps to C_SubAcct table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_SubAcct")
public class SubAcct extends BaseEntity {

    @Id
    @Column("C_SubAcct_ID")
    private Integer cSubAcctId;

    @Column("C_ElementValue_ID")
    private Integer cElementValueId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;
}
