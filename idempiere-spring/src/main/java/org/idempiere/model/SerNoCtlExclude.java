package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Serial Number Control Exclude entity - M_SerNoCtlExclude table.
 * Serial number control exclude from table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_SerNoCtlExclude")
public class SerNoCtlExclude extends BaseEntity {

    @Id
    @Column("M_SerNoCtlExclude_ID")
    private Integer mSerNoCtlExcludeId;

    @Column("M_SerNoCtl_ID")
    private Integer mSerNoCtlId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("IsSOTrx")
    private String isSOTrx;
}
