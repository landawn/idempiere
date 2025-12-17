package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Dunning Level Translation entity - C_DunningLevel_Trl table.
 * Dunning level translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_DunningLevel_Trl")
public class DunningLevelTrl extends BaseEntity {

    @Id
    @Column("C_DunningLevel_ID")
    private Integer cDunningLevelId;

    @Id
    @Column("AD_Language")
    private String adLanguage;

    @Column("PrintName")
    private String printName;

    @Column("Note")
    private String note;

    @Column("IsTranslated")
    private String isTranslated;
}
