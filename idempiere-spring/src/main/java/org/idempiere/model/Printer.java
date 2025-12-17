package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Printer entity - AD_Printer table.
 * Printer configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Printer")
public class Printer extends BaseEntity {

    @Id
    @Column("AD_Printer_ID")
    private Integer adPrinterId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("PrinterName")
    private String printerName;

    @Column("IsDefault")
    private String isDefault;
}
