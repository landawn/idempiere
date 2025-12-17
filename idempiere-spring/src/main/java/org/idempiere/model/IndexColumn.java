package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Index Column entity - AD_IndexColumn table.
 * Table index column definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_IndexColumn")
public class IndexColumn extends BaseEntity {

    @Id
    @Column("AD_IndexColumn_ID")
    private Integer adIndexColumnId;

    @Column("AD_TableIndex_ID")
    private Integer adTableIndexId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("ColumnSQL")
    private String columnSql;

    @Column("EntityType")
    private String entityType;
}
