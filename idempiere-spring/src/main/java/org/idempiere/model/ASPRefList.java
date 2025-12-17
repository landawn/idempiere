package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ASP Ref List entity - ASP_Ref_List table.
 * ASP reference list configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("ASP_Ref_List")
public class ASPRefList extends BaseEntity {

    @Id
    @Column("ASP_Ref_List_ID")
    private Integer aspRefListId;

    @Column("AD_Ref_List_ID")
    private Integer adRefListId;

    @Column("ASP_Level_ID")
    private Integer aspLevelId;

    @Column("ASP_Status")
    private String aspStatus;
}
