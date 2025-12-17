package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Mail Text Translation entity - R_MailText_Trl table.
 * Mail text translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_MailText_Trl")
public class MailTextTrl extends BaseEntity {

    @Id
    @Column("R_MailText_ID")
    private Integer rMailTextId;

    @Id
    @Column("AD_Language")
    private String adLanguage;

    @Column("MailHeader")
    private String mailHeader;

    @Column("MailText")
    private String mailText;

    @Column("MailText2")
    private String mailText2;

    @Column("MailText3")
    private String mailText3;

    @Column("IsTranslated")
    private String isTranslated;
}
