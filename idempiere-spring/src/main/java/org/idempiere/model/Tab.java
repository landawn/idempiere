package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Window Tab entity.
 * Maps to AD_Tab table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Tab")
public class Tab extends BaseEntity {

    @Id
    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("TabLevel")
    private Integer tabLevel;

    @Column("IsSingleRow")
    private String isSingleRow;

    @Column("IsInfoTab")
    private String isInfoTab;

    @Column("IsTranslationTab")
    private String isTranslationTab;

    @Column("IsReadOnly")
    private String isReadOnly;

    @Column("HasTree")
    private String hasTree;

    @Column("WhereClause")
    private String whereClause;

    @Column("OrderByClause")
    private String orderByClause;

    @Column("CommitWarning")
    private String commitWarning;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("AD_Image_ID")
    private Integer adImageId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AD_ColumnSortOrder_ID")
    private Integer adColumnSortOrderId;

    @Column("AD_ColumnSortYesNo_ID")
    private Integer adColumnSortYesNoId;

    @Column("IsSortTab")
    private String isSortTab;

    @Column("EntityType")
    private String entityType;

    @Column("Included_Tab_ID")
    private Integer includedTabId;

    @Column("ReadOnlyLogic")
    private String readOnlyLogic;

    @Column("DisplayLogic")
    private String displayLogic;

    @Column("IsInsertRecord")
    private String isInsertRecord;

    @Column("IsAdvancedTab")
    private String isAdvancedTab;

    @Column("Parent_Column_ID")
    private Integer parentColumnId;

    @Column("IsLookupOnlySelection")
    private String isLookupOnlySelection;

    @Column("MaxQueryRecords")
    private Integer maxQueryRecords;
}
