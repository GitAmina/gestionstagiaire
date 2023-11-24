package com.aminata.gestionstagiaire.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Historique {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long uio;
    @NonNull
    private String uuid = genererRandomUUID();
    @NonNull
    private String action;
    @NonNull
    private String acteur;
    @NonNull
    private Date date;
    private String commentaire;

    public Historique(String action, String acteur, Date date, String commentaire) {
        this.uuid = genererRandomUUID();
        this.action = action;
        this.acteur = acteur;
        this.date = date;
        this.commentaire = commentaire;
    }

    private String genererRandomUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
    }
}
