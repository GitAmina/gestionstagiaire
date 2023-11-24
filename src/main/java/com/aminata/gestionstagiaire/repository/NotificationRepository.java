package com.aminata.gestionstagiaire.repository;

import com.aminata.gestionstagiaire.entites.Notification;
import com.aminata.gestionstagiaire.entites.Stagiaire;
import com.aminata.gestionstagiaire.entites.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
@RepositoryRestResource(path = "notifications")
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByDateenvoie(Date dateenvoie);
    List<Notification> findByStagiaire(Stagiaire s);
    List<Notification> findByUtilisateur(Utilisateur u);
}
