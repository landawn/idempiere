package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Performance Analysis Document Status entity - PA_DocumentStatus table.
 * Document status for dashboard widget.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_DocumentStatus")
public class PADocumentStatus extends BaseEntity {

    @Id
    @Column("PA_DocumentStatus_ID")
    private Integer paDocumentStatusId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("Description")
    private String description;

    @Column("Name")
    private String name;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("WhereClause")
    private String whereClause;
}
