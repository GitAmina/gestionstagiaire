package com.aminata.gestionstagiaire.repository;

import com.aminata.gestionstagiaire.entites.Service;
import com.aminata.gestionstagiaire.entites.Stage;
import com.aminata.gestionstagiaire.entites.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource(path = "stages")
public interface StageRepository extends JpaRepository<Stage, Long> {
    List<Stage> findByStagiaire(Stagiaire stagiaire);
    List<Stage> findByService(Service service);
    List<Stage> findByLibelle(String libelle);
    List<Stage> findByDatedebut(Date datedebut);
    List<Stage> findByDatefin(Date datefin);
}
