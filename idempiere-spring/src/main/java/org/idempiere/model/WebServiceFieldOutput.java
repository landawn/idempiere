package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Service Field Output entity - WS_WebServiceFieldOutput table.
 * Web service output field configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("WS_WebServiceFieldOutput")
public class WebServiceFieldOutput extends BaseEntity {

    @Id
    @Column("WS_WebServiceFieldOutput_ID")
    private Integer wsWebServiceFieldOutputId;

    @Column("WS_WebServiceTypeAccess_ID")
    private Integer wsWebServiceTypeAccessId;

    @Column("AD_Column_ID")
    private Integer adColumnId;
}
