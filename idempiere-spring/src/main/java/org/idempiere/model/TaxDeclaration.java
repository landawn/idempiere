package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * Tax Declaration entity - C_TaxDeclaration table.
 * Tax declaration header.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_TaxDeclaration")
public class TaxDeclaration extends BaseEntity {

    @Id
    @Column("C_TaxDeclaration_ID")
    private Integer cTaxDeclarationId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("DateFrom")
    private LocalDateTime dateFrom;

    @Column("DateTo")
    private LocalDateTime dateTo;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;
}
