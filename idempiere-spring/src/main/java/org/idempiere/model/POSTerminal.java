package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * POS Terminal entity.
 * Maps to C_POS table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_POS")
public class POSTerminal extends BaseEntity {

    @Id
    @Column("C_POS_ID")
    private Integer cPosId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("C_CashBook_ID")
    private Integer cCashBookId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("IsModifyPrice")
    private String isModifyPrice;

    @Column("PrinterName")
    private String printerName;

    @Column("AutoLogoutDelay")
    private Integer autoLogoutDelay;

    @Column("TicketClassName")
    private String ticketClassName;

    @Column("TicketPrinterName")
    private String ticketPrinterName;

    @Column("CashDrawer")
    private String cashDrawer;

    @Column("OSNPDocType_ID")
    private Integer osnpDocTypeId;
}
