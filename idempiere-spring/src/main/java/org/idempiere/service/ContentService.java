package org.idempiere.service;

import org.idempiere.dao.ContentDao;
import org.idempiere.model.WebContainer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

/**
 * Service for Web Content management operations.
 */
@Service
@Transactional(readOnly = true)
public class ContentService {

    private final ContentDao contentDao;

    public ContentService(ContentDao contentDao) {
        this.contentDao = contentDao;
    }

    public Optional<WebContainer> findById(int containerId) {
        try { return Optional.ofNullable(contentDao.gett(containerId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public Optional<WebContainer> findByName(String name, int webProjectId) {
        return contentDao.findByName(name, webProjectId);
    }

    public List<WebContainer> findByWebProject(int webProjectId) {
        return contentDao.findByWebProject(webProjectId);
    }

    public Optional<WebContainer> findByRelativeUrl(String relativeUrl, int webProjectId) {
        return contentDao.findByRelativeUrl(relativeUrl, webProjectId);
    }

    public List<WebContainer> findValid() {
        return contentDao.findValid();
    }

    public List<WebContainer> findSummaryByProject(int webProjectId) {
        return contentDao.findSummaryByProject(webProjectId);
    }

    @Transactional
    public WebContainer create(WebContainer container) {
        try {
            if (container.getIsValid() == null) {
                container.setIsValid("N");
            }
            if (container.getIsIndexed() == null) {
                container.setIsIndexed("Y");
            }
            if (container.getIsSummary() == null) {
                container.setIsSummary("N");
            }
            if (container.getIsSecure() == null) {
                container.setIsSecure("N");
            }
            contentDao.insert(container);
            return container;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to create", e);
        }
    }

    @Transactional
    public WebContainer update(WebContainer container) {
        try {
            contentDao.update(container);
            return container;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to update", e);
        }
    }

    @Transactional
    public void validate(int containerId) {
        try {
            Optional<WebContainer> containerOpt = Optional.ofNullable(contentDao.gett(containerId));
            if (containerOpt.isPresent()) {
                WebContainer container = containerOpt.get();
                container.setIsValid("Y");
                contentDao.update(container);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed to validate", e);
        }
    }

    @Transactional
    public void invalidate(int containerId) {
        try {
            Optional<WebContainer> containerOpt = Optional.ofNullable(contentDao.gett(containerId));
            if (containerOpt.isPresent()) {
                WebContainer container = containerOpt.get();
                container.setIsValid("N");
                contentDao.update(container);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed to invalidate", e);
        }
    }

    @Transactional
    public void delete(int containerId) {
        try {
            Optional<WebContainer> containerOpt = Optional.ofNullable(contentDao.gett(containerId));
            if (containerOpt.isPresent()) {
                contentDao.delete(containerOpt.get());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
