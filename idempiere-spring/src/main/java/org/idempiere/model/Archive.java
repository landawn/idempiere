package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Archive entity - archived documents.
 * Maps to AD_Archive table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Archive")
public class Archive extends BaseEntity {

    @Id
    @Column("AD_Archive_ID")
    private Integer adArchiveId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("BinaryData")
    private byte[] binaryData;

    @Column("IsReport")
    private String isReport;

    @Column("ArchivePathRoot")
    private String archivePathRoot;
}
