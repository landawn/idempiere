package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Document Type Translation entity - C_DocType_Trl table.
 * Document type translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_DocType_Trl")
public class DocTypeTrl extends BaseEntity {

    @Id
    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Id
    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("PrintName")
    private String printName;

    @Column("DocumentNote")
    private String documentNote;

    @Column("IsTranslated")
    private String isTranslated;
}
