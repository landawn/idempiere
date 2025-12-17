package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Label Printer entity.
 * Maps to AD_LabelPrinter table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_LabelPrinter")
public class LabelPrinter extends BaseEntity {

    @Id
    @Column("AD_LabelPrinter_ID")
    private Integer adLabelPrinterId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
