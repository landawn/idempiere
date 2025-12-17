package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Shipping Processor entity - M_ShippingProcessor table.
 * Integration with shipping carriers.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ShippingProcessor")
public class MShippingProcessor extends BaseEntity {

    @Id
    @Column("M_ShippingProcessor_ID")
    private Integer mShippingProcessorId;

    @Column("AD_ShipperFacade_ID")
    private Integer adShipperFacadeId;

    @Column("ConnectionKey")
    private String connectionKey;

    @Column("ConnectionPassword")
    private String connectionPassword;

    @Column("Description")
    private String description;

    @Column("HostAddress")
    private String hostAddress;

    @Column("HostPort")
    private Integer hostPort;

    @Column("Name")
    private String name;

    @Column("ProxyAddress")
    private String proxyAddress;

    @Column("ProxyLogon")
    private String proxyLogon;

    @Column("ProxyPassword")
    private String proxyPassword;

    @Column("ProxyPort")
    private Integer proxyPort;

    @Column("ServicePath")
    private String servicePath;

    @Column("TrackingURL")
    private String trackingURL;

    @Column("UserID")
    private String userId;
}
