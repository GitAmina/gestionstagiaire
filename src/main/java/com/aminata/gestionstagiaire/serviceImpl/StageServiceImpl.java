package com.aminata.gestionstagiaire.serviceImpl;

import com.aminata.gestionstagiaire.entites.Stage;
import com.aminata.gestionstagiaire.entites.Stagiaire;
import com.aminata.gestionstagiaire.repository.StageRepository;
import com.aminata.gestionstagiaire.repository.StagiaireRepository;
import com.aminata.gestionstagiaire.service.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class StageServiceImpl implements StageService {

    @Autowired
    StageRepository stageRepository;
    @Override
    public Stage saveStage(Stage s) {
        return stageRepository.save(s);
    }

    @Override
    public Stage updateStage(Stage s) {
        return stageRepository.save(s);
    }

    @Override
    public void deleteStage(Stage s) {
        stageRepository.delete(s);
    }

    @Override
    public void deleteStageById(Long uio) {
        stageRepository.deleteById(uio);
    }

    @Override
    public Stage getStageById(Long uio) {
        return stageRepository.findById(uio).get();
    }

    @Override
    public List<Stage> getAllStage() {
        return stageRepository.findAll();
    }

    @Override
    public List<Stage> findByStagiaire(Stagiaire stagiaire) {
        return stageRepository.findByStagiaire(stagiaire);
    }

    @Override
    public List<Stage> findByService(com.aminata.gestionstagiaire.entites.Service service) {
        return stageRepository.findByService(service);
    }

    @Override
    public List<Stage> findByLibelle(String libelle) {
        return stageRepository.findByLibelle(libelle);
    }

    @Override
    public List<Stage> findByDatedebut(Date datedebut) {
        return stageRepository.findByDatedebut(datedebut);
    }

    @Override
    public List<Stage> findByDatefin(Date datefin) {
        return stageRepository.findByDatefin(datefin);
    }
}
