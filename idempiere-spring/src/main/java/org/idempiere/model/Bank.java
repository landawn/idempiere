package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Bank entity - bank definitions.
 * Maps to C_Bank table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Bank")
public class Bank extends BaseEntity {

    @Id
    @Column("C_Bank_ID")
    private Integer cBankId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("RoutingNo")
    private String routingNo;

    @Column("SwiftCode")
    private String swiftCode;

    @Column("IsOwnBank")
    private String isOwnBank;

    @Column("C_Location_ID")
    private Integer cLocationId;
}
