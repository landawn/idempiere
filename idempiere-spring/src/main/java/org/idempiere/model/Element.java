package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Account Element entity - defines the chart of accounts structure.
 * Maps to C_Element table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Element")
public class Element extends BaseEntity {

    @Id
    @Column("C_Element_ID")
    private Integer cElementId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("VFormat")
    private String vFormat;

    @Column("ElementType")
    private String elementType;

    @Column("IsBalancing")
    private String isBalancing;

    @Column("IsNaturalAccount")
    private String isNaturalAccount;

    @Column("AD_Tree_ID")
    private Integer adTreeId;
}
