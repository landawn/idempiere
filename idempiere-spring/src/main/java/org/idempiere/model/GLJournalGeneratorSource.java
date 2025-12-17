package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * GL Journal Generator Source entity - GL_JournalGeneratorSource table.
 * Source definition for GL journal generator.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("GL_JournalGeneratorSource")
public class GLJournalGeneratorSource extends BaseEntity {

    @Id
    @Column("GL_JournalGeneratorSource_ID")
    private Integer glJournalGeneratorSourceId;

    @Column("GL_JournalGenerator_ID")
    private Integer glJournalGeneratorId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("ColumnSQL")
    private String columnSQL;

    @Column("Description")
    private String description;

    @Column("FromClause")
    private String fromClause;

    @Column("Name")
    private String name;

    @Column("OrderByClause")
    private String orderByClause;

    @Column("WhereClause")
    private String whereClause;
}
