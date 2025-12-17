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

    // ==================== Administration DAOs ====================

    @Bean
    public WindowDao windowDao() {
        return Jdbc.createDao(WindowDao.class, dataSource);
    }

    @Bean
    public RoleDao roleDao() {
        return Jdbc.createDao(RoleDao.class, dataSource);
    }

    @Bean
    public WorkflowDao workflowDao() {
        return Jdbc.createDao(WorkflowDao.class, dataSource);
    }

    // ==================== Manufacturing DAOs ====================

    @Bean
    public PPOrderDao ppOrderDao() {
        return Jdbc.createDao(PPOrderDao.class, dataSource);
    }

    // ==================== HR DAOs ====================

    @Bean
    public HREmployeeDao hrEmployeeDao() {
        return Jdbc.createDao(HREmployeeDao.class, dataSource);
    }

    // ==================== Commission/Dunning DAOs ====================

    @Bean
    public CommissionDao commissionDao() {
        return Jdbc.createDao(CommissionDao.class, dataSource);
    }

    @Bean
    public DunningDao dunningDao() {
        return Jdbc.createDao(DunningDao.class, dataSource);
    }

    // ==================== Distribution DAOs ====================

    @Bean
    public DDOrderDao ddOrderDao() {
        return Jdbc.createDao(DDOrderDao.class, dataSource);
    }

    @Bean
    public DistributionListDao distributionListDao() {
        return Jdbc.createDao(DistributionListDao.class, dataSource);
    }

    // ==================== Smart Browse DAOs ====================

    @Bean
    public BrowseDao browseDao() {
        return Jdbc.createDao(BrowseDao.class, dataSource);
    }

    @Bean
    public ChartDao chartDao() {
        return Jdbc.createDao(ChartDao.class, dataSource);
    }

    // ==================== Document Type DAOs ====================

    @Bean
    public DocTypeDao docTypeDao() {
        return Jdbc.createDao(DocTypeDao.class, dataSource);
    }

    // ==================== RfQ DAOs ====================

    @Bean
    public RfQDao rfQDao() {
        return Jdbc.createDao(RfQDao.class, dataSource);
    }

    // ==================== Asset DAOs ====================

    @Bean
    public AssetDao assetDao() {
        return Jdbc.createDao(AssetDao.class, dataSource);
    }

    // ==================== Recurring DAOs ====================

    @Bean
    public RecurringDao recurringDao() {
        return Jdbc.createDao(RecurringDao.class, dataSource);
    }

    // ==================== Accounting Schema DAOs ====================

    @Bean
    public AcctSchemaElementDao acctSchemaElementDao() {
        return Jdbc.createDao(AcctSchemaElementDao.class, dataSource);
    }

    // ==================== Promotion DAOs ====================

    @Bean
    public PromotionDao promotionDao() {
        return Jdbc.createDao(PromotionDao.class, dataSource);
    }

    // ==================== Web Store DAOs ====================

    @Bean
    public WebStoreDao webStoreDao() {
        return Jdbc.createDao(WebStoreDao.class, dataSource);
    }

    // ==================== Alert DAOs ====================

    @Bean
    public AlertDao alertDao() {
        return Jdbc.createDao(AlertDao.class, dataSource);
    }

    // ==================== Import Format DAOs ====================

    @Bean
    public ImportFormatDao importFormatDao() {
        return Jdbc.createDao(ImportFormatDao.class, dataSource);
    }

    // ==================== Request DAOs ====================

    @Bean
    public RequestDao requestDao() {
        return Jdbc.createDao(RequestDao.class, dataSource);
    }

    @Bean
    public RequestTypeDao requestTypeDao() {
        return Jdbc.createDao(RequestTypeDao.class, dataSource);
    }

    // ==================== Info Window DAOs ====================

    @Bean
    public InfoWindowDao infoWindowDao() {
        return Jdbc.createDao(InfoWindowDao.class, dataSource);
    }

    // ==================== Issue DAOs ====================

    @Bean
    public IssueDao issueDao() {
        return Jdbc.createDao(IssueDao.class, dataSource);
    }

    // ==================== Performance Analysis DAOs ====================

    @Bean
    public GoalDao goalDao() {
        return Jdbc.createDao(GoalDao.class, dataSource);
    }

    @Bean
    public DashboardDao dashboardDao() {
        return Jdbc.createDao(DashboardDao.class, dataSource);
    }

    // ==================== Scheduler DAOs ====================

    @Bean
    public SchedulerDao schedulerDao() {
        return Jdbc.createDao(SchedulerDao.class, dataSource);
    }

    // ==================== System Config DAOs ====================

    @Bean
    public SystemConfigDao systemConfigDao() {
        return Jdbc.createDao(SystemConfigDao.class, dataSource);
    }

    // ==================== Print Format DAOs ====================

    @Bean
    public PrintFormatDao printFormatDao() {
        return Jdbc.createDao(PrintFormatDao.class, dataSource);
    }

    // ==================== Financial Report DAOs ====================

    @Bean
    public ReportDao reportDao() {
        return Jdbc.createDao(ReportDao.class, dataSource);
    }

    // ==================== Payroll DAOs ====================

    @Bean
    public PayrollDao payrollDao() {
        return Jdbc.createDao(PayrollDao.class, dataSource);
    }

    // ==================== Cost DAOs ====================

    @Bean
    public CostDao costDao() {
        return Jdbc.createDao(CostDao.class, dataSource);
    }

    @Bean
    public CostElementDao costElementDao() {
        return Jdbc.createDao(CostElementDao.class, dataSource);
    }

    // ==================== Project Phase/Task DAOs ====================

    @Bean
    public ProjectPhaseDao projectPhaseDao() {
        return Jdbc.createDao(ProjectPhaseDao.class, dataSource);
    }

    @Bean
    public ProjectTaskDao projectTaskDao() {
        return Jdbc.createDao(ProjectTaskDao.class, dataSource);
    }

    // ==================== Attendance/Time Off DAOs ====================

    @Bean
    public AttendanceDao attendanceDao() {
        return Jdbc.createDao(AttendanceDao.class, dataSource);
    }

    @Bean
    public TimeOffRequestDao timeOffRequestDao() {
        return Jdbc.createDao(TimeOffRequestDao.class, dataSource);
    }

    // ==================== Access Control DAOs ====================

    @Bean
    public AccessDao accessDao() {
        return Jdbc.createDao(AccessDao.class, dataSource);
    }

    // ==================== Accounting Fact DAOs ====================

    @Bean
    public AcctFactDao acctFactDao() {
        return Jdbc.createDao(AcctFactDao.class, dataSource);
    }

    // ==================== Allocation DAOs ====================

    @Bean
    public AllocationDao allocationDao() {
        return Jdbc.createDao(AllocationDao.class, dataSource);
    }

    // ==================== Currency Rate DAOs ====================

    @Bean
    public CurrencyRateDao currencyRateDao() {
        return Jdbc.createDao(CurrencyRateDao.class, dataSource);
    }

    // ==================== Pay Selection DAOs ====================

    @Bean
    public PaySelectionDao paySelectionDao() {
        return Jdbc.createDao(PaySelectionDao.class, dataSource);
    }

    // ==================== Deposit Batch DAOs ====================

    @Bean
    public DepositBatchDao depositBatchDao() {
        return Jdbc.createDao(DepositBatchDao.class, dataSource);
    }

    // ==================== GL Distribution DAOs ====================

    @Bean
    public GLDistributionDao glDistributionDao() {
        return Jdbc.createDao(GLDistributionDao.class, dataSource);
    }

    // ==================== Translation DAOs ====================

    @Bean
    public TranslationDao translationDao() {
        return Jdbc.createDao(TranslationDao.class, dataSource);
    }

    // ==================== Quality Test DAOs ====================

    @Bean
    public QualityTestDao qualityTestDao() {
        return Jdbc.createDao(QualityTestDao.class, dataSource);
    }

    // ==================== Import Processor DAOs ====================

    @Bean
    public ImportProcessorDao importProcessorDao() {
        return Jdbc.createDao(ImportProcessorDao.class, dataSource);
    }

    // ==================== Web Service DAOs ====================

    @Bean
    public WebServiceDao webServiceDao() {
        return Jdbc.createDao(WebServiceDao.class, dataSource);
    }

    // ==================== Content Management DAOs ====================

    @Bean
    public ContentDao contentDao() {
        return Jdbc.createDao(ContentDao.class, dataSource);
    }
}
