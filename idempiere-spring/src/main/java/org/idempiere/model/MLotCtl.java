package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Lot Control entity - M_LotCtl table.
 * Control for lot number generation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_LotCtl")
public class MLotCtl extends BaseEntity {

    @Id
    @Column("M_LotCtl_ID")
    private Integer mLotCtlId;

    @Column("CurrentNext")
    private Integer currentNext;

    @Column("Description")
    private String description;

    @Column("IncrementNo")
    private Integer incrementNo;

    @Column("Name")
    private String name;

    @Column("Prefix")
    private String prefix;

    @Column("StartNo")
    private Integer startNo;

    @Column("Suffix")
    private String suffix;
}
