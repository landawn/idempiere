package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * A Depreciation Table Detail entity - A_Depreciation_Table_Detail table.
 * Depreciation Table Detail.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation_Table_Detail")
public class ADepreciationTableDetail extends BaseEntity {

    @Id
    @Column("A_Depreciation_Table_Detail_ID")
    private Integer aDepreciationTableDetailId;

    @Column("A_Depreciation_Table_Header_ID")
    private Integer aDepreciationTableHeaderId;

    @Column("A_Period")
    private Integer aPeriod;

    @Column("A_Depreciation_Rate")
    private BigDecimal aDepreciationRate;
}
