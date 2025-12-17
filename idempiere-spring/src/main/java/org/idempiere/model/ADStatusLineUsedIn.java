package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Status Line Used In entity - AD_StatusLineUsedIn table.
 * Windows/tabs where status line is used.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_StatusLineUsedIn")
public class ADStatusLineUsedIn extends BaseEntity {

    @Id
    @Column("AD_StatusLineUsedIn_ID")
    private Integer adStatusLineUsedInId;

    @Column("AD_StatusLine_ID")
    private Integer adStatusLineId;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("IsDefault")
    private String isDefault;
}
