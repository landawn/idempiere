package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * News Item Translation entity - CM_NewsItem_Trl table.
 * News item translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_NewsItem_Trl")
public class NewsItemTrl extends BaseEntity {

    @Id
    @Column("CM_NewsItem_Trl_ID")
    private Integer cmNewsItemTrlId;

    @Column("CM_NewsItem_ID")
    private Integer cmNewsItemId;

    @Column("AD_Language")
    private String adLanguage;

    @Column("Title")
    private String title;

    @Column("ContentHTML")
    private String contentHtml;

    @Column("Description")
    private String description;

    @Column("IsTranslated")
    private String isTranslated;
}
