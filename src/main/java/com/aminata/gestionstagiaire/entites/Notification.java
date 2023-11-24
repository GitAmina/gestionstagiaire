package com.aminata.gestionstagiaire.entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Notification {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long uio;
    @NonNull
    private String uuid  = genererRandomUUID();
    @NonNull
    private String contenu;
    @NonNull
    private Date dateenvoie;

    public Notification(String contenu, Date date_envoie) {
        this.uuid = genererRandomUUID();
        this.contenu = contenu;
        this.dateenvoie = date_envoie;
    }

    @ManyToOne
    private Stagiaire stagiaire;

    @ManyToOne
    private Utilisateur utilisateur;

    private String genererRandomUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
    }
}
