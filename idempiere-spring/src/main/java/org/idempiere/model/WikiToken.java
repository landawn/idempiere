package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Wiki Token entity - CM_WikiToken table.
 * Wiki token/macro definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_WikiToken")
public class WikiToken extends BaseEntity {

    @Id
    @Column("CM_WikiToken_ID")
    private Integer cmWikiTokenId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("TokenType")
    private String tokenType;

    @Column("MacroText")
    private String macroText;

    @Column("BarCode")
    private String barCode;

    @Column("AD_Table_ID")
    private Integer adTableId;
}
