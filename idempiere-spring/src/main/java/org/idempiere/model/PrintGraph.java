package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Print Graph entity - AD_PrintGraph table.
 * Graph definitions for print formats.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PrintGraph")
public class PrintGraph extends BaseEntity {

    @Id
    @Column("AD_PrintGraph_ID")
    private Integer adPrintGraphId;

    @Column("AD_PrintFormat_ID")
    private Integer adPrintFormatId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("GraphType")
    private String graphType;

    @Column("Data_PrintFormatItem_ID")
    private Integer dataPrintFormatItemId;

    @Column("Data1_PrintFormatItem_ID")
    private Integer data1PrintFormatItemId;

    @Column("Data2_PrintFormatItem_ID")
    private Integer data2PrintFormatItemId;

    @Column("Data3_PrintFormatItem_ID")
    private Integer data3PrintFormatItemId;

    @Column("Data4_PrintFormatItem_ID")
    private Integer data4PrintFormatItemId;

    @Column("Description_PrintFormatItem_ID")
    private Integer descriptionPrintFormatItemId;
}
