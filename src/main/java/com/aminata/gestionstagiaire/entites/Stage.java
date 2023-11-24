package com.aminata.gestionstagiaire.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Stage {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long uio;
    @NonNull
    private String uuid = genererRandomUUID();
    @NonNull
    private String libelle;
    @NonNull
    private Date datedebut;
    @NonNull
    private Date datefin;

    public Stage(String libelle, Date date_debut, Date date_fin) {
        this.uuid = genererRandomUUID();
        this.libelle = libelle;
        this.datedebut = date_debut;
        this.datefin = date_fin;
    }

    @ManyToOne
    @NonNull
    private Stagiaire stagiaire;

    @ManyToOne
    @NonNull
    private Service service;

    private String genererRandomUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
    }
}
