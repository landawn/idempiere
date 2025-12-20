package org.idempiere.config;

import javax.sql.DataSource;

import org.idempiere.dao.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.landawn.abacus.jdbc.JdbcUtil;

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
        return JdbcUtil.createDao(ClientDao.class, dataSource);
    }

    @Bean
    public OrganizationDao organizationDao() {
        return JdbcUtil.createDao(OrganizationDao.class, dataSource);
    }

    @Bean
    public UserDao userDao() {
        return JdbcUtil.createDao(UserDao.class, dataSource);
    }

    @Bean
    public BPartnerDao bPartnerDao() {
        return JdbcUtil.createDao(BPartnerDao.class, dataSource);
    }

    @Bean
    public ProductDao productDao() {
        return JdbcUtil.createDao(ProductDao.class, dataSource);
    }

    // ==================== Order DAOs ====================

    @Bean
    public OrderDao orderDao() {
        return JdbcUtil.createDao(OrderDao.class, dataSource);
    }

    @Bean
    public OrderLineDao orderLineDao() {
        return JdbcUtil.createDao(OrderLineDao.class, dataSource);
    }

    // ==================== Invoice DAOs ====================

    @Bean
    public InvoiceDao invoiceDao() {
        return JdbcUtil.createDao(InvoiceDao.class, dataSource);
    }

    @Bean
    public InvoiceLineDao invoiceLineDao() {
        return JdbcUtil.createDao(InvoiceLineDao.class, dataSource);
    }

    // ==================== Payment DAOs ====================

    @Bean
    public PaymentDao paymentDao() {
        return JdbcUtil.createDao(PaymentDao.class, dataSource);
    }

    // ==================== Accounting DAOs ====================

    @Bean
    public AcctSchemaDao acctSchemaDao() {
        return JdbcUtil.createDao(AcctSchemaDao.class, dataSource);
    }

    @Bean
    public ElementValueDao elementValueDao() {
        return JdbcUtil.createDao(ElementValueDao.class, dataSource);
    }

    @Bean
    public JournalDao journalDao() {
        return JdbcUtil.createDao(JournalDao.class, dataSource);
    }

    @Bean
    public JournalLineDao journalLineDao() {
        return JdbcUtil.createDao(JournalLineDao.class, dataSource);
    }

    @Bean
    public CurrencyDao currencyDao() {
        return JdbcUtil.createDao(CurrencyDao.class, dataSource);
    }

    // ==================== Banking DAOs ====================

    @Bean
    public BankDao bankDao() {
        return JdbcUtil.createDao(BankDao.class, dataSource);
    }

    @Bean
    public BankAccountDao bankAccountDao() {
        return JdbcUtil.createDao(BankAccountDao.class, dataSource);
    }

    // ==================== Inventory DAOs ====================

    @Bean
    public WarehouseDao warehouseDao() {
        return JdbcUtil.createDao(WarehouseDao.class, dataSource);
    }

    @Bean
    public InOutDao inOutDao() {
        return JdbcUtil.createDao(InOutDao.class, dataSource);
    }

    // ==================== Tax DAOs ====================

    @Bean
    public TaxDao taxDao() {
        return JdbcUtil.createDao(TaxDao.class, dataSource);
    }

    // ==================== Project DAOs ====================

    @Bean
    public ProjectDao projectDao() {
        return JdbcUtil.createDao(ProjectDao.class, dataSource);
    }

    // ==================== Administration DAOs ====================

    @Bean
    public WindowDao windowDao() {
        return JdbcUtil.createDao(WindowDao.class, dataSource);
    }

    @Bean
    public RoleDao roleDao() {
        return JdbcUtil.createDao(RoleDao.class, dataSource);
    }

    @Bean
    public WorkflowDao workflowDao() {
        return JdbcUtil.createDao(WorkflowDao.class, dataSource);
    }

    // ==================== Manufacturing DAOs ====================

    @Bean
    public PPOrderDao ppOrderDao() {
        return JdbcUtil.createDao(PPOrderDao.class, dataSource);
    }

    @Bean
    public PPOrderLineDao ppOrderLineDao() {
        return JdbcUtil.createDao(PPOrderLineDao.class, dataSource);
    }

    @Bean
    public PPOrderNodeDao ppOrderNodeDao() {
        return JdbcUtil.createDao(PPOrderNodeDao.class, dataSource);
    }

    @Bean
    public PPOrderWorkflowDao ppOrderWorkflowDao() {
        return JdbcUtil.createDao(PPOrderWorkflowDao.class, dataSource);
    }

    @Bean
    public PPCostCollectorDao ppCostCollectorDao() {
        return JdbcUtil.createDao(PPCostCollectorDao.class, dataSource);
    }

    @Bean
    public PPProductPlanningDao ppProductPlanningDao() {
        return JdbcUtil.createDao(PPProductPlanningDao.class, dataSource);
    }

    // ==================== HR DAOs ====================

    @Bean
    public HREmployeeDao hrEmployeeDao() {
        return JdbcUtil.createDao(HREmployeeDao.class, dataSource);
    }

    @Bean
    public HRConceptDao hrConceptDao() {
        return JdbcUtil.createDao(HRConceptDao.class, dataSource);
    }

    @Bean
    public HRContractDao hrContractDao() {
        return JdbcUtil.createDao(HRContractDao.class, dataSource);
    }

    @Bean
    public HRDepartmentDao hrDepartmentDao() {
        return JdbcUtil.createDao(HRDepartmentDao.class, dataSource);
    }

    @Bean
    public HRJobDao hrJobDao() {
        return JdbcUtil.createDao(HRJobDao.class, dataSource);
    }

    @Bean
    public HRPayrollLineDao hrPayrollLineDao() {
        return JdbcUtil.createDao(HRPayrollLineDao.class, dataSource);
    }

    // ==================== Commission DAOs ====================

    @Bean
    public CommissionDao commissionDao() {
        return JdbcUtil.createDao(CommissionDao.class, dataSource);
    }

    @Bean
    public CommissionAmtDao commissionAmtDao() {
        return JdbcUtil.createDao(CommissionAmtDao.class, dataSource);
    }

    @Bean
    public CommissionDetailDao commissionDetailDao() {
        return JdbcUtil.createDao(CommissionDetailDao.class, dataSource);
    }

    @Bean
    public CommissionLineDao commissionLineDao() {
        return JdbcUtil.createDao(CommissionLineDao.class, dataSource);
    }

    @Bean
    public CommissionRunDao commissionRunDao() {
        return JdbcUtil.createDao(CommissionRunDao.class, dataSource);
    }

    // ==================== Dunning DAOs ====================

    @Bean
    public DunningDao dunningDao() {
        return JdbcUtil.createDao(DunningDao.class, dataSource);
    }

    @Bean
    public DunningLevelDao dunningLevelDao() {
        return JdbcUtil.createDao(DunningLevelDao.class, dataSource);
    }

    @Bean
    public DunningRunDao dunningRunDao() {
        return JdbcUtil.createDao(DunningRunDao.class, dataSource);
    }

    @Bean
    public DunningRunEntryDao dunningRunEntryDao() {
        return JdbcUtil.createDao(DunningRunEntryDao.class, dataSource);
    }

    @Bean
    public DunningRunLineDao dunningRunLineDao() {
        return JdbcUtil.createDao(DunningRunLineDao.class, dataSource);
    }

    // ==================== Distribution DAOs ====================

    @Bean
    public DDOrderDao ddOrderDao() {
        return JdbcUtil.createDao(DDOrderDao.class, dataSource);
    }

    @Bean
    public DistributionListDao distributionListDao() {
        return JdbcUtil.createDao(DistributionListDao.class, dataSource);
    }

    // ==================== Smart Browse DAOs ====================

    @Bean
    public BrowseDao browseDao() {
        return JdbcUtil.createDao(BrowseDao.class, dataSource);
    }

    @Bean
    public ChartDao chartDao() {
        return JdbcUtil.createDao(ChartDao.class, dataSource);
    }

    // ==================== Document Type DAOs ====================

    @Bean
    public DocTypeDao docTypeDao() {
        return JdbcUtil.createDao(DocTypeDao.class, dataSource);
    }

    // ==================== RfQ DAOs ====================

    @Bean
    public RfQDao rfQDao() {
        return JdbcUtil.createDao(RfQDao.class, dataSource);
    }

    // ==================== Asset DAOs ====================

    @Bean
    public AssetDao assetDao() {
        return JdbcUtil.createDao(AssetDao.class, dataSource);
    }

    @Bean
    public AssetAcctDao assetAcctDao() {
        return JdbcUtil.createDao(AssetAcctDao.class, dataSource);
    }

    @Bean
    public AssetAdditionDao assetAdditionDao() {
        return JdbcUtil.createDao(AssetAdditionDao.class, dataSource);
    }

    @Bean
    public AssetDepreciationDao assetDepreciationDao() {
        return JdbcUtil.createDao(AssetDepreciationDao.class, dataSource);
    }

    @Bean
    public AssetDepreciationEntryDao assetDepreciationEntryDao() {
        return JdbcUtil.createDao(AssetDepreciationEntryDao.class, dataSource);
    }

    @Bean
    public AssetDisposalDao assetDisposalDao() {
        return JdbcUtil.createDao(AssetDisposalDao.class, dataSource);
    }

    @Bean
    public AssetRevalDao assetRevalDao() {
        return JdbcUtil.createDao(AssetRevalDao.class, dataSource);
    }

    @Bean
    public AssetTransferDao assetTransferDao() {
        return JdbcUtil.createDao(AssetTransferDao.class, dataSource);
    }

    // ==================== Recurring DAOs ====================

    @Bean
    public RecurringDao recurringDao() {
        return JdbcUtil.createDao(RecurringDao.class, dataSource);
    }

    // ==================== Accounting Schema DAOs ====================

    @Bean
    public AcctSchemaElementDao acctSchemaElementDao() {
        return JdbcUtil.createDao(AcctSchemaElementDao.class, dataSource);
    }

    // ==================== Promotion DAOs ====================

    @Bean
    public PromotionDao promotionDao() {
        return JdbcUtil.createDao(PromotionDao.class, dataSource);
    }

    // ==================== Web Store DAOs ====================

    @Bean
    public WebStoreDao webStoreDao() {
        return JdbcUtil.createDao(WebStoreDao.class, dataSource);
    }

    // ==================== Alert DAOs ====================

    @Bean
    public AlertDao alertDao() {
        return JdbcUtil.createDao(AlertDao.class, dataSource);
    }

    // ==================== Import Format DAOs ====================

    @Bean
    public ImportFormatDao importFormatDao() {
        return JdbcUtil.createDao(ImportFormatDao.class, dataSource);
    }

    // ==================== Request DAOs ====================

    @Bean
    public RequestDao requestDao() {
        return JdbcUtil.createDao(RequestDao.class, dataSource);
    }

    @Bean
    public RequestTypeDao requestTypeDao() {
        return JdbcUtil.createDao(RequestTypeDao.class, dataSource);
    }

    // ==================== Info Window DAOs ====================

    @Bean
    public InfoWindowDao infoWindowDao() {
        return JdbcUtil.createDao(InfoWindowDao.class, dataSource);
    }

    // ==================== Issue DAOs ====================

    @Bean
    public IssueDao issueDao() {
        return JdbcUtil.createDao(IssueDao.class, dataSource);
    }

    // ==================== Performance Analysis DAOs ====================

    @Bean
    public GoalDao goalDao() {
        return JdbcUtil.createDao(GoalDao.class, dataSource);
    }

    @Bean
    public DashboardDao dashboardDao() {
        return JdbcUtil.createDao(DashboardDao.class, dataSource);
    }

    // ==================== Scheduler DAOs ====================

    @Bean
    public SchedulerDao schedulerDao() {
        return JdbcUtil.createDao(SchedulerDao.class, dataSource);
    }

    // ==================== System Config DAOs ====================

    @Bean
    public SystemConfigDao systemConfigDao() {
        return JdbcUtil.createDao(SystemConfigDao.class, dataSource);
    }

    // ==================== Print Format DAOs ====================

    @Bean
    public PrintFormatDao printFormatDao() {
        return JdbcUtil.createDao(PrintFormatDao.class, dataSource);
    }

    // ==================== Financial Report DAOs ====================

    @Bean
    public ReportDao reportDao() {
        return JdbcUtil.createDao(ReportDao.class, dataSource);
    }

    // ==================== Payroll DAOs ====================

    @Bean
    public PayrollDao payrollDao() {
        return JdbcUtil.createDao(PayrollDao.class, dataSource);
    }

    // ==================== Cost DAOs ====================

    @Bean
    public CostDao costDao() {
        return JdbcUtil.createDao(CostDao.class, dataSource);
    }

    @Bean
    public CostElementDao costElementDao() {
        return JdbcUtil.createDao(CostElementDao.class, dataSource);
    }

    // ==================== Project Phase/Task DAOs ====================

    @Bean
    public ProjectPhaseDao projectPhaseDao() {
        return JdbcUtil.createDao(ProjectPhaseDao.class, dataSource);
    }

    @Bean
    public ProjectTaskDao projectTaskDao() {
        return JdbcUtil.createDao(ProjectTaskDao.class, dataSource);
    }

    // ==================== Attendance/Time Off DAOs ====================

    @Bean
    public AttendanceDao attendanceDao() {
        return JdbcUtil.createDao(AttendanceDao.class, dataSource);
    }

    @Bean
    public TimeOffRequestDao timeOffRequestDao() {
        return JdbcUtil.createDao(TimeOffRequestDao.class, dataSource);
    }

    // ==================== Access Control DAOs ====================

    @Bean
    public AccessDao accessDao() {
        return JdbcUtil.createDao(AccessDao.class, dataSource);
    }

    // ==================== Accounting Fact DAOs ====================

    @Bean
    public AcctFactDao acctFactDao() {
        return JdbcUtil.createDao(AcctFactDao.class, dataSource);
    }

    // ==================== Allocation DAOs ====================

    @Bean
    public AllocationDao allocationDao() {
        return JdbcUtil.createDao(AllocationDao.class, dataSource);
    }

    // ==================== Currency Rate DAOs ====================

    @Bean
    public CurrencyRateDao currencyRateDao() {
        return JdbcUtil.createDao(CurrencyRateDao.class, dataSource);
    }

    // ==================== Pay Selection DAOs ====================

    @Bean
    public PaySelectionDao paySelectionDao() {
        return JdbcUtil.createDao(PaySelectionDao.class, dataSource);
    }

    // ==================== Deposit Batch DAOs ====================

    @Bean
    public DepositBatchDao depositBatchDao() {
        return JdbcUtil.createDao(DepositBatchDao.class, dataSource);
    }

    // ==================== GL Distribution DAOs ====================

    @Bean
    public GLDistributionDao glDistributionDao() {
        return JdbcUtil.createDao(GLDistributionDao.class, dataSource);
    }

    // ==================== Translation DAOs ====================

    @Bean
    public TranslationDao translationDao() {
        return JdbcUtil.createDao(TranslationDao.class, dataSource);
    }

    // ==================== Quality Test DAOs ====================

    @Bean
    public QualityTestDao qualityTestDao() {
        return JdbcUtil.createDao(QualityTestDao.class, dataSource);
    }

    // ==================== Import Processor DAOs ====================

    @Bean
    public ImportProcessorDao importProcessorDao() {
        return JdbcUtil.createDao(ImportProcessorDao.class, dataSource);
    }

    // ==================== Web Service DAOs ====================

    @Bean
    public WebServiceDao webServiceDao() {
        return JdbcUtil.createDao(WebServiceDao.class, dataSource);
    }

    // ==================== Content Management DAOs ====================

    @Bean
    public ContentDao contentDao() {
        return JdbcUtil.createDao(ContentDao.class, dataSource);
    }

    // ==================== Pricing DAOs ====================

    @Bean
    public ChargeDao chargeDao() {
        return JdbcUtil.createDao(ChargeDao.class, dataSource);
    }

    @Bean
    public UOMDao uomDao() {
        return JdbcUtil.createDao(UOMDao.class, dataSource);
    }

    @Bean
    public PriceListDao priceListDao() {
        return JdbcUtil.createDao(PriceListDao.class, dataSource);
    }

    @Bean
    public PriceListVersionDao priceListVersionDao() {
        return JdbcUtil.createDao(PriceListVersionDao.class, dataSource);
    }

    @Bean
    public ProductPriceDao productPriceDao() {
        return JdbcUtil.createDao(ProductPriceDao.class, dataSource);
    }

    @Bean
    public ProductCategoryDao productCategoryDao() {
        return JdbcUtil.createDao(ProductCategoryDao.class, dataSource);
    }

    @Bean
    public PaymentTermDao paymentTermDao() {
        return JdbcUtil.createDao(PaymentTermDao.class, dataSource);
    }

    @Bean
    public DiscountSchemaDao discountSchemaDao() {
        return JdbcUtil.createDao(DiscountSchemaDao.class, dataSource);
    }

    // ==================== Inventory Management DAOs ====================

    @Bean
    public LocatorDao locatorDao() {
        return JdbcUtil.createDao(LocatorDao.class, dataSource);
    }

    @Bean
    public MovementDao movementDao() {
        return JdbcUtil.createDao(MovementDao.class, dataSource);
    }

    @Bean
    public MovementLineDao movementLineDao() {
        return JdbcUtil.createDao(MovementLineDao.class, dataSource);
    }

    @Bean
    public InventoryDao inventoryDao() {
        return JdbcUtil.createDao(InventoryDao.class, dataSource);
    }

    @Bean
    public InventoryLineDao inventoryLineDao() {
        return JdbcUtil.createDao(InventoryLineDao.class, dataSource);
    }

    @Bean
    public InOutLineDao inOutLineDao() {
        return JdbcUtil.createDao(InOutLineDao.class, dataSource);
    }

    // ==================== Asset Management DAOs ====================

    @Bean
    public AssetGroupDao assetGroupDao() {
        return JdbcUtil.createDao(AssetGroupDao.class, dataSource);
    }

    @Bean
    public CampaignDao campaignDao() {
        return JdbcUtil.createDao(CampaignDao.class, dataSource);
    }

    @Bean
    public ActivityDao activityDao() {
        return JdbcUtil.createDao(ActivityDao.class, dataSource);
    }

    // ==================== Allocation DAOs ====================

    @Bean
    public AllocationHdrDao allocationHdrDao() {
        return JdbcUtil.createDao(AllocationHdrDao.class, dataSource);
    }

    @Bean
    public AllocationLineDao allocationLineDao() {
        return JdbcUtil.createDao(AllocationLineDao.class, dataSource);
    }

    // ==================== Matching DAOs ====================

    @Bean
    public MatchInvDao matchInvDao() {
        return JdbcUtil.createDao(MatchInvDao.class, dataSource);
    }

    @Bean
    public MatchPODao matchPODao() {
        return JdbcUtil.createDao(MatchPODao.class, dataSource);
    }

    // ==================== Requisition DAOs ====================

    @Bean
    public RequisitionDao requisitionDao() {
        return JdbcUtil.createDao(RequisitionDao.class, dataSource);
    }

    @Bean
    public RequisitionLineDao requisitionLineDao() {
        return JdbcUtil.createDao(RequisitionLineDao.class, dataSource);
    }

    // ==================== RMA DAOs ====================

    @Bean
    public RMADao rmaDao() {
        return JdbcUtil.createDao(RMADao.class, dataSource);
    }

    @Bean
    public RMALineDao rmaLineDao() {
        return JdbcUtil.createDao(RMALineDao.class, dataSource);
    }

    // ==================== Cash Management DAOs ====================

    @Bean
    public CashDao cashDao() {
        return JdbcUtil.createDao(CashDao.class, dataSource);
    }

    @Bean
    public CashLineDao cashLineDao() {
        return JdbcUtil.createDao(CashLineDao.class, dataSource);
    }

    @Bean
    public CashBookDao cashBookDao() {
        return JdbcUtil.createDao(CashBookDao.class, dataSource);
    }

    // ==================== Calendar DAOs ====================

    @Bean
    public CalendarDao calendarDao() {
        return JdbcUtil.createDao(CalendarDao.class, dataSource);
    }

    @Bean
    public YearDao yearDao() {
        return JdbcUtil.createDao(YearDao.class, dataSource);
    }

    @Bean
    public PeriodDao periodDao() {
        return JdbcUtil.createDao(PeriodDao.class, dataSource);
    }

    // ==================== Location DAOs ====================

    @Bean
    public LocationDao locationDao() {
        return JdbcUtil.createDao(LocationDao.class, dataSource);
    }

    @Bean
    public CountryDao countryDao() {
        return JdbcUtil.createDao(CountryDao.class, dataSource);
    }

    @Bean
    public RegionDao regionDao() {
        return JdbcUtil.createDao(RegionDao.class, dataSource);
    }

    @Bean
    public CityDao cityDao() {
        return JdbcUtil.createDao(CityDao.class, dataSource);
    }

    // ==================== Business Partner Location DAOs ====================

    @Bean
    public BPartnerLocationDao bPartnerLocationDao() {
        return JdbcUtil.createDao(BPartnerLocationDao.class, dataSource);
    }

    @Bean
    public BPBankAccountDao bpBankAccountDao() {
        return JdbcUtil.createDao(BPBankAccountDao.class, dataSource);
    }

    // ==================== Attribute DAOs ====================

    @Bean
    public AttributeSetDao attributeSetDao() {
        return JdbcUtil.createDao(AttributeSetDao.class, dataSource);
    }

    @Bean
    public AttributeDao attributeDao() {
        return JdbcUtil.createDao(AttributeDao.class, dataSource);
    }

    @Bean
    public AttributeInstanceDao attributeInstanceDao() {
        return JdbcUtil.createDao(AttributeInstanceDao.class, dataSource);
    }

    @Bean
    public AttributeSetInstanceDao attributeSetInstanceDao() {
        return JdbcUtil.createDao(AttributeSetInstanceDao.class, dataSource);
    }

    // ==================== Lot Control DAOs ====================

    @Bean
    public LotDao lotDao() {
        return JdbcUtil.createDao(LotDao.class, dataSource);
    }

    @Bean
    public LotCtlDao lotCtlDao() {
        return JdbcUtil.createDao(LotCtlDao.class, dataSource);
    }

    @Bean
    public SerNoCtlDao serNoCtlDao() {
        return JdbcUtil.createDao(SerNoCtlDao.class, dataSource);
    }

    // ==================== Storage DAOs ====================

    @Bean
    public StorageDao storageDao() {
        return JdbcUtil.createDao(StorageDao.class, dataSource);
    }

    @Bean
    public StorageReservationDao storageReservationDao() {
        return JdbcUtil.createDao(StorageReservationDao.class, dataSource);
    }

    @Bean
    public ReplenishDao replenishDao() {
        return JdbcUtil.createDao(ReplenishDao.class, dataSource);
    }

    // ==================== Cost Detail DAOs ====================

    @Bean
    public CostTypeDao costTypeDao() {
        return JdbcUtil.createDao(CostTypeDao.class, dataSource);
    }

    @Bean
    public CostDetailDao costDetailDao() {
        return JdbcUtil.createDao(CostDetailDao.class, dataSource);
    }

    @Bean
    public TransactionDao transactionDao() {
        return JdbcUtil.createDao(TransactionDao.class, dataSource);
    }

    // ==================== Production DAOs ====================

    @Bean
    public ProductionDao productionDao() {
        return JdbcUtil.createDao(ProductionDao.class, dataSource);
    }

    @Bean
    public ProductionLineDao productionLineDao() {
        return JdbcUtil.createDao(ProductionLineDao.class, dataSource);
    }

    @Bean
    public BOMDao bomDao() {
        return JdbcUtil.createDao(BOMDao.class, dataSource);
    }

    @Bean
    public BOMLineDao bomLineDao() {
        return JdbcUtil.createDao(BOMLineDao.class, dataSource);
    }

    @Bean
    public ProductBOMDao productBOMDao() {
        return JdbcUtil.createDao(ProductBOMDao.class, dataSource);
    }

    // ==================== Shipping DAOs ====================

    @Bean
    public ShipperDao shipperDao() {
        return JdbcUtil.createDao(ShipperDao.class, dataSource);
    }

    @Bean
    public FreightCategoryDao freightCategoryDao() {
        return JdbcUtil.createDao(FreightCategoryDao.class, dataSource);
    }

    @Bean
    public FreightDao freightDao() {
        return JdbcUtil.createDao(FreightDao.class, dataSource);
    }

    @Bean
    public PackageDao packageDao() {
        return JdbcUtil.createDao(PackageDao.class, dataSource);
    }

    @Bean
    public PackageLineDao packageLineDao() {
        return JdbcUtil.createDao(PackageLineDao.class, dataSource);
    }

    // ==================== InOut Confirmation DAOs ====================

    @Bean
    public InOutConfirmDao inOutConfirmDao() {
        return JdbcUtil.createDao(InOutConfirmDao.class, dataSource);
    }

    @Bean
    public InOutLineConfirmDao inOutLineConfirmDao() {
        return JdbcUtil.createDao(InOutLineConfirmDao.class, dataSource);
    }

    // ==================== Distribution Run DAOs ====================

    @Bean
    public DistributionRunDao distributionRunDao() {
        return JdbcUtil.createDao(DistributionRunDao.class, dataSource);
    }

    @Bean
    public DistributionRunLineDao distributionRunLineDao() {
        return JdbcUtil.createDao(DistributionRunLineDao.class, dataSource);
    }

    @Bean
    public DistributionListLineDao distributionListLineDao() {
        return JdbcUtil.createDao(DistributionListLineDao.class, dataSource);
    }

    // ==================== Forecast DAOs ====================

    @Bean
    public ForecastDao forecastDao() {
        return JdbcUtil.createDao(ForecastDao.class, dataSource);
    }

    @Bean
    public ForecastLineDao forecastLineDao() {
        return JdbcUtil.createDao(ForecastLineDao.class, dataSource);
    }

    // ==================== Promotion Extended DAOs ====================

    @Bean
    public PromotionLineDao promotionLineDao() {
        return JdbcUtil.createDao(PromotionLineDao.class, dataSource);
    }

    @Bean
    public PromotionRewardDao promotionRewardDao() {
        return JdbcUtil.createDao(PromotionRewardDao.class, dataSource);
    }

    @Bean
    public PromotionPreConditionDao promotionPreConditionDao() {
        return JdbcUtil.createDao(PromotionPreConditionDao.class, dataSource);
    }

    @Bean
    public PromotionDistributionDao promotionDistributionDao() {
        return JdbcUtil.createDao(PromotionDistributionDao.class, dataSource);
    }

    @Bean
    public PromotionGroupDao promotionGroupDao() {
        return JdbcUtil.createDao(PromotionGroupDao.class, dataSource);
    }

    @Bean
    public PromotionGroupLineDao promotionGroupLineDao() {
        return JdbcUtil.createDao(PromotionGroupLineDao.class, dataSource);
    }

    // ==================== Workflow Extended DAOs ====================

    @Bean
    public WorkflowNodeDao workflowNodeDao() {
        return JdbcUtil.createDao(WorkflowNodeDao.class, dataSource);
    }

    @Bean
    public WorkflowNodeNextDao workflowNodeNextDao() {
        return JdbcUtil.createDao(WorkflowNodeNextDao.class, dataSource);
    }

    @Bean
    public WorkflowProcessDao workflowProcessDao() {
        return JdbcUtil.createDao(WorkflowProcessDao.class, dataSource);
    }

    @Bean
    public WorkflowActivityDao workflowActivityDao() {
        return JdbcUtil.createDao(WorkflowActivityDao.class, dataSource);
    }

    @Bean
    public WorkflowResponsibleDao workflowResponsibleDao() {
        return JdbcUtil.createDao(WorkflowResponsibleDao.class, dataSource);
    }

    // ==================== Alert Extended DAOs ====================

    @Bean
    public AlertRuleDao alertRuleDao() {
        return JdbcUtil.createDao(AlertRuleDao.class, dataSource);
    }

    @Bean
    public AlertRecipientDao alertRecipientDao() {
        return JdbcUtil.createDao(AlertRecipientDao.class, dataSource);
    }

    // ==================== Scheduler Extended DAOs ====================

    @Bean
    public SchedulerLogDao schedulerLogDao() {
        return JdbcUtil.createDao(SchedulerLogDao.class, dataSource);
    }

    // ==================== Print Extended DAOs ====================

    @Bean
    public PrintFormatItemDao printFormatItemDao() {
        return JdbcUtil.createDao(PrintFormatItemDao.class, dataSource);
    }

    @Bean
    public PrintPaperDao printPaperDao() {
        return JdbcUtil.createDao(PrintPaperDao.class, dataSource);
    }

    @Bean
    public PrintFontDao printFontDao() {
        return JdbcUtil.createDao(PrintFontDao.class, dataSource);
    }

    @Bean
    public PrintColorDao printColorDao() {
        return JdbcUtil.createDao(PrintColorDao.class, dataSource);
    }

    @Bean
    public PrintTableFormatDao printTableFormatDao() {
        return JdbcUtil.createDao(PrintTableFormatDao.class, dataSource);
    }

    @Bean
    public ReportViewDao reportViewDao() {
        return JdbcUtil.createDao(ReportViewDao.class, dataSource);
    }

    @Bean
    public ReportViewColDao reportViewColDao() {
        return JdbcUtil.createDao(ReportViewColDao.class, dataSource);
    }

    // ==================== Archive DAOs ====================

    @Bean
    public ArchiveDao archiveDao() {
        return JdbcUtil.createDao(ArchiveDao.class, dataSource);
    }

    // ==================== Bank Statement DAOs ====================

    @Bean
    public BankStatementDao bankStatementDao() {
        return JdbcUtil.createDao(BankStatementDao.class, dataSource);
    }

    @Bean
    public BankStatementLineDao bankStatementLineDao() {
        return JdbcUtil.createDao(BankStatementLineDao.class, dataSource);
    }

    // ==================== Journal Batch DAOs ====================

    @Bean
    public JournalBatchDao journalBatchDao() {
        return JdbcUtil.createDao(JournalBatchDao.class, dataSource);
    }

    // ==================== Valid Combination DAOs ====================

    @Bean
    public ValidCombinationDao validCombinationDao() {
        return JdbcUtil.createDao(ValidCombinationDao.class, dataSource);
    }

    // ==================== Table DAOs ====================

    @Bean
    public TableDao tableDao() {
        return JdbcUtil.createDao(TableDao.class, dataSource);
    }
}
