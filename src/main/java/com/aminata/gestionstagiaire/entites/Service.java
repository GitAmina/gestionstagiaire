package com.aminata.gestionstagiaire.entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Service {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long uio;
    @NonNull
    private String uuid = genererRandomUUID();
    @NonNull
    private String nom;
    private Long nombreemploye;

    public Service(String nom, Long nombre_employe) {
        this.uuid = genererRandomUUID();
        this.nom = nom;
        this.nombreemploye = nombre_employe;
    }

    @OneToMany (mappedBy = "service", fetch = FetchType.EAGER)
    private List<Stage> stages;

    @ManyToOne
    private Departement departement;

    private String genererRandomUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
    }
}
