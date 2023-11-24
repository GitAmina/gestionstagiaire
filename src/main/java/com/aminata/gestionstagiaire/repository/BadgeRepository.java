package com.aminata.gestionstagiaire.repository;

import com.aminata.gestionstagiaire.entites.Badge;
import com.aminata.gestionstagiaire.entites.Stage;
import com.aminata.gestionstagiaire.entites.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
import java.util.List;
@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource (path = "badges")
public interface BadgeRepository extends JpaRepository<Badge,Long> {
    List<Badge> findByStage(Stage stage);
    List<Badge> findByStageUio(Long uio);
    List<Badge> findByDatedelivrance(Date datedelivrance);

    //@Query("SELECT b FROM Badge b WHERE b.stagiaire = %?1")
    //List<Badge> findByEntiteStagiaire(Stagiaire stagiaire);
}
