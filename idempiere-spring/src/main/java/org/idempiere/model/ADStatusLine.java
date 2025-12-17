package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Status Line entity - AD_StatusLine table.
 * Status line configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_StatusLine")
public class ADStatusLine extends BaseEntity {

    @Id
    @Column("AD_StatusLine_ID")
    private Integer adStatusLineId;

    @Column("AD_Message_ID")
    private Integer adMessageId;

    @Column("AD_Style_ID")
    private Integer adStyleId;

    @Column("EntityType")
    private String entityType;

    @Column("Name")
    private String name;

    @Column("SQLStatement")
    private String sqlStatement;
}
