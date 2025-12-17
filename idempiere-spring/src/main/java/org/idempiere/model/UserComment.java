package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * User Comment entity - AD_UserComment table.
 * User comment on records.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_UserComment")
public class UserComment extends BaseEntity {

    @Id
    @Column("AD_UserComment_ID")
    private Integer adUserCommentId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("Comments")
    private String comments;
}
