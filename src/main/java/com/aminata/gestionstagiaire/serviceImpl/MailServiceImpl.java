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

    @Scheduled(cron = "0 0 0 * * ?") // Tous les jours à minuit
    //@Scheduled(cron = "*/10 * * * * *") //
    public void checkAndSendEmails() {
        List<Stage> stages = stageservice.getAllStage();

        // Vérifiez les stages dont la date de fin est échue
        for (Stage stage : stages) {
            if (isDateEchue(stage.getDatefin())) {
                sendEmail(stage.getStagiaire().getEmail(), "Le stage est échu", "Le stage est échu pour le libellé : " + stage.getLibelle());
            }
        }
    }

    private boolean isDateEchue(Date dateFin) {
        Date currentDate = new Date();
        return dateFin != null && dateFin.before(currentDate);
    }

    private void sendEmail(String to, String subject, String text) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(to);
            message.setSubject(subject);
            message.setText(text);

            javamailsender.send(message);
        } catch (Exception e) {
            // Gérer l'exception (journalisation, notification, etc.)
            e.printStackTrace();
        }
    }
}