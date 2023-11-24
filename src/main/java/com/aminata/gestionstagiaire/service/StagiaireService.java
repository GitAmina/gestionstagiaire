package com.aminata.gestionstagiaire.service;

import com.aminata.gestionstagiaire.entites.Stagiaire;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface StagiaireService {
    Stagiaire saveStagiaire(Stagiaire s);
    Stagiaire updatestagiaire(Stagiaire s);
    void deleteStagiaire(Stagiaire s);
    void deleteStagiaireById(Long uio);
    Stagiaire getStagiaireById(Long uio);
    List<Stagiaire> getAllStagiaire();
    Stagiaire findByEmail(String email);
    List<Stagiaire> findByNom(String nom);
    List<Stagiaire> findByOrderByNomAsc();
    Stagiaire findByUio(Long uio);
    List<Stagiaire> findByDatenaiss(Date datenaiss);
}
