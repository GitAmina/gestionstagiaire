package com.aminata.gestionstagiaire.serviceImpl;

import com.aminata.gestionstagiaire.entites.Notification;
import com.aminata.gestionstagiaire.entites.Stagiaire;
import com.aminata.gestionstagiaire.entites.Utilisateur;
import com.aminata.gestionstagiaire.repository.NotificationRepository;
import com.aminata.gestionstagiaire.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    NotificationRepository notificationRepository;

    @Override
    public Notification saveNotification(Notification n) {
        return notificationRepository.save(n);
    }

    @Override
    public Notification updateNotification(Notification n) {
        return notificationRepository.save(n);
    }

    @Override
    public void deleteNotification(Notification n) {
        notificationRepository.delete(n);
    }

    @Override
    public void deleteNotificationById(Long uio) {
        notificationRepository.deleteById(uio);
    }

    @Override
    public Notification getNotificationById(Long uio) {
        return notificationRepository.findById(uio).get();
    }

    @Override
    public List<Notification> getAllNotification() {
        return notificationRepository.findAll();
    }

    @Override
    public List<Notification> findByDateenvoie(Date dateenvoie) {
        return notificationRepository.findByDateenvoie(dateenvoie);
    }

    @Override
    public List<Notification> findByStagiaire(Stagiaire s) {
        return notificationRepository.findByStagiaire(s);
    }

    @Override
    public List<Notification> findByUtilisateur(Utilisateur u) {
        return notificationRepository.findByUtilisateur(u);
    }
}
