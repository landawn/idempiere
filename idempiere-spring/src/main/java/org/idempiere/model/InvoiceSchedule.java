package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Invoice Schedule entity - C_InvoiceSchedule table.
 * Invoice schedule configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_InvoiceSchedule")
public class InvoiceSchedule extends BaseEntity {

    @Id
    @Column("C_InvoiceSchedule_ID")
    private Integer cInvoiceScheduleId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("InvoiceFrequency")
    private String invoiceFrequency;

    @Column("InvoiceDay")
    private Integer invoiceDay;

    @Column("InvoiceDayCutoff")
    private Integer invoiceDayCutoff;

    @Column("InvoiceWeekDay")
    private String invoiceWeekDay;

    @Column("InvoiceWeekDayCutoff")
    private String invoiceWeekDayCutoff;

    @Column("IsAmount")
    private String isAmount;

    @Column("IsDefault")
    private String isDefault;

    @Column("EvenInvoiceWeek")
    private String evenInvoiceWeek;
}
