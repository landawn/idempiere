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
 * Asset Info License entity - A_Asset_Info_Lic table.
 * Asset license information.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Info_Lic")
public class AssetInfoLic extends BaseEntity {

    @Id
    @Column("A_Asset_Info_Lic_ID")
    private Integer aAssetInfoLicId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("A_License_No")
    private String aLicenseNo;

    @Column("A_License_Fee")
    private BigDecimal aLicenseFee;

    @Column("A_Issuing_Agency")
    private String aIssuingAgency;

    @Column("A_License_Date")
    private LocalDateTime aLicenseDate;

    @Column("A_License_Exp")
    private LocalDateTime aLicenseExp;

    @Column("TextMsg")
    private String textMsg;
}
