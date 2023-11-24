package com.aminata.gestionstagiaire.service;

import com.aminata.gestionstagiaire.dto.UtilisateurDto;
import com.aminata.gestionstagiaire.entites.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UtilisateurService {
    Utilisateur saveUtilisateur(Utilisateur u);
    Utilisateur updateUtilisateur(Utilisateur u);
    void deleteUtilisateur(Utilisateur u);
    void deleteUtilisateurById(Long uio);
    Utilisateur getUtilisateurById(Long uio);
    List<Utilisateur> getAllUtilisateur();
    List<Utilisateur> findByNom(String nom);
    List<Utilisateur> findByType(String type);

    // Pour la classe UtilisateurDto
    UtilisateurDto convertEntityToDto(Utilisateur u);
    UtilisateurDto saveUtilisateurDto(Utilisateur u);
    List<UtilisateurDto> getAllUtilisateurDto();
    UtilisateurDto getUtilisateurByIdDto(Long uio);
    Utilisateur convertDtoToEntity(UtilisateurDto udto);
}
