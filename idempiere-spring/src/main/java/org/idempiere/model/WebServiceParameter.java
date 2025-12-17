package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Service Parameter entity - WS_WebService_Para table.
 * Web service parameter definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("WS_WebService_Para")
public class WebServiceParameter extends BaseEntity {

    @Id
    @Column("WS_WebService_Para_ID")
    private Integer wsWebServiceParaId;

    @Column("WS_WebServiceType_ID")
    private Integer wsWebServiceTypeId;

    @Column("ParameterName")
    private String parameterName;

    @Column("ParameterType")
    private String parameterType;

    @Column("ConstantValue")
    private String constantValue;

    @Column("SeqNo")
    private Integer seqNo;
}
