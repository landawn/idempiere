package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Find entity - AD_Find table.
 * Find.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Find")
public class ADFind extends BaseEntity {

    @Id
    @Column("AD_Find_ID")
    private Integer adFindId;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AndOr")
    private String andOr;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("Operation")
    private String operation;

    @Column("Value")
    private String value;

    @Column("Value2")
    private String value2;
}
