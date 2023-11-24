package com.aminata.gestionstagiaire.service;

import com.aminata.gestionstagiaire.entites.Stage;
import com.aminata.gestionstagiaire.entites.Stagiaire;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface StageService {
    Stage saveStage(Stage s);
    Stage updateStage(Stage s);
    void deleteStage(Stage s);
    void deleteStageById(Long uio);
    Stage getStageById(Long uio);
    List<Stage> getAllStage();
    List<Stage> findByStagiaire(Stagiaire stagiaire);
    List<Stage> findByService(com.aminata.gestionstagiaire.entites.Service service);
    List<Stage> findByLibelle(String libelle);
    List<Stage> findByDatedebut(Date datedebut);
    List<Stage> findByDatefin(Date datefin);

}
