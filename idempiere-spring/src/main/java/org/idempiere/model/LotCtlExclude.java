package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Lot Control Exclude entity - M_LotCtlExclude table.
 * Lot control exclude from table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_LotCtlExclude")
public class LotCtlExclude extends BaseEntity {

    @Id
    @Column("M_LotCtlExclude_ID")
    private Integer mLotCtlExcludeId;

    @Column("M_LotCtl_ID")
    private Integer mLotCtlId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("IsSOTrx")
    private String isSOTrx;
}
