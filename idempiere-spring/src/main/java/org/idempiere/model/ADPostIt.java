package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Post-it entity - AD_PostIt table.
 * Post-it note attached to a record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PostIt")
public class ADPostIt extends BaseEntity {

    @Id
    @Column("AD_PostIt_ID")
    private Integer adPostItId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("Record_UU")
    private String recordUu;

    @Column("Text")
    private String text;
}
