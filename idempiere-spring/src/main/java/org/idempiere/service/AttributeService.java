package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.AttributeSetDao;
import org.idempiere.dao.AttributeDao;
import org.idempiere.dao.AttributeSetInstanceDao;
import org.idempiere.dao.AttributeInstanceDao;
import org.idempiere.model.AttributeSet;
import org.idempiere.model.Attribute;
import org.idempiere.model.AttributeSetInstance;
import org.idempiere.model.AttributeInstance;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Attribute entity operations.
 */
@Service
@Transactional
public class AttributeService {

    private final AttributeSetDao attributeSetDao;
    private final AttributeDao attributeDao;
    private final AttributeSetInstanceDao attributeSetInstanceDao;
    private final AttributeInstanceDao attributeInstanceDao;

    public AttributeService(AttributeSetDao attributeSetDao, AttributeDao attributeDao,
                            AttributeSetInstanceDao attributeSetInstanceDao, AttributeInstanceDao attributeInstanceDao) {
        this.attributeSetDao = attributeSetDao;
        this.attributeDao = attributeDao;
        this.attributeSetInstanceDao = attributeSetInstanceDao;
        this.attributeInstanceDao = attributeInstanceDao;
    }

    // AttributeSet methods
    public Optional<AttributeSet> findAttributeSetById(Integer id) {
        try {
            return Optional.ofNullable(attributeSetDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<AttributeSet> findAttributeSetsByClient(Integer clientId) {
        return attributeSetDao.findByClient(clientId);
    }

    public Optional<AttributeSet> findAttributeSetByName(String name, Integer clientId) {
        return attributeSetDao.findByName(name, clientId);
    }

    public List<AttributeSet> findInstanceAttributeSets(Integer clientId) {
        return attributeSetDao.findByInstanceAttribute("Y", clientId);
    }

    public AttributeSet saveAttributeSet(AttributeSet attributeSet) {
        try {
            if (attributeSet.getMAttributeSetId() == null) {
                attributeSetDao.insert(attributeSet);
            } else {
                attributeSetDao.update(attributeSet);
            }
            return attributeSet;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Attribute methods
    public Optional<Attribute> findAttributeById(Integer id) {
        try {
            return Optional.ofNullable(attributeDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<Attribute> findAttributesByAttributeSet(Integer attributeSetId) {
        return attributeDao.findByAttributeSet(attributeSetId);
    }

    public Optional<Attribute> findAttributeByName(String name, Integer attributeSetId) {
        return attributeDao.findByName(name, attributeSetId);
    }

    public Attribute saveAttribute(Attribute attribute) {
        try {
            if (attribute.getMAttributeId() == null) {
                attributeDao.insert(attribute);
            } else {
                attributeDao.update(attribute);
            }
            return attribute;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // AttributeSetInstance methods
    public Optional<AttributeSetInstance> findASIById(Integer id) {
        try {
            return Optional.ofNullable(attributeSetInstanceDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<AttributeSetInstance> findASIsByAttributeSet(Integer attributeSetId) {
        return attributeSetInstanceDao.findByAttributeSet(attributeSetId);
    }

    public Optional<AttributeSetInstance> findASIBySerialNo(String serNo) {
        return attributeSetInstanceDao.findBySerialNo(serNo);
    }

    public List<AttributeSetInstance> findASIsByLot(String lot) {
        return attributeSetInstanceDao.findByLot(lot);
    }

    public AttributeSetInstance saveASI(AttributeSetInstance asi) {
        try {
            if (asi.getMAttributeSetInstanceId() == null) {
                attributeSetInstanceDao.insert(asi);
            } else {
                attributeSetInstanceDao.update(asi);
            }
            return asi;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // AttributeInstance methods
    public List<AttributeInstance> findAttributeInstancesByASI(Integer asiId) {
        return attributeInstanceDao.findByAttributeSetInstance(asiId);
    }

    public AttributeInstance saveAttributeInstance(AttributeInstance instance) {
        try {
            if (instance.getMAttributeSetInstanceId() == null) {
                attributeInstanceDao.insert(instance);
            } else {
                attributeInstanceDao.update(instance);
            }
            return instance;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteAttributeSet(Integer id) {
        try {
            attributeSetDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    public boolean attributeSetExists(Integer id) {
        try {
            return attributeSetDao.exists(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to check exists", e);
        }
    }
}
