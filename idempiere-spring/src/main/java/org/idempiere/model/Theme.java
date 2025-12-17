package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Theme entity - AD_Theme table.
 * UI theme definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Theme")
public class Theme extends BaseEntity {

    @Id
    @Column("AD_Theme_ID")
    private Integer adThemeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("ThemeStyle")
    private String themeStyle;

    @Column("IsDefault")
    private String isDefault;
}
