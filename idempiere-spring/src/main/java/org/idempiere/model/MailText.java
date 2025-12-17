package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Mail Text entity - email templates.
 * Maps to R_MailText table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_MailText")
public class MailText extends BaseEntity {

    @Id
    @Column("R_MailText_ID")
    private Integer rMailTextId;

    @Column("Name")
    private String name;

    @Column("MailHeader")
    private String mailHeader;

    @Column("MailText")
    private String mailText;

    @Column("MailText2")
    private String mailText2;

    @Column("MailText3")
    private String mailText3;

    @Column("IsHtml")
    private String isHtml;
}
