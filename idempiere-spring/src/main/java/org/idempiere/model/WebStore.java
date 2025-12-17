package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Store entity.
 * Maps to W_Store table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_Store")
public class WebStore extends BaseEntity {

    @Id
    @Column("W_Store_ID")
    private Integer wStoreId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("URL")
    private String url;

    @Column("WebContext")
    private String webContext;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsMenuAssets")
    private String isMenuAssets;

    @Column("IsMenuContact")
    private String isMenuContact;

    @Column("IsMenuInterests")
    private String isMenuInterests;

    @Column("IsMenuInvoices")
    private String isMenuInvoices;

    @Column("IsMenuOrders")
    private String isMenuOrders;

    @Column("IsMenuPayments")
    private String isMenuPayments;

    @Column("IsMenuRegistrations")
    private String isMenuRegistrations;

    @Column("IsMenuRequests")
    private String isMenuRequests;

    @Column("IsMenuRfQs")
    private String isMenuRfQs;

    @Column("IsMenuShipments")
    private String isMenuShipments;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("C_PaymentTerm_ID")
    private Integer cPaymentTermId;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("EMailFrom")
    private String emailFrom;

    @Column("EMail")
    private String email;

    @Column("WStoreUser")
    private String wStoreUser;

    @Column("WStoreUserPW")
    private String wStoreUserPw;

    @Column("Stylesheet")
    private String stylesheet;

    @Column("WebParam1")
    private String webParam1;

    @Column("WebParam2")
    private String webParam2;

    @Column("WebParam3")
    private String webParam3;

    @Column("WebParam4")
    private String webParam4;

    @Column("WebParam5")
    private String webParam5;

    @Column("WebParam6")
    private String webParam6;

    @Column("WebInfo")
    private String webInfo;

    @Column("WebOrderEMail")
    private String webOrderEMail;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;
}
