package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Client Info entity - AD_ClientInfo table.
 * Additional client information.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ClientInfo")
public class ClientInfo extends BaseEntity {

    @Id
    @Column("AD_Client_ID")
    private Integer adClientId;

    @Column("C_Calendar_ID")
    private Integer cCalendarId;

    @Column("C_AcctSchema1_ID")
    private Integer cAcctSchema1Id;

    @Column("C_UOM_Volume_ID")
    private Integer cUomVolumeId;

    @Column("C_UOM_Weight_ID")
    private Integer cUomWeightId;

    @Column("C_UOM_Length_ID")
    private Integer cUomLengthId;

    @Column("C_UOM_Time_ID")
    private Integer cUomTimeId;

    @Column("M_ProductFreight_ID")
    private Integer mProductFreightId;

    @Column("C_BPartnerCashTrx_ID")
    private Integer cBPartnerCashTrxId;

    @Column("AD_Tree_Menu_ID")
    private Integer adTreeMenuId;

    @Column("AD_Tree_Org_ID")
    private Integer adTreeOrgId;

    @Column("AD_Tree_BPartner_ID")
    private Integer adTreeBPartnerId;

    @Column("AD_Tree_Project_ID")
    private Integer adTreeProjectId;

    @Column("AD_Tree_SalesRegion_ID")
    private Integer adTreeSalesRegionId;

    @Column("AD_Tree_Product_ID")
    private Integer adTreeProductId;

    @Column("AD_Tree_Campaign_ID")
    private Integer adTreeCampaignId;

    @Column("AD_Tree_Activity_ID")
    private Integer adTreeActivityId;

    @Column("IsDiscountLineAmt")
    private String isDiscountLineAmt;

    @Column("KeepLogDays")
    private Integer keepLogDays;

    @Column("DocumentDir")
    private String documentDir;

    @Column("Logo_ID")
    private Integer logoId;

    @Column("LogoReport_ID")
    private Integer logoReportId;

    @Column("LogoWeb_ID")
    private Integer logoWebId;
}
