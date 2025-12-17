package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * K Comment entity - K_Comment table.
 * Knowledge Comment.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("K_Comment")
public class KComment extends BaseEntity {

    @Id
    @Column("K_Comment_ID")
    private Integer kCommentId;

    @Column("K_Entry_ID")
    private Integer kEntryId;

    @Column("Rating")
    private Integer rating;

    @Column("TextMsg")
    private String textMsg;

    @Column("IsPublic")
    private String isPublic;

    @Column("AD_Session_ID")
    private Integer adSessionId;
}
