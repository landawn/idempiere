package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Service Method entity - WS_WebServiceMethod table.
 * Web service method definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("WS_WebServiceMethod")
public class WebServiceMethod extends BaseEntity {

    @Id
    @Column("WS_WebServiceMethod_ID")
    private Integer wsWebServiceMethodId;

    @Column("WS_WebService_ID")
    private Integer wsWebServiceId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;
}
