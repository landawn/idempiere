package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Serial Number Control entity.
 * Maps to M_SerNoCtl table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_SerNoCtl")
public class SerNoCtl extends BaseEntity {

    @Id
    @Column("M_SerNoCtl_ID")
    private Integer mSerNoCtlId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("StartNo")
    private Integer startNo;

    @Column("IncrementNo")
    private Integer incrementNo;

    @Column("CurrentNext")
    private Integer currentNext;

    @Column("Prefix")
    private String prefix;

    @Column("Suffix")
    private String suffix;
}
