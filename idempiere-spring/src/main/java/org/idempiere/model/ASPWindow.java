package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ASP Window entity - ASP_Window table.
 * ASP window configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("ASP_Window")
public class ASPWindow extends BaseEntity {

    @Id
    @Column("ASP_Window_ID")
    private Integer aspWindowId;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("ASP_Level_ID")
    private Integer aspLevelId;

    @Column("ASP_Status")
    private String aspStatus;
}
