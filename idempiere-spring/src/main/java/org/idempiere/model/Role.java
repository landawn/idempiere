package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Role entity - security role.
 * Maps to AD_Role table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Role")
public class Role extends BaseEntity {

    @Id
    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("UserLevel")
    private String userLevel;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("AmtApproval")
    private BigDecimal amtApproval;

    @Column("IsCanReport")
    private String isCanReport;

    @Column("IsCanExport")
    private String isCanExport;

    @Column("IsPersonalLock")
    private String isPersonalLock;

    @Column("IsPersonalAccess")
    private String isPersonalAccess;

    @Column("IsCanApproveOwnDoc")
    private String isCanApproveOwnDoc;

    @Column("IsAccessAllOrgs")
    private String isAccessAllOrgs;

    @Column("IsChangeLog")
    private String isChangeLog;

    @Column("PreferenceType")
    private String preferenceType;

    @Column("IsShowAcct")
    private String isShowAcct;

    @Column("IsManual")
    private String isManual;

    @Column("IsUseUserOrgAccess")
    private String isUseUserOrgAccess;

    @Column("MaxQueryRecords")
    private Integer maxQueryRecords;

    @Column("ConfirmQueryRecords")
    private Integer confirmQueryRecords;

    @Column("ConnectionProfile")
    private String connectionProfile;

    @Column("Allow_Info_Account")
    private String allowInfoAccount;

    @Column("Allow_Info_Asset")
    private String allowInfoAsset;

    @Column("Allow_Info_BPartner")
    private String allowInfoBPartner;

    @Column("Allow_Info_CashJournal")
    private String allowInfoCashJournal;

    @Column("Allow_Info_InOut")
    private String allowInfoInOut;

    @Column("Allow_Info_Invoice")
    private String allowInfoInvoice;

    @Column("Allow_Info_Order")
    private String allowInfoOrder;

    @Column("Allow_Info_Payment")
    private String allowInfoPayment;

    @Column("Allow_Info_Product")
    private String allowInfoProduct;

    @Column("Allow_Info_Resource")
    private String allowInfoResource;

    @Column("Allow_Info_Schedule")
    private String allowInfoSchedule;

    @Column("IsDiscountUpToLimitPrice")
    private String isDiscountUpToLimitPrice;

    @Column("IsDiscountAllowedOnTotal")
    private String isDiscountAllowedOnTotal;

    @Column("OverwritePriceLimit")
    private String overwritePriceLimit;

    @Column("IsMasterRole")
    private String isMasterRole;

    @Column("AD_Tree_Menu_ID")
    private Integer adTreeMenuId;

    @Column("AD_Tree_Org_ID")
    private Integer adTreeOrgId;
}
