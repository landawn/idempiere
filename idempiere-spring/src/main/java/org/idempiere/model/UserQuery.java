package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * User Query entity - AD_UserQuery table.
 * User saved query definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_UserQuery")
public class UserQuery extends BaseEntity {

    @Id
    @Column("AD_UserQuery_ID")
    private Integer adUserQueryId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Code")
    private String code;
}
