package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Search Definition entity - AD_SearchDefinition table.
 * Global search definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_SearchDefinition")
public class SearchDefinition extends BaseEntity {

    @Id
    @Column("AD_SearchDefinition_ID")
    private Integer adSearchDefinitionId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("SearchType")
    private String searchType;

    @Column("Query")
    private String query;

    @Column("TransactionCode")
    private String transactionCode;

    @Column("DataType")
    private String dataType;
}
