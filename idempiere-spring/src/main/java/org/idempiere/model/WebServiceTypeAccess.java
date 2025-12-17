package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Service Type Access entity - WS_WebServiceTypeAccess table.
 * Web service type access by role.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("WS_WebServiceTypeAccess")
public class WebServiceTypeAccess extends BaseEntity {

    @Id
    @Column("WS_WebServiceType_ID")
    private Integer wsWebServiceTypeId;

    @Id
    @Column("AD_Role_ID")
    private Integer adRoleId;
}
