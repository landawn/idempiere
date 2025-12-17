package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * BPartner EDI entity - C_BP_EDI table.
 * Business Partner EDI.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BP_EDI")
public class BPartnerEDI extends BaseEntity {

    @Id
    @Column("C_BP_EDI_ID")
    private Integer cBpEdiId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("SenderId")
    private String senderId;

    @Column("SendingFormat")
    private String sendingFormat;

    @Column("SendingDirectory")
    private String sendingDirectory;

    @Column("ReceiverId")
    private String receiverId;

    @Column("ReceivingFormat")
    private String receivingFormat;

    @Column("ReceivingDirectory")
    private String receivingDirectory;

    @Column("AD_Sequence_ID")
    private Integer adSequenceId;

    @Column("CustomerId")
    private String customerId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;
}
