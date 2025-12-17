package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Print Form entity - AD_PrintForm table.
 * Print form configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PrintForm")
public class ADPrintForm extends BaseEntity {

    @Id
    @Column("AD_PrintForm_ID")
    private Integer adPrintFormId;

    @Column("Description")
    private String description;

    @Column("Distrib_Order_MailText_ID")
    private Integer distribOrderMailTextId;

    @Column("Distrib_Order_PrintFormat_ID")
    private Integer distribOrderPrintFormatId;

    @Column("Invoice_MailText_ID")
    private Integer invoiceMailTextId;

    @Column("Invoice_PrintFormat_ID")
    private Integer invoicePrintFormatId;

    @Column("Manuf_Order_MailText_ID")
    private Integer manufOrderMailTextId;

    @Column("Manuf_Order_PrintFormat_ID")
    private Integer manufOrderPrintFormatId;

    @Column("Name")
    private String name;

    @Column("Order_MailText_ID")
    private Integer orderMailTextId;

    @Column("Order_PrintFormat_ID")
    private Integer orderPrintFormatId;

    @Column("Project_MailText_ID")
    private Integer projectMailTextId;

    @Column("Project_PrintFormat_ID")
    private Integer projectPrintFormatId;

    @Column("Remittance_MailText_ID")
    private Integer remittanceMailTextId;

    @Column("Remittance_PrintFormat_ID")
    private Integer remittancePrintFormatId;

    @Column("Shipment_MailText_ID")
    private Integer shipmentMailTextId;

    @Column("Shipment_PrintFormat_ID")
    private Integer shipmentPrintFormatId;
}
