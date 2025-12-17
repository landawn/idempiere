package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ASP Field entity - ASP_Field table.
 * ASP field configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("ASP_Field")
public class ASPField extends BaseEntity {

    @Id
    @Column("ASP_Field_ID")
    private Integer aspFieldId;

    @Column("AD_Field_ID")
    private Integer adFieldId;

    @Column("ASP_Tab_ID")
    private Integer aspTabId;

    @Column("ASP_Status")
    private String aspStatus;
}
