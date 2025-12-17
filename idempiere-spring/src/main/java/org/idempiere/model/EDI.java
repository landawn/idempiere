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
 * EDI entity - C_EDI table.
 * Electronic Data Interchange document.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_EDI")
public class EDI extends BaseEntity {

    @Id
    @Column("C_EDI_ID")
    private Integer cEdiId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("EDIType")
    private String ediType;

    @Column("EDIStatus")
    private String ediStatus;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("Sender")
    private String sender;

    @Column("Recipient")
    private String recipient;

    @Column("EDI_ExportFormat_ID")
    private Integer ediExportFormatId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("DateSent")
    private LocalDateTime dateSent;

    @Column("DateReceived")
    private LocalDateTime dateReceived;

    @Column("Line")
    private String line;

    @Column("Description")
    private String description;

    @Column("Processed")
    private String processed;
}
