package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD User Query entity - AD_UserQuery table.
 * User Query.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_UserQuery")
public class ADUserQuery extends BaseEntity {

    @Id
    @Column("AD_UserQuery_ID")
    private Integer adUserQueryId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Code")
    private String code;

    @Column("AD_Table_ID")
    private Integer adTableId;
}
