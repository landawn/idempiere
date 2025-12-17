package org.idempiere.config;

import javax.sql.DataSource;

import org.idempiere.dao.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.landawn.abacus.jdbc.Jdbc;

/**
 * Configuration class for DAO beans.
 * Creates DAO instances using Abacus JDBC.
 */
@Configuration
public class DaoConfig {

    private final DataSource dataSource;

    public DaoConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // ==================== Core DAOs ====================

    @Bean
    public ClientDao clientDao() {
        return Jdbc.createDao(ClientDao.class, dataSource);
    }

    @Bean
    public OrganizationDao organizationDao() {
        return Jdbc.createDao(OrganizationDao.class, dataSource);
    }

    @Bean
    public UserDao userDao() {
        return Jdbc.createDao(UserDao.class, dataSource);
    }

    @Bean
    public BPartnerDao bPartnerDao() {
        return Jdbc.createDao(BPartnerDao.class, dataSource);
    }

    @Bean
    public ProductDao productDao() {
        return Jdbc.createDao(ProductDao.class, dataSource);
    }

    // ==================== Order DAOs ====================

    @Bean
    public OrderDao orderDao() {
        return Jdbc.createDao(OrderDao.class, dataSource);
    }

    @Bean
    public OrderLineDao orderLineDao() {
        return Jdbc.createDao(OrderLineDao.class, dataSource);
    }

    // ==================== Invoice DAOs ====================

    @Bean
    public InvoiceDao invoiceDao() {
        return Jdbc.createDao(InvoiceDao.class, dataSource);
    }

    @Bean
    public InvoiceLineDao invoiceLineDao() {
        return Jdbc.createDao(InvoiceLineDao.class, dataSource);
    }

    // ==================== Payment DAOs ====================

    @Bean
    public PaymentDao paymentDao() {
        return Jdbc.createDao(PaymentDao.class, dataSource);
    }

    // ==================== Accounting DAOs ====================

    @Bean
    public AcctSchemaDao acctSchemaDao() {
        return Jdbc.createDao(AcctSchemaDao.class, dataSource);
    }

    @Bean
    public ElementValueDao elementValueDao() {
        return Jdbc.createDao(ElementValueDao.class, dataSource);
    }

    @Bean
    public JournalDao journalDao() {
        return Jdbc.createDao(JournalDao.class, dataSource);
    }

    @Bean
    public JournalLineDao journalLineDao() {
        return Jdbc.createDao(JournalLineDao.class, dataSource);
    }

    @Bean
    public CurrencyDao currencyDao() {
        return Jdbc.createDao(CurrencyDao.class, dataSource);
    }

    // ==================== Banking DAOs ====================

    @Bean
    public BankDao bankDao() {
        return Jdbc.createDao(BankDao.class, dataSource);
    }

    @Bean
    public BankAccountDao bankAccountDao() {
        return Jdbc.createDao(BankAccountDao.class, dataSource);
    }

    // ==================== Inventory DAOs ====================

    @Bean
    public WarehouseDao warehouseDao() {
        return Jdbc.createDao(WarehouseDao.class, dataSource);
    }

    @Bean
    public InOutDao inOutDao() {
        return Jdbc.createDao(InOutDao.class, dataSource);
    }

    // ==================== Tax DAOs ====================

    @Bean
    public TaxDao taxDao() {
        return Jdbc.createDao(TaxDao.class, dataSource);
    }

    // ==================== Project DAOs ====================

    @Bean
    public ProjectDao projectDao() {
        return Jdbc.createDao(ProjectDao.class, dataSource);
    }
}
