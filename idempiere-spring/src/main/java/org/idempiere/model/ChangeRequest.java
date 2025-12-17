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
 * Change Request entity - AD_ChangeRequest table.
 * BOM change request.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ChangeRequest")
public class ChangeRequest extends BaseEntity {

    @Id
    @Column("AD_ChangeRequest_ID")
    private Integer adChangeRequestId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("PP_Product_BOM_ID")
    private Integer ppProductBOMId;

    @Column("M_ChangeNotice_ID")
    private Integer mChangeNoticeId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("IsApproved")
    private String isApproved;

    @Column("Processed")
    private String processed;

    @Column("DateApproved")
    private LocalDateTime dateApproved;
}
