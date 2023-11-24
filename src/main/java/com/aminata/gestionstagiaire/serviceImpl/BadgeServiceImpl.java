package com.aminata.gestionstagiaire.serviceImpl;

import com.aminata.gestionstagiaire.entites.Badge;
import com.aminata.gestionstagiaire.entites.Stage;
import com.aminata.gestionstagiaire.entites.Stagiaire;
import com.aminata.gestionstagiaire.repository.BadgeRepository;
import com.aminata.gestionstagiaire.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class BadgeServiceImpl implements BadgeService {
    @Autowired
    BadgeRepository badgeRepository;
    @Override
    public Badge saveBadge(Badge b) {
        return badgeRepository.save(b);
    }

    @Override
    public Badge updateBadge(Badge b) {
        return badgeRepository.save(b);
    }

    @Override
    public void deleteBadge(Badge b) {
        badgeRepository.delete(b);
    }

    @Override
    public void deleteBadgeById(Long uio) {
        badgeRepository.deleteById(uio);
    }

    @Override
    public Badge getBadgeById(Long uio) {
        return badgeRepository.findById(uio).get();
    }

    @Override
    public List<Badge> getAllBadge() {
        return badgeRepository.findAll();
    }

    @Override
    public List<Badge> findByStage(Stage stage) {
        return badgeRepository.findByStage(stage);
    }

    @Override
    public List<Badge> findByStageUio(Long uio) {
        return badgeRepository.findByStageUio(uio);
    }

    @Override
    public List<Badge> findByDatedelivrance(Date datedelivrance) {
        return badgeRepository.findByDatedelivrance(datedelivrance);
    }
}
