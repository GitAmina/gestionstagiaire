package com.aminata.gestionstagiaire.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Utilisateur {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long uio;
    @NonNull
    private String uuid = genererRandomUUID();
    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @NonNull
    private String type;
    @NonNull
    private String adresse;
    @NonNull
    private String email;
    @NonNull
    private long telephone;
    @ToString.Exclude
    @NonNull
    private String login;
    @ToString.Exclude
    @NonNull
    private String mdp;

    public Utilisateur(String nom, String prenom, String type, String login, String mdp) {
        this.uuid = genererRandomUUID();
        this.nom = nom;
        this.prenom = prenom;
        this.type = type;
        this.login = login;
        this.mdp = mdp;
    }

    @OneToMany (mappedBy = "utilisateur", fetch = FetchType.EAGER)
    private List<Notification> notifications;

    private String genererRandomUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
    }
}
