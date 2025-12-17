package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Style Line entity - AD_StyleLine table.
 * UI style line definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_StyleLine")
public class StyleLine extends BaseEntity {

    @Id
    @Column("AD_StyleLine_ID")
    private Integer adStyleLineId;

    @Column("AD_Style_ID")
    private Integer adStyleId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("InlineStyle")
    private String inlineStyle;

    @Column("AD_Val_Rule_ID")
    private Integer adValRuleId;
}
