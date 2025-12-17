package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * POS Seller entity - C_POSSeller table.
 * POS seller/cashier assignment.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_POSSeller")
public class CPOSSeller extends BaseEntity {

    @Id
    @Column("C_POSSeller_ID")
    private Integer cPOSSellerId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("C_POSTerminal_ID")
    private Integer cPOSTerminalId;

    @Column("PIN")
    private String pin;
}
