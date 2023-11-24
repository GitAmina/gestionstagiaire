package com.aminata.gestionstagiaire.serviceImpl;

import com.aminata.gestionstagiaire.entites.Stagiaire;
import com.aminata.gestionstagiaire.repository.StagiaireRepository;
import com.aminata.gestionstagiaire.service.StagiaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class StagiaireServiceImpl implements StagiaireService {
    @Autowired
    StagiaireRepository stagiaireRepository;

    @Override
    public Stagiaire saveStagiaire(Stagiaire s) {
       return stagiaireRepository.save(s);
    }

    @Override
    public Stagiaire updatestagiaire(Stagiaire s) {
        return stagiaireRepository.save(s);
    }

    @Override
    public void deleteStagiaire(Stagiaire s) {
        stagiaireRepository.delete(s);
    }

    @Override
    public void deleteStagiaireById(Long uio) {
        stagiaireRepository.deleteById(uio);
    }

    @Override
    public Stagiaire getStagiaireById(Long uio) {
       return stagiaireRepository.findById(uio).get();
    }

    @Override
    public List<Stagiaire> getAllStagiaire() {
        return stagiaireRepository.findAll();
    }

    @Override
    public Stagiaire findByEmail(String email) {
        return stagiaireRepository.findByEmail(email);
    }

    @Override
    public List<Stagiaire> findByNom(String nom) {
        return stagiaireRepository.findByNom(nom);
    }

    @Override
    public List<Stagiaire> findByOrderByNomAsc() {
        return stagiaireRepository.findByOrderByNomAsc();
    }

    @Override
    public Stagiaire findByUio(Long uio) { return stagiaireRepository.findByUio(uio); }

    @Override
    public List<Stagiaire> findByDatenaiss(Date datenaiss) {
        return stagiaireRepository.findByDatenaiss(datenaiss);
    }
}
