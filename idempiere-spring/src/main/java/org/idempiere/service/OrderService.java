package org.idempiere.service;

import java.time.LocalDateTime;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.OrderDao;
import org.idempiere.dao.OrderLineDao;
import org.idempiere.model.Order;
import org.idempiere.model.OrderLine;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Order and OrderLine entity operations.
 */
@Service
@Transactional
public class OrderService {

    private final OrderDao orderDao;
    private final OrderLineDao orderLineDao;

    public OrderService(OrderDao orderDao, OrderLineDao orderLineDao) {
        this.orderDao = orderDao;
        this.orderLineDao = orderLineDao;
    }

    // Order operations

    public Optional<Order> findById(Integer id) {
        try { return Optional.ofNullable(orderDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Order> findAll() {
        return orderDao.findAll();
    }

    public Optional<Order> findByDocumentNo(String documentNo) {
        return orderDao.findByDocumentNo(documentNo);
    }

    public List<Order> findByBPartnerId(Integer bPartnerId) {
        return orderDao.findByBPartnerId(bPartnerId);
    }

    public List<Order> findByDocStatus(String docStatus) {
        return orderDao.findByDocStatus(docStatus);
    }

    public List<Order> findAllSalesOrders() {
        return orderDao.findAllSalesOrders();
    }

    public List<Order> findAllPurchaseOrders() {
        return orderDao.findAllPurchaseOrders();
    }

    public List<Order> findByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return orderDao.findByDateRange(startDate, endDate);
    }

    public List<Order> findAllDraft() {
        return orderDao.findAllDraft();
    }

    public List<Order> findAllCompleted() {
        return orderDao.findAllCompleted();
    }

    public List<Order> findBySalesRepId(Integer salesRepId) {
        return orderDao.findBySalesRepId(salesRepId);
    }

    public Order save(Order order) {
        try {
            if (order.getCOrderId() == null) {
                orderDao.insert(order);
            } else {
                orderDao.update(order);
            }
            return order;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        // First delete all order lines
        List<OrderLine> lines = orderLineDao.findByOrderId(id);
        for (OrderLine line : lines) {
            try {
                orderLineDao.deleteById(line.getCOrderLineId());
            } catch (SQLException e) {
                throw new RuntimeException("Failed to delete order line", e);
            }
        }
        // Then delete the order
        try { orderDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return orderDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }

    // OrderLine operations

    public Optional<OrderLine> findLineById(Integer id) {
        try { return Optional.ofNullable(orderLineDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<OrderLine> findLinesByOrderId(Integer orderId) {
        return orderLineDao.findByOrderId(orderId);
    }

    public List<OrderLine> findLinesByProductId(Integer productId) {
        return orderLineDao.findByProductId(productId);
    }

    public List<OrderLine> findPendingDeliveryLines(Integer orderId) {
        return orderLineDao.findPendingDeliveryByOrderId(orderId);
    }

    public List<OrderLine> findPendingInvoiceLines(Integer orderId) {
        return orderLineDao.findPendingInvoiceByOrderId(orderId);
    }

    public OrderLine saveLine(OrderLine orderLine) {
        try {
            if (orderLine.getCOrderLineId() == null) {
                orderLineDao.insert(orderLine);
            } else {
                orderLineDao.update(orderLine);
            }
            return orderLine;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteLine(Integer lineId) {
        try { orderLineDao.deleteById(lineId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }
}
