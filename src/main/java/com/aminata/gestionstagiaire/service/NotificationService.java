package com.aminata.gestionstagiaire.service;

import com.aminata.gestionstagiaire.entites.Notification;
import com.aminata.gestionstagiaire.entites.Stagiaire;
import com.aminata.gestionstagiaire.entites.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public interface NotificationService {
    Notification saveNotification(Notification n);
    Notification updateNotification(Notification n);
    void deleteNotification(Notification n);
    void deleteNotificationById(Long uio);
    Notification getNotificationById(Long uio);
    List<Notification> getAllNotification();
    List<Notification> findByDateenvoie(Date dateenvoie);
    List<Notification> findByStagiaire(Stagiaire s);
    List<Notification> findByUtilisateur(Utilisateur u);
}
