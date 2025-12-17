package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ASP Tab entity - ASP_Tab table.
 * ASP tab configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("ASP_Tab")
public class ASPTab extends BaseEntity {

    @Id
    @Column("ASP_Tab_ID")
    private Integer aspTabId;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("ASP_Window_ID")
    private Integer aspWindowId;

    @Column("ASP_Status")
    private String aspStatus;

    @Column("AllFields")
    private String allFields;

    @Column("Processing")
    private String processing;
}
