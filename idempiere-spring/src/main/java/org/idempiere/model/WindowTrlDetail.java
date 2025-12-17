package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Window Translation Detail entity - AD_Window_Trl table.
 * Window translation detail.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Window_Trl")
public class WindowTrlDetail extends BaseEntity {

    @Id
    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Id
    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsTranslated")
    private String isTranslated;
}
