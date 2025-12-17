package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tab Translation entity - AD_Tab_Trl table.
 * Tab translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Tab_Trl")
public class TabTrl extends BaseEntity {

    @Id
    @Column("AD_Tab_Trl_ID")
    private Integer adTabTrlId;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("CommitWarning")
    private String commitWarning;

    @Column("IsTranslated")
    private String isTranslated;
}
