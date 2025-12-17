package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Print Label entity - AD_PrintLabel table.
 * Print label definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PrintLabel")
public class ADPrintLabel extends BaseEntity {

    @Id
    @Column("AD_PrintLabel_ID")
    private Integer adPrintLabelId;

    @Column("AD_LabelPrinter_ID")
    private Integer adLabelPrinterId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Description")
    private String description;

    @Column("IsLandscape")
    private String isLandscape;

    @Column("LabelHeight")
    private Integer labelHeight;

    @Column("LabelWidth")
    private Integer labelWidth;

    @Column("Name")
    private String name;
}
