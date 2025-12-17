package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Service Method Security entity - WS_WebService_MethodSecurity table.
 * Web service method security configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("WS_WebService_MethodSecurity")
public class WebServiceMethodSecurity extends BaseEntity {

    @Id
    @Column("WS_WebService_MethodSecurity_ID")
    private Integer wsWebServiceMethodSecurityId;

    @Column("WS_WebServiceMethod_ID")
    private Integer wsWebServiceMethodId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("IsReadWrite")
    private String isReadWrite;
}
