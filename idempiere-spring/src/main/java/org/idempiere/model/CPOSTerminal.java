package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * POS Terminal entity - C_POSTerminal table.
 * Point of Sale terminal definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_POSTerminal")
public class CPOSTerminal extends BaseEntity {

    @Id
    @Column("C_POSTerminal_ID")
    private Integer cPOSTerminalId;

    @Column("AutoLock")
    private String autoLock;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("C_BPartnerCashTrx_ID")
    private Integer cBPartnerCashTrxId;

    @Column("C_CashBook_ID")
    private Integer cCashBookId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("C_POSKeyLayout_ID")
    private Integer cPOSKeyLayoutId;

    @Column("CashDrawer")
    private String cashDrawer;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsModifyPrice")
    private String isModifyPrice;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("Name")
    private String name;

    @Column("PrinterName")
    private String printerName;

    @Column("SalesRep_ID")
    private Integer salesRepId;
}
