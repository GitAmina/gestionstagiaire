package com.aminata.gestionstagiaire.serviceImpl;

import com.aminata.gestionstagiaire.entites.Stage;
import com.aminata.gestionstagiaire.service.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MailServiceImpl {
    @Autowired
    private JavaMailSender javamailsender;

    @Autowired
    private StageService stageservice;

    //@Scheduled(cron = "0 0 0 * * ?") // Tous les jours à minuit
    @Scheduled(cron = "*/10 * * * * *") // Toutes les 10s
    public void checkAndSendEmails() {
        List<Stage> stages = stageservice.getAllStage();

        // Vérifiez les stages dont la date de fin est échue
        for (Stage stage : stages) {
            if (isDateEchue(stage.getDatefin())) {
                boolean isMailSent = sendEmail("lastar.niane@gmail.com", "Le stage est échu", "Le stage : " + stage.getUio() +  " | " + stage.getUuid() +  " | " + stage.getLibelle() + "est echu");
                if (isMailSent) {
                    System.out.println("Email envoyé avec succès");
                } else {
                    System.out.println("Échec de l'envoi de l'email");
                }
            }
        }
    }

    private boolean isDateEchue(Date dateFin) {
        Date currentDate = new Date();
        return dateFin != null && dateFin.before(currentDate);
    }

    private boolean sendEmail(String to, String subject, String text) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(to);
            message.setSubject(subject);
            message.setText(text);

            javamailsender.send(message);
            return true; // Retourne true si l'email est envoyé avec succès
        } catch (Exception e) {
            // Gérer l'exception (journalisation, notification, etc.)
            e.printStackTrace();
            return false; // Retourne false en cas d'échec de l'envoi de l'email
        }
    }
}