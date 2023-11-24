package com.aminata.gestionstagiaire.repository;

import com.aminata.gestionstagiaire.entites.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RepositoryRestResource(path = "utilisateurs")
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    List<Utilisateur> findByNom(String nom);
    List<Utilisateur> findByType(String type);
}
