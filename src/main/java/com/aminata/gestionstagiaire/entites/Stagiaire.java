package com.aminata.gestionstagiaire.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Stagiaire {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long uio;
    @NonNull
    private String uuid = genererRandomUUID();
    @NonNull
    private Long nni;
    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @NonNull
    private Date datenaiss;
    @NonNull
    private Long telephone;
    @NonNull
    private String email;
    @NonNull
    private String adresse;
    @NonNull
    private String genre;
    private String etablissement;
    private String formation;
    private String niveau;
    private String nationnalite;

    public Stagiaire(String uuid, Long nni, String nom, String prenom, Date datenaiss, Long telephone, String email, String adresse, String etablissement, String formation, String niveau, String nationnalite) {
        this.uuid = uuid;
        this.nni = nni;
        this.nom = nom;
        this.prenom = prenom;
        this.datenaiss = datenaiss;
        this.telephone = telephone;
        this.email = email;
        this.adresse = adresse;
        this.etablissement = etablissement;
        this.formation = formation;
        this.niveau = niveau;
        this.nationnalite = nationnalite;
    }

    @OneToMany (mappedBy = "stagiaire", fetch = FetchType.EAGER)
    @JsonIgnore
    private  List<Notification> notifications;

    @OneToMany (mappedBy = "stagiaire", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Stage> stages;

    private String genererRandomUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
    }
}

