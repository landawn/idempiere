package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * User Defined Tab entity.
 * Maps to AD_UserDef_Tab table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_UserDef_Tab")
public class UserDefTab extends BaseEntity {

    @Id
    @Column("AD_UserDef_Tab_ID")
    private Integer adUserDefTabId;

    @Column("AD_UserDef_Win_ID")
    private Integer adUserDefWinId;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsSingleRow")
    private String isSingleRow;

    @Column("IsReadOnly")
    private String isReadOnly;

    @Column("IsInsertRecord")
    private String isInsertRecord;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("TabLevel")
    private Integer tabLevel;

    @Column("IsDisplayed")
    private String isDisplayed;

    @Column("ReadOnlyLogic")
    private String readOnlyLogic;

    @Column("DisplayLogic")
    private String displayLogic;

    @Column("OrderByClause")
    private String orderByClause;

    @Column("MaxQueryRecords")
    private Integer maxQueryRecords;
}
