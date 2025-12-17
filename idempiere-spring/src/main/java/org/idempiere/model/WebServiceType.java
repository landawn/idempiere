package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Service Type entity - WS_WebServiceType table.
 * Web service type definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("WS_WebServiceType")
public class WebServiceType extends BaseEntity {

    @Id
    @Column("WS_WebServiceType_ID")
    private Integer wsWebServiceTypeId;

    @Column("WS_WebService_ID")
    private Integer wsWebServiceId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_Table_ID")
    private Integer adTableId;
}
