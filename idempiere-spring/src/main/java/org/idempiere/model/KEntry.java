package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * K Entry entity - K_Entry table.
 * Knowledge Entry.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("K_Entry")
public class KEntry extends BaseEntity {

    @Id
    @Column("K_Entry_ID")
    private Integer kEntryId;

    @Column("K_Topic_ID")
    private Integer kTopicId;

    @Column("K_Source_ID")
    private Integer kSourceId;

    @Column("Name")
    private String name;

    @Column("Keywords")
    private String keywords;

    @Column("TextMsg")
    private String textMsg;

    @Column("DescriptionURL")
    private String descriptionUrl;

    @Column("Rating")
    private Integer rating;

    @Column("IsPublic")
    private String isPublic;

    @Column("ValidTo")
    private LocalDateTime validTo;

    @Column("AD_Session_ID")
    private Integer adSessionId;
}
