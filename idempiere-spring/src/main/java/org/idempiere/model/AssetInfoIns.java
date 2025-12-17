package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Asset Info Insurance entity - A_Asset_Info_Ins table.
 * Asset insurance information.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Info_Ins")
public class AssetInfoIns extends BaseEntity {

    @Id
    @Column("A_Asset_Info_Ins_ID")
    private Integer aAssetInfoInsId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("A_Ins_Premium")
    private BigDecimal aInsPremium;

    @Column("A_Ins_Value")
    private BigDecimal aInsValue;

    @Column("A_Policy_No")
    private String aPolicyNo;

    @Column("A_Renewal_Date")
    private LocalDateTime aRenewalDate;

    @Column("A_Replace_Cost")
    private BigDecimal aReplaceCost;

    @Column("A_Insurance_Co")
    private String aInsuranceCo;

    @Column("TextMsg")
    private String textMsg;
}
