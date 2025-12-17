package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * CM News Item entity - CM_NewsItem table.
 * Content Management News Item.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_NewsItem")
public class CMNewsItem extends BaseEntity {

    @Id
    @Column("CM_NewsItem_ID")
    private Integer cmNewsItemId;

    @Column("CM_NewsChannel_ID")
    private Integer cmNewsChannelId;

    @Column("Title")
    private String title;

    @Column("Description")
    private String description;

    @Column("ContentHTML")
    private String contentHtml;

    @Column("Author")
    private String author;

    @Column("Link")
    private String link;

    @Column("PubDate")
    private LocalDateTime pubDate;
}
