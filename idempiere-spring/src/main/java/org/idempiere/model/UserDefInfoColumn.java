package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * User Defined Info Column entity - AD_UserDef_InfoColumn table.
 * User-defined info window column customization.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_UserDef_InfoColumn")
public class UserDefInfoColumn extends BaseEntity {

    @Id
    @Column("AD_UserDef_InfoColumn_ID")
    private Integer adUserDefInfoColumnId;

    @Column("AD_UserDef_Info_ID")
    private Integer adUserDefInfoId;

    @Column("AD_InfoColumn_ID")
    private Integer adInfoColumnId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("SortNo")
    private Integer sortNo;

    @Column("IsDisplayed")
    private String isDisplayed;

    @Column("IsQueryCriteria")
    private String isQueryCriteria;

    @Column("QueryOperator")
    private String queryOperator;
}
