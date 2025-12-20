package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.CampaignDao;
import org.idempiere.model.Campaign;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * Service class for Campaign entity operations.
 */
@Service
@Transactional
public class CampaignService {

    private final CampaignDao campaignDao;

    public CampaignService(CampaignDao campaignDao) {
        this.campaignDao = campaignDao;
    }

    public Optional<Campaign> findById(Integer id) {
        try { return Optional.ofNullable(campaignDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Campaign> findAll() {
        return campaignDao.findAllActive();
    }

    public List<Campaign> findByClient(Integer clientId) {
        return campaignDao.findByClient(clientId);
    }

    public Optional<Campaign> findByValue(String value, Integer clientId) {
        return campaignDao.findByValueAndClient(value, clientId);
    }

    public List<Campaign> findActive(LocalDateTime currentDate, Integer clientId) {
        return campaignDao.findActiveCampaigns(currentDate);
    }

    public Campaign save(Campaign campaign) {
        try {
            if (campaign.getCCampaignId() == null) {
                campaignDao.insert(campaign);
            } else {
                campaignDao.update(campaign);
            }
            return campaign;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { campaignDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return campaignDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
