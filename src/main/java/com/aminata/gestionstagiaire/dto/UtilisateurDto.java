package com.aminata.gestionstagiaire.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.UUID;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class UtilisateurDto {
    private Long uio;
    private String uuid;
    private String nom;
    private String prenom;
    private String type;
    private String login;
    private String mdp;
}
