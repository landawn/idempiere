package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * GL Journal Generator entity - GL_JournalGenerator table.
 * Generator for automatic GL journal entries.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("GL_JournalGenerator")
public class GLJournalGenerator extends BaseEntity {

    @Id
    @Column("GL_JournalGenerator_ID")
    private Integer glJournalGeneratorId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("Description")
    private String description;

    @Column("GL_Category_ID")
    private Integer glCategoryId;

    @Column("Help")
    private String help;

    @Column("Name")
    private String name;

    @Column("PostingType")
    private String postingType;
}
