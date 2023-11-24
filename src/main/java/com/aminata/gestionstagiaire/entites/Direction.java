package com.aminata.gestionstagiaire.entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Direction {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long uio;
    @NonNull
    private String uuid = genererRandomUUID();
    @NonNull
    private String nom;

    public Direction(String nom) {
        this.uuid = genererRandomUUID();
        this.nom = nom;
    }

    @OneToMany (mappedBy = "direction", fetch = FetchType.EAGER)
    private List<Departement> departements;

    private String genererRandomUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
    }
}
