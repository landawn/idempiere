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
 * A Asset Reval Index entity - A_Asset_Reval_Index table.
 * Asset Revaluation Index.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Reval_Index")
public class AAssetRevalIndex extends BaseEntity {

    @Id
    @Column("A_Asset_Reval_Index_ID")
    private Integer aAssetRevalIndexId;

    @Column("A_Reval_Code")
    private String aRevalCode;

    @Column("A_Reval_Multiplier")
    private String aRevalMultiplier;

    @Column("A_Reval_Rate")
    private BigDecimal aRevalRate;

    @Column("A_Effective_Date")
    private String aEffectiveDate;
}
