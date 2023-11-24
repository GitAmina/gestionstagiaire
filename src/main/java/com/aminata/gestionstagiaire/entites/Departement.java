package com.aminata.gestionstagiaire.entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Departement {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long uio;
    @NonNull
    private String uuid = genererRandomUUID();
    @NonNull
    private Long code;
    private String libelle;

    public Departement(Long code, String libelle) {
        this.uuid = genererRandomUUID();
        this.code = code;
        this.libelle = libelle;
    }

    @OneToMany (mappedBy = "departement", fetch = FetchType.EAGER)
    private List<Service> services;

    @ManyToOne
    private Direction direction;

    private String genererRandomUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
    }
}
