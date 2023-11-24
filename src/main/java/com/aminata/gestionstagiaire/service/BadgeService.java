package com.aminata.gestionstagiaire.service;

import com.aminata.gestionstagiaire.entites.Badge;
import com.aminata.gestionstagiaire.entites.Stage;
import com.aminata.gestionstagiaire.entites.Stagiaire;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public interface BadgeService {
    Badge saveBadge(Badge b);
    Badge updateBadge(Badge b);
    void deleteBadge(Badge b);
    void deleteBadgeById(Long uio);
    Badge getBadgeById(Long uio);
    List<Badge> getAllBadge();
    List<Badge> findByStage(Stage stage);
    List<Badge> findByStageUio(Long uio);
    List<Badge> findByDatedelivrance(Date datedelivrance);
}
