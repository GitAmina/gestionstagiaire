package com.aminata.gestionstagiaire.repository;

import com.aminata.gestionstagiaire.entites.Historique;
import com.aminata.gestionstagiaire.entites.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
import java.util.List;
@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource(path = "historiques")
public interface HistoriqueRepository extends JpaRepository<Historique, Long> {
    List<Historique> findByAction(String action);
    List<Historique> findByActeur(String acteur);
    List<Historique> findByDate(Date date);
}
