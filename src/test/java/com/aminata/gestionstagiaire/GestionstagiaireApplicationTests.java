package com.aminata.gestionstagiaire;

import com.aminata.gestionstagiaire.entites.*;
import com.aminata.gestionstagiaire.repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class GestionstagiaireApplicationTests {
	@Autowired
    BadgeRepository badgeRepository;
    @Autowired
    DepartementRepository departementRepository;
    @Autowired
    DirectionRepository directionRepository;
    @Autowired
    NotificationRepository notificationRepository;
    @Autowired
    PieceRepository pieceRepository;
    @Autowired
    ServiceRepository serviceRepository;
    @Autowired
    StagiaireRepository stagiaireRepository;
    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Test
    public void TestBadgeByEntiteStagiaire() {
        /*Stagiaire s = new Stagiaire(9317854620L, "Niane", "Mariam", new Date(104,1,13), 46842571L, "mariamniane@gmail.com", "esprit");
        stagiaireRepository.save(s);
        Badge b = new Badge(new Date(),s);
        badgeRepository.save(b);
        List<Badge> badges = badgeRepository.findByEntiteStagiaire(s);
        for (Badge b1:badges) {
            System.out.println(b1);
        }*/
    }

    @Test
    public void TestBadgeByIdStagiaire() {
        List<Badge> badges = badgeRepository.findByStageUio(6L);
        for (Badge b : badges) {
            System.out.println(b);
        }
    }

}
