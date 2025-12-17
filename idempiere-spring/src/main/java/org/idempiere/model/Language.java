package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Language entity.
 * Maps to AD_Language table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Language")
public class Language extends BaseEntity {

    @Id
    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("LanguageISO")
    private String languageISO;

    @Column("CountryCode")
    private String countryCode;

    @Column("IsBaseLanguage")
    private String isBaseLanguage;

    @Column("IsSystemLanguage")
    private String isSystemLanguage;

    @Column("Processing")
    private String processing;

    @Column("IsLoginLocale")
    private String isLoginLocale;

    @Column("DatePattern")
    private String datePattern;

    @Column("TimePattern")
    private String timePattern;
}
