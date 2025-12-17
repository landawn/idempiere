package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Service Field Input entity - WS_WebServiceFieldInput table.
 * Web service input field configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("WS_WebServiceFieldInput")
public class WebServiceFieldInput extends BaseEntity {

    @Id
    @Column("WS_WebServiceFieldInput_ID")
    private Integer wsWebServiceFieldInputId;

    @Column("WS_WebServiceTypeAccess_ID")
    private Integer wsWebServiceTypeAccessId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("IdentifierLogic")
    private String identifierLogic;

    @Column("IdentifierName")
    private String identifierName;
}
