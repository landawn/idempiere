package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Print Header/Footer entity - AD_PrintHeaderFooter table.
 * Print header and footer configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PrintHeaderFooter")
public class ADPrintHeaderFooter extends BaseEntity {

    @Id
    @Column("AD_PrintHeaderFooter_ID")
    private Integer adPrintHeaderFooterId;

    @Column("AD_PrintFormat_ID")
    private Integer adPrintFormatId;

    @Column("HeaderLeft")
    private String headerLeft;

    @Column("HeaderCenter")
    private String headerCenter;

    @Column("HeaderRight")
    private String headerRight;

    @Column("FooterLeft")
    private String footerLeft;

    @Column("FooterCenter")
    private String footerCenter;

    @Column("FooterRight")
    private String footerRight;

    @Column("IsFirstPage")
    private String isFirstPage;

    @Column("IsLastPage")
    private String isLastPage;

    @Column("IsDefault")
    private String isDefault;

    @Column("Name")
    private String name;

    @Column("SeqNo")
    private Integer seqNo;
}
