package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Printer Routing entity - AD_PrinterRouting table.
 * Printer routing configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PrinterRouting")
public class PrinterRouting extends BaseEntity {

    @Id
    @Column("AD_PrinterRouting_ID")
    private Integer adPrinterRoutingId;

    @Column("AD_Printer_ID")
    private Integer adPrinterId;

    @Column("AD_PrintFormat_ID")
    private Integer adPrintFormatId;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsDirectPrint")
    private String isDirectPrint;

    @Column("SeqNo")
    private Integer seqNo;
}
