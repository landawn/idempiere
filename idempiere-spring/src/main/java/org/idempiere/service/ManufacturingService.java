package org.idempiere.service;

import java.time.LocalDateTime;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.PPCostCollectorDao;
import org.idempiere.dao.PPOrderDao;
import org.idempiere.dao.PPOrderLineDao;
import org.idempiere.dao.PPOrderNodeDao;
import org.idempiere.dao.PPOrderWorkflowDao;
import org.idempiere.dao.PPProductPlanningDao;
import org.idempiere.model.PPCostCollector;
import org.idempiere.model.PPOrder;
import org.idempiere.model.PPOrderLine;
import org.idempiere.model.PPOrderNode;
import org.idempiere.model.PPOrderWorkflow;
import org.idempiere.model.PPProductPlanning;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Manufacturing operations.
 * Combines all PP (Plant & Production) DAO operations.
 */
@Service
@Transactional
public class ManufacturingService {

    private final PPOrderDao ppOrderDao;
    private final PPOrderLineDao ppOrderLineDao;
    private final PPOrderNodeDao ppOrderNodeDao;
    private final PPOrderWorkflowDao ppOrderWorkflowDao;
    private final PPCostCollectorDao ppCostCollectorDao;
    private final PPProductPlanningDao ppProductPlanningDao;

    public ManufacturingService(
            PPOrderDao ppOrderDao,
            PPOrderLineDao ppOrderLineDao,
            PPOrderNodeDao ppOrderNodeDao,
            PPOrderWorkflowDao ppOrderWorkflowDao,
            PPCostCollectorDao ppCostCollectorDao,
            PPProductPlanningDao ppProductPlanningDao) {
        this.ppOrderDao = ppOrderDao;
        this.ppOrderLineDao = ppOrderLineDao;
        this.ppOrderNodeDao = ppOrderNodeDao;
        this.ppOrderWorkflowDao = ppOrderWorkflowDao;
        this.ppCostCollectorDao = ppCostCollectorDao;
        this.ppProductPlanningDao = ppProductPlanningDao;
    }

    // ==================== PP_Order Operations ====================

