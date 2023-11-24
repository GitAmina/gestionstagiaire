package com.aminata.gestionstagiaire.serviceImpl;

import com.aminata.gestionstagiaire.entites.Historique;
import com.aminata.gestionstagiaire.repository.HistoriqueRepository;
import com.aminata.gestionstagiaire.service.HistoriqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class HistoriqueServiceImpl implements HistoriqueService {
    @Autowired
    HistoriqueRepository historiqueRepository;
    @Override
    public Historique saveHistorique(Historique h) {
        return historiqueRepository.save(h);
    }

    @Override
    public Historique updateHistorique(Historique h) {
        return historiqueRepository.save(h);
    }

    @Override
    public void deleteHistorique(Historique h) {
        historiqueRepository.delete(h);
    }

    @Override
    public void deleteHistoriqueById(Long uio) {
        historiqueRepository.deleteById(uio);
    }

    @Override
    public Historique getHistoriqueById(Long uio) {
        return historiqueRepository.findById(uio).get();
    }

    @Override
    public List<Historique> getAllHistorique() {
        return historiqueRepository.findAll();
    }

    @Override
    public List<Historique> findByAction(String action) {
        return historiqueRepository.findByAction(action);
    }

    @Override
    public List<Historique> findByActeur(String acteur) {
        return historiqueRepository.findByActeur(acteur);
    }

    @Override
    public List<Historique> findByDate(Date date) {
        return historiqueRepository.findByDate(date);
    }
}
