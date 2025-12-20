# PowerShell script to fix remaining getter method errors

$servicePath = "C:\Users\haiyangl\Landawn\idempiere\idempiere-spring\src\main\java\org\idempiere\service"

# LocationService
(Get-Content "$servicePath\LocationService.java") -replace '\.getLocationId\(\)', '.getCLocationId()' | Set-Content "$servicePath\LocationService.java"

# LotService
(Get-Content "$servicePath\LotService.java") -replace '\.getLotId\(\)', '.getMLotId()' | Set-Content "$servicePath\LotService.java"
(Get-Content "$servicePath\LotService.java") -replace '\.getLotCtlId\(\)', '.getMLotCtlId()' | Set-Content "$servicePath\LotService.java"
(Get-Content "$servicePath\LotService.java") -replace '\.getSerNoCtlId\(\)', '.getMSerNoCtlId()' | Set-Content "$servicePath\LotService.java"

# ManufacturingService
(Get-Content "$servicePath\ManufacturingService.java") -replace '\.getOrderLineId\(\)', '.getPpOrderBomLineId()' | Set-Content "$servicePath\ManufacturingService.java"
(Get-Content "$servicePath\ManufacturingService.java") -replace '\.getOrderNodeId\(\)', '.getPpOrderNodeId()' | Set-Content "$servicePath\ManufacturingService.java"
(Get-Content "$servicePath\ManufacturingService.java") -replace '\.getWorkflowId\(\)', '.getPpOrderWorkflowId()' | Set-Content "$servicePath\ManufacturingService.java"
(Get-Content "$servicePath\ManufacturingService.java") -replace '\.getCostCollectorId\(\)', '.getPpCostCollectorId()' | Set-Content "$servicePath\ManufacturingService.java"

# MatchingService
(Get-Content "$servicePath\MatchingService.java") -replace '\.getMatchInvId\(\)', '.getMMatchInvId()' | Set-Content "$servicePath\MatchingService.java"
(Get-Content "$servicePath\MatchingService.java") -replace '\.getMatchPOId\(\)', '.getMMatchPoId()' | Set-Content "$servicePath\MatchingService.java"

# OrderService
(Get-Content "$servicePath\OrderService.java") -replace 'order\.getOrderId\(\)', 'order.getCOrderId()' | Set-Content "$servicePath\OrderService.java"
(Get-Content "$servicePath\OrderService.java") -replace 'line\.getLineId\(\)', 'line.getCOrderLineId()' | Set-Content "$servicePath\OrderService.java"

# OrganizationService
(Get-Content "$servicePath\OrganizationService.java") -replace '\.getOrganizationId\(\)', '.getAdOrgId()' | Set-Content "$servicePath\OrganizationService.java"

# PaymentService
(Get-Content "$servicePath\PaymentService.java") -replace 'payment\.getPaymentId\(\)', 'payment.getCPaymentId()' | Set-Content "$servicePath\PaymentService.java"

# PriceListService
(Get-Content "$servicePath\PriceListService.java") -replace '\.getVersionId\(\)', '.getMPriceListVersionId()' | Set-Content "$servicePath\PriceListService.java"

# PrintService
(Get-Content "$servicePath\PrintService.java") -replace '\.getTableFormatId\(\)', '.getAdPrintTableFormatId()' | Set-Content "$servicePath\PrintService.java"
(Get-Content "$servicePath\PrintService.java") -replace '\.getReportViewId\(\)', '.getAdReportViewId()' | Set-Content "$servicePath\PrintService.java"
(Get-Content "$servicePath\PrintService.java") -replace '\.getReportViewColId\(\)', '.getAdReportViewColId()' | Set-Content "$servicePath\PrintService.java"

Write-Host "All getter method errors fixed!"
