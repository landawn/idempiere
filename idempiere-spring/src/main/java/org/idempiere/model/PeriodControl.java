package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Period Control entity - controls period status by document type.
 * Maps to C_PeriodControl table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_PeriodControl")
public class PeriodControl extends BaseEntity {

    @Id
    @Column("C_PeriodControl_ID")
    private Integer cPeriodControlId;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("DocBaseType")
    private String docBaseType;

    @Column("PeriodStatus")
    private String periodStatus;

    @Column("PeriodAction")
    private String periodAction;

    @Column("Processing")
    private String processing;
}
