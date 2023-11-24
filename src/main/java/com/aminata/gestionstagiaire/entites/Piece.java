package com.aminata.gestionstagiaire.entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Piece {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long uio;
    @NonNull
    private String uuid = genererRandomUUID();
    @NonNull
    private Date daterecuperation;

    public Piece(Date date_recuperation) {
        this.uuid = genererRandomUUID();
        this.daterecuperation = date_recuperation;
    }

    @OneToOne
    @NonNull
    private Stagiaire stagiaire;

    private String genererRandomUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
    }
}
