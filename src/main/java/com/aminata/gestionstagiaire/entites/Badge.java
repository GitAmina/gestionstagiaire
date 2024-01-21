package com.aminata.gestionstagiaire.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Badge {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long uio;
    @NonNull
    private String uuid  = genererRandomUUID();
    @NonNull
    private Long code;
    @NonNull
    private Date datedelivrance;

    public Badge(Long code, Date date, Stage stage) {
        this.uuid = genererRandomUUID();
        this.datedelivrance = date;
        this.code = code;
        this.stage = stage;
    }

    @OneToOne
    private Stage stage;

    private String genererRandomUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
    }
}
