package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ASP Form entity - ASP_Form table.
 * ASP form configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("ASP_Form")
public class ASPForm extends BaseEntity {

    @Id
    @Column("ASP_Form_ID")
    private Integer aspFormId;

    @Column("AD_Form_ID")
    private Integer adFormId;

    @Column("ASP_Level_ID")
    private Integer aspLevelId;

    @Column("ASP_Status")
    private String aspStatus;
}
