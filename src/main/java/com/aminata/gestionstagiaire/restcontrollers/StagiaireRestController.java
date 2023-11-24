package com.aminata.gestionstagiaire.restcontrollers;

import com.aminata.gestionstagiaire.entites.Stagiaire;
import com.aminata.gestionstagiaire.service.StagiaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.SecureRandom;
import java.util.List;

@RestController
@RequestMapping("/stagiaire")
@CrossOrigin
public class StagiaireRestController {
    @Autowired
    StagiaireService stagiaireService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Stagiaire> getAllStagiaire() {
        return stagiaireService.getAllStagiaire();
    }

    @RequestMapping(value = ("/{uio}"),method = RequestMethod.GET)
    public Stagiaire getStagiaireById(@PathVariable("uio") Long uio) {
        return stagiaireService.getStagiaireById(uio);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Stagiaire createStagiaire(@RequestBody Stagiaire stagiaire) {
        return stagiaireService.saveStagiaire(stagiaire);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Stagiaire updateStagiaire(@RequestBody Stagiaire stagiaire) {
        return stagiaireService.updatestagiaire(stagiaire);
    }

    @RequestMapping(value = ("/{uio}"), method = RequestMethod.DELETE)
    public void deleteStagiaireById(@PathVariable("uio") Long uio) {
        stagiaireService.deleteStagiaireById(uio);
    }
}
