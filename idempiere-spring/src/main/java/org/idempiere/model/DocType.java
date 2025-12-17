package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Document Type entity.
 * Maps to C_DocType table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_DocType")
public class DocType extends BaseEntity {

    @Id
    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("PrintName")
    private String printName;

    @Column("DocBaseType")
    private String docBaseType;

    @Column("DocSubTypeSO")
    private String docSubTypeSO;

    @Column("IsDocNoControlled")
    private String isDocNoControlled;

    @Column("DocNoSequence_ID")
    private Integer docNoSequenceId;

    @Column("GL_Category_ID")
    private Integer glCategoryId;

    @Column("HasCharges")
    private String hasCharges;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsDefaultCounterDoc")
    private String isDefaultCounterDoc;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("HasProforma")
    private String hasProforma;

    @Column("IsPickQAConfirm")
    private String isPickQAConfirm;

    @Column("IsShipConfirm")
    private String isShipConfirm;

    @Column("IsSplitWhenDifference")
    private String isSplitWhenDifference;

    @Column("IsCreateCounter")
    private String isCreateCounter;

    @Column("IsIndexed")
    private String isIndexed;

    @Column("IsInTransit")
    private String isInTransit;

    @Column("IsOverwriteDateOnComplete")
    private String isOverwriteDateOnComplete;

    @Column("IsOverwriteSeqOnComplete")
    private String isOverwriteSeqOnComplete;

    @Column("IsPrepareSplitDocument")
    private String isPrepareSplitDocument;

    @Column("C_DocTypeDifference_ID")
    private Integer cDocTypeDifferenceId;

    @Column("C_DocTypeProforma_ID")
    private Integer cDocTypeProformaId;

    @Column("C_DocTypeShipment_ID")
    private Integer cDocTypeShipmentId;

    @Column("C_DocTypeInvoice_ID")
    private Integer cDocTypeInvoiceId;

    @Column("DefiniteSequence_ID")
    private Integer definiteSequenceId;
}
