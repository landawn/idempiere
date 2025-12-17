package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Business Partner Withholding entity - C_BP_Withholding table.
 * Business partner withholding tax configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BP_Withholding")
public class BPartnerWithholding extends BaseEntity {

    @Id
    @Column("C_BP_Withholding_ID")
    private Integer cBpWithholdingId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Withholding_ID")
    private Integer cWithholdingId;

    @Column("IsTemporaryExempt")
    private String isTemporaryExempt;

    @Column("ExemptReason")
    private String exemptReason;

    @Column("IsMandatoryWithholding")
    private String isMandatoryWithholding;
}
