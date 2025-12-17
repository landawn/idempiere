package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * R Group entity - R_Group table.
 * Request Group.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_Group")
public class RGroup extends BaseEntity {

    @Id
    @Column("R_Group_ID")
    private Integer rGroupId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("M_BOM_ID")
    private Integer mBomId;

    @Column("M_ChangeNotice_ID")
    private Integer mChangeNoticeId;
}
