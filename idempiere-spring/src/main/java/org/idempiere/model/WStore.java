package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * W Store entity - W_Store table.
 * Web Store.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_Store")
public class WStore extends BaseEntity {

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

    @Column("WStoreEMail")
    private String wStoreEMail;

    @Column("WStoreUser")
    private String wStoreUser;

    @Column("WStoreUserPW")
    private String wStoreUserPW;

    @Column("EMailFooter")
    private String eMailFooter;

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

    @Column("StyleSheet")
    private String styleSheet;

    @Column("Stylesheet2")
    private String stylesheet2;

    @Column("WebInfo")
    private String webInfo;

    @Column("WebOrderEMail")
    private String webOrderEMail;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("C_PaymentTerm_ID")
    private Integer cPaymentTermId;

    @Column("IsMenuProducts")
    private String isMenuProducts;

    @Column("IsMenuServices")
    private String isMenuServices;

    @Column("IsMenuContact")
    private String isMenuContact;

    @Column("IsMenuInterest")
    private String isMenuInterest;

    @Column("IsMenuRegistration")
    private String isMenuRegistration;

    @Column("IsMenuRequests")
    private String isMenuRequests;

    @Column("IsMenuAssets")
    private String isMenuAssets;

    @Column("IsMenuCart")
    private String isMenuCart;
}
