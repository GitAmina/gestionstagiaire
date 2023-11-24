package com.aminata.gestionstagiaire.restcontrollers;

import com.aminata.gestionstagiaire.entites.Historique;
import com.aminata.gestionstagiaire.repository.HistoriqueRepository;
import com.aminata.gestionstagiaire.service.HistoriqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/historique")
@CrossOrigin
public class HistoriqueRestController {
    @Autowired
    HistoriqueService historiqueservice;
    @RequestMapping(method = RequestMethod.GET)
    public List<Historique> getAllHisto() {
        return historiqueservice.getAllHistorique();
    }
}
