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
 * PA Color Schema entity - PA_ColorSchema table.
 * Performance Analysis Color Schema.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_ColorSchema")
public class PAColorSchema extends BaseEntity {

    @Id
    @Column("PA_ColorSchema_ID")
    private Integer paColorSchemaId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_PrintColor1_ID")
    private Integer adPrintColor1Id;

    @Column("AD_PrintColor2_ID")
    private Integer adPrintColor2Id;

    @Column("AD_PrintColor3_ID")
    private Integer adPrintColor3Id;

    @Column("AD_PrintColor4_ID")
    private Integer adPrintColor4Id;

    @Column("Mark1Percent")
    private BigDecimal mark1Percent;

    @Column("Mark2Percent")
    private BigDecimal mark2Percent;

    @Column("Mark3Percent")
    private BigDecimal mark3Percent;

    @Column("Mark4Percent")
    private BigDecimal mark4Percent;
}
