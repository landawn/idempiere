package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ProductionDao;
import org.idempiere.dao.ProductionLineDao;
import org.idempiere.dao.BOMDao;
import org.idempiere.dao.BOMLineDao;
import org.idempiere.model.Production;
import org.idempiere.model.ProductionLine;
import org.idempiere.model.BOM;
import org.idempiere.model.BOMLine;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Production entity operations.
 */
@Service
@Transactional
public class ProductionService {

    private final ProductionDao productionDao;
    private final ProductionLineDao productionLineDao;
    private final BOMDao bomDao;
    private final BOMLineDao bomLineDao;

    public ProductionService(ProductionDao productionDao, ProductionLineDao productionLineDao,
                             BOMDao bomDao, BOMLineDao bomLineDao) {
        this.productionDao = productionDao;
        this.productionLineDao = productionLineDao;
        this.bomDao = bomDao;
        this.bomLineDao = bomLineDao;
    }

    // Production methods
    public Optional<Production> findById(Integer id) {
        try { return Optional.ofNullable(productionDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Production> findAll() {
        return productionDao.findAllActive();
    }

    public Optional<Production> findByDocumentNo(String documentNo, Integer clientId) {
        return productionDao.findByDocumentNo(documentNo, clientId);
    }

    public List<Production> findByDocStatus(String docStatus, Integer clientId) {
        return productionDao.findByDocStatus(docStatus, clientId);
    }

    public List<Production> findByProduct(Integer productId) {
        return productionDao.findByProduct(productId);
    }

    public Production save(Production production) {
        try {
            if (production.getMProductionId() == null) {
                productionDao.insert(production);
            } else {
                productionDao.update(production);
            }
            return production;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // ProductionLine methods
    public List<ProductionLine> findLinesByProduction(Integer productionId) {
        return productionLineDao.findByProduction(productionId);
    }

    public ProductionLine saveLine(ProductionLine line) {
        try {
            if (line.getMProductionLineId() == null) {
                productionLineDao.insert(line);
            } else {
                productionLineDao.update(line);
            }
            return line;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // BOM methods
    public Optional<BOM> findBOMById(Integer id) {
        try { return Optional.ofNullable(bomDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<BOM> findBOMsByProduct(Integer productId) {
        return bomDao.findByProduct(productId);
    }

    public Optional<BOM> findBOMByProductAndType(Integer productId, String bomType) {
        return bomDao.findByProductAndType(productId, bomType);
    }

    public Optional<BOM> findBOMByName(String name, Integer clientId) {
        return bomDao.findByName(name, clientId);
    }

    public List<BOM> findBOMsByClient(Integer clientId) {
        return bomDao.findByClient(clientId);
    }

    public BOM saveBOM(BOM bom) {
        try {
            if (bom.getMBomId() == null) {
                bomDao.insert(bom);
            } else {
                bomDao.update(bom);
            }
            return bom;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // BOMLine methods
    public List<BOMLine> findBOMLinesByBOM(Integer bomId) {
        return bomLineDao.findByBOM(bomId);
    }

    public BOMLine saveBOMLine(BOMLine line) {
        try {
            if (line.getMBomLineId() == null) {
                bomLineDao.insert(line);
            } else {
                bomLineDao.update(line);
            }
            return line;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { productionDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return productionDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
