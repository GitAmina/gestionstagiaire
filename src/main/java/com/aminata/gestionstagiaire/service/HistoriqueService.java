package com.aminata.gestionstagiaire.service;

import com.aminata.gestionstagiaire.entites.Historique;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public interface HistoriqueService {
    Historique saveHistorique(Historique h);
    Historique updateHistorique(Historique h);
    void deleteHistorique(Historique h);
    void deleteHistoriqueById(Long uio);
    Historique getHistoriqueById(Long uio);
    List<Historique> getAllHistorique();
    List<Historique> findByAction(String action);
    List<Historique> findByActeur(String acteur);
    List<Historique> findByDate(Date date);
}