    public Optional<PPOrder> findOrderById(Integer id) {
        try { return Optional.ofNullable(ppOrderDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<PPOrder> findAllOrders() {
        return ppOrderDao.findAllActive();
    }

    public Optional<PPOrder> findOrderByDocumentNo(String documentNo) {
        return ppOrderDao.findByDocumentNo(documentNo);
    }

    public List<PPOrder> findOrdersByProduct(Integer productId) {
        return ppOrderDao.findByProduct(productId);
    }

    public List<PPOrder> findOrdersByDocStatus(String docStatus) {
        return ppOrderDao.findByDocStatus(docStatus);
    }

    public List<PPOrder> findOrdersByWarehouse(Integer warehouseId) {
        return ppOrderDao.findByWarehouse(warehouseId);
    }

    public List<PPOrder> findOrdersByBPartner(Integer bpartnerId) {
        return ppOrderDao.findByBPartner(bpartnerId);
    }

    public List<PPOrder> findAllActiveOrders() {
        return ppOrderDao.findAllActive();
    }

    public PPOrder saveOrder(PPOrder order) {
        try {
            if (order.getPpOrderId() == null) {
                ppOrderDao.insert(order);
            } else {
                ppOrderDao.update(order);
            }
            return order;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteOrder(Integer id) {
        // First delete related entities
        List<PPOrderLine> lines = ppOrderLineDao.findByOrderId(id);
        for (PPOrderLine line : lines) {
            try {
                ppOrderLineDao.deleteById(line.getPpOrderBomLineId());
            } catch (SQLException e) {
                throw new RuntimeException("Failed to delete order line", e);
            }
        }

        List<PPOrderNode> nodes = ppOrderNodeDao.findByOrderId(id);
        for (PPOrderNode node : nodes) {
            try {
                ppOrderNodeDao.deleteById(node.getPpOrderNodeId());
            } catch (SQLException e) {
                throw new RuntimeException("Failed to delete order node", e);
            }
        }

        Optional<PPOrderWorkflow> workflow = ppOrderWorkflowDao.findByOrderId(id);
        workflow.ifPresent(wf -> {
            try {
                ppOrderWorkflowDao.deleteById(wf.getPpOrderWorkflowId());
            } catch (SQLException e) {
                throw new RuntimeException("Failed to delete workflow", e);
            }
        });

        List<PPCostCollector> collectors = ppCostCollectorDao.findByOrderId(id);
        for (PPCostCollector collector : collectors) {
            try {
                ppCostCollectorDao.deleteById(collector.getPpCostCollectorId());
            } catch (SQLException e) {
                throw new RuntimeException("Failed to delete cost collector", e);
            }
        }

        // Finally delete the order
        try { ppOrderDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean orderExists(Integer id) {
        try { return ppOrderDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }

    // ==================== PP_Order_Line Operations ====================

    public Optional<PPOrderLine> findOrderLineById(Integer id) {
        try { return Optional.ofNullable(ppOrderLineDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<PPOrderLine> findOrderLinesByOrderId(Integer orderId) {
        return ppOrderLineDao.findByOrderId(orderId);
    }

    public List<PPOrderLine> findOrderLinesByProductId(Integer productId) {
        return ppOrderLineDao.findByProductId(productId);
    }

    public List<PPOrderLine> findCriticalOrderLines() {
        return ppOrderLineDao.findCriticalLines();
    }

    public List<PPOrderLine> findPendingDeliveryLines(Integer orderId) {
        return ppOrderLineDao.findPendingDeliveryByOrderId(orderId);
    }

    public List<PPOrderLine> findOrderLinesByComponentType(String componentType) {
        return ppOrderLineDao.findByComponentType(componentType);
    }

    public List<PPOrderLine> findOrderLinesByWarehouseId(Integer warehouseId) {
        return ppOrderLineDao.findByWarehouseId(warehouseId);
    }

    public PPOrderLine saveOrderLine(PPOrderLine orderLine) {
        try {
            if (orderLine.getPpOrderBomLineId() == null) {
                ppOrderLineDao.insert(orderLine);
            } else {
                ppOrderLineDao.update(orderLine);
            }
            return orderLine;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteOrderLine(Integer lineId) {
        try { ppOrderLineDao.deleteById(lineId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    // ==================== PP_Order_Node Operations ====================

    public Optional<PPOrderNode> findOrderNodeById(Integer id) {
        try { return Optional.ofNullable(ppOrderNodeDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<PPOrderNode> findOrderNodesByOrderId(Integer orderId) {
        return ppOrderNodeDao.findByOrderId(orderId);
    }

    public List<PPOrderNode> findOrderNodesByWorkflowId(Integer workflowId) {
        return ppOrderNodeDao.findByWorkflowId(workflowId);
    }

    public List<PPOrderNode> findOrderNodesByResourceId(Integer resourceId) {
        return ppOrderNodeDao.findByResourceId(resourceId);
    }

    public List<PPOrderNode> findMilestoneNodes() {
        return ppOrderNodeDao.findMilestones();
    }

    public List<PPOrderNode> findSubcontractingNodes() {
        return ppOrderNodeDao.findSubcontractingNodes();
    }

    public List<PPOrderNode> findOrderNodesByAction(String action) {
        return ppOrderNodeDao.findByAction(action);
    }

    public List<PPOrderNode> findOrderNodesByOrderIdAndAction(Integer orderId, String action) {
        return ppOrderNodeDao.findByOrderIdAndAction(orderId, action);
    }

    public PPOrderNode saveOrderNode(PPOrderNode orderNode) {
        try {
            if (orderNode.getPpOrderNodeId() == null) {
                ppOrderNodeDao.insert(orderNode);
            } else {
                ppOrderNodeDao.update(orderNode);
            }
            return orderNode;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteOrderNode(Integer nodeId) {
        try { ppOrderNodeDao.deleteById(nodeId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    // ==================== PP_Order_Workflow Operations ====================

    public Optional<PPOrderWorkflow> findOrderWorkflowById(Integer id) {
        try { return Optional.ofNullable(ppOrderWorkflowDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public Optional<PPOrderWorkflow> findOrderWorkflowByOrderId(Integer orderId) {
        return ppOrderWorkflowDao.findByOrderId(orderId);
    }

    public List<PPOrderWorkflow> findOrderWorkflowsByWorkflowId(Integer workflowId) {
        return ppOrderWorkflowDao.findByWorkflowId(workflowId);
    }

    public List<PPOrderWorkflow> findValidOrderWorkflows() {
        return ppOrderWorkflowDao.findValidWorkflows();
    }

    public List<PPOrderWorkflow> findOrderWorkflowsByResourceId(Integer resourceId) {
        return ppOrderWorkflowDao.findByResourceId(resourceId);
    }

    public List<PPOrderWorkflow> findOrderWorkflowsByType(String workflowType) {
        return ppOrderWorkflowDao.findByWorkflowType(workflowType);
    }

    public Optional<PPOrderWorkflow> findOrderWorkflowByDocumentNo(String documentNo) {
        return ppOrderWorkflowDao.findByDocumentNo(documentNo);
    }

    public List<PPOrderWorkflow> findOrderWorkflowsByMinPriority(Integer minPriority) {
        return ppOrderWorkflowDao.findByMinPriority(minPriority);
    }

    public PPOrderWorkflow saveOrderWorkflow(PPOrderWorkflow orderWorkflow) {
        try {
            if (orderWorkflow.getPpOrderWorkflowId() == null) {
                ppOrderWorkflowDao.insert(orderWorkflow);
            } else {
                ppOrderWorkflowDao.update(orderWorkflow);
            }
            return orderWorkflow;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteOrderWorkflow(Integer workflowId) {
        try { ppOrderWorkflowDao.deleteById(workflowId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    // ==================== PP_Cost_Collector Operations ====================

    public Optional<PPCostCollector> findCostCollectorById(Integer id) {
        try { return Optional.ofNullable(ppCostCollectorDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public Optional<PPCostCollector> findCostCollectorByDocumentNo(String documentNo) {
        return ppCostCollectorDao.findByDocumentNo(documentNo);
    }

    public List<PPCostCollector> findCostCollectorsByOrderId(Integer orderId) {
        return ppCostCollectorDao.findByOrderId(orderId);
    }

    public List<PPCostCollector> findCostCollectorsByBOMLineId(Integer bomLineId) {
        return ppCostCollectorDao.findByBOMLineId(bomLineId);
    }

    public List<PPCostCollector> findCostCollectorsByNodeId(Integer nodeId) {
        return ppCostCollectorDao.findByNodeId(nodeId);
    }

    public List<PPCostCollector> findCostCollectorsByProductId(Integer productId) {
        return ppCostCollectorDao.findByProductId(productId);
    }

    public List<PPCostCollector> findCostCollectorsByWarehouseId(Integer warehouseId) {
        return ppCostCollectorDao.findByWarehouseId(warehouseId);
    }

    public List<PPCostCollector> findCostCollectorsByDocStatus(String docStatus) {
        return ppCostCollectorDao.findByDocStatus(docStatus);
    }

    public List<PPCostCollector> findCostCollectorsByCollectorType(String collectorType) {
        return ppCostCollectorDao.findByCollectorType(collectorType);
    }

    public List<PPCostCollector> findCostCollectorsByMovementType(String movementType) {
        return ppCostCollectorDao.findByMovementType(movementType);
    }

    public List<PPCostCollector> findCostCollectorsByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return ppCostCollectorDao.findByDateRange(startDate, endDate);
    }

    public List<PPCostCollector> findSubcontractingCostCollectors() {
        return ppCostCollectorDao.findSubcontracting();
    }

    public PPCostCollector saveCostCollector(PPCostCollector costCollector) {
        try {
            if (costCollector.getPpCostCollectorId() == null) {
                ppCostCollectorDao.insert(costCollector);
            } else {
                ppCostCollectorDao.update(costCollector);
            }
            return costCollector;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteCostCollector(Integer collectorId) {
        try { ppCostCollectorDao.deleteById(collectorId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    // ==================== PP_Product_Planning Operations ====================

    public Optional<PPProductPlanning> findProductPlanningById(Integer id) {
        try { return Optional.ofNullable(ppProductPlanningDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public Optional<PPProductPlanning> findProductPlanningByProductAndWarehouse(Integer productId, Integer warehouseId) {
        return ppProductPlanningDao.findByProductAndWarehouse(productId, warehouseId);
    }

    public List<PPProductPlanning> findProductPlanningByProductId(Integer productId) {
        return ppProductPlanningDao.findByProductId(productId);
    }

    public List<PPProductPlanning> findProductPlanningByWarehouseId(Integer warehouseId) {
        return ppProductPlanningDao.findByWarehouseId(warehouseId);
    }

    public List<PPProductPlanning> findProductPlanningByResourceId(Integer resourceId) {
        return ppProductPlanningDao.findByResourceId(resourceId);
    }

    public List<PPProductPlanning> findProductPlanningRequiringMRP() {
        return ppProductPlanningDao.findRequiringMRP();
    }

    public List<PPProductPlanning> findProductPlanningRequiringDRP() {
        return ppProductPlanningDao.findRequiringDRP();
    }

    public List<PPProductPlanning> findProductPlanningWithCreatePlan() {
        return ppProductPlanningDao.findWithCreatePlan();
    }

    public List<PPProductPlanning> findPhantomProducts() {
        return ppProductPlanningDao.findPhantomProducts();
    }

    public List<PPProductPlanning> findMPSItems() {
        return ppProductPlanningDao.findMPSItems();
    }

    public List<PPProductPlanning> findProductPlanningByOrderPolicy(String orderPolicy) {
        return ppProductPlanningDao.findByOrderPolicy(orderPolicy);
    }

    public List<PPProductPlanning> findProductPlanningByPlannerId(Integer plannerId) {
        return ppProductPlanningDao.findByPlannerId(plannerId);
    }

    public PPProductPlanning saveProductPlanning(PPProductPlanning productPlanning) {
        try {
            if (productPlanning.getPpProductPlanningId() == null) {
                ppProductPlanningDao.insert(productPlanning);
            } else {
                ppProductPlanningDao.update(productPlanning);
            }
            return productPlanning;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteProductPlanning(Integer planningId) {
        try { ppProductPlanningDao.deleteById(planningId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }
}
