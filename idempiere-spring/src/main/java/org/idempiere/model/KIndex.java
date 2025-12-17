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
 * K Index entity - K_Index table.
 * Knowledge Index.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("K_Index")
public class KIndex extends BaseEntity {

    @Id
    @Column("K_Index_ID")
    private Integer kIndexId;

    @Column("K_Entry_ID")
    private Integer kEntryId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("Keyword")
    private String keyword;

    @Column("SourceUpdated")
    private String sourceUpdated;

    @Column("Excerpt")
    private String excerpt;

    @Column("Score")
    private BigDecimal score;
}
