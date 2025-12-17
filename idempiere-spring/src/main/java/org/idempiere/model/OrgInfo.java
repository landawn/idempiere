package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Organization Info entity - AD_OrgInfo table.
 * Additional organization information.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_OrgInfo")
public class OrgInfo extends BaseEntity {

    @Id
    @Column("AD_Org_ID")
    private Integer adOrgId;

    @Column("C_Location_ID")
    private Integer cLocationId;

    @Column("Duns")
    private String duns;

    @Column("TaxID")
    private String taxID;

    @Column("C_Calendar_ID")
    private Integer cCalendarId;

    @Column("DropShip_Warehouse_ID")
    private Integer dropShipWarehouseId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("TransferBank_ID")
    private Integer transferBankId;

    @Column("TransferCashBook_ID")
    private Integer transferCashBookId;

    @Column("Parent_Org_ID")
    private Integer parentOrgId;

    @Column("Supervisor_ID")
    private Integer supervisorId;

    @Column("Logo_ID")
    private Integer logoId;

    @Column("LogoReport_ID")
    private Integer logoReportId;

    @Column("LogoWeb_ID")
    private Integer logoWebId;

    @Column("Receipt_Footer_Msg")
    private String receiptFooterMsg;

    @Column("EMail")
    private String eMail;

    @Column("Fax")
    private String fax;

    @Column("Phone")
    private String phone;

    @Column("Phone2")
    private String phone2;
}
