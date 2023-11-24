package com.aminata.gestionstagiaire.restcontrollers;

import com.aminata.gestionstagiaire.dto.UtilisateurDto;
import com.aminata.gestionstagiaire.entites.Stagiaire;
import com.aminata.gestionstagiaire.entites.Utilisateur;
import com.aminata.gestionstagiaire.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateur")
@CrossOrigin
public class UtilisateurRestController {
    @Autowired
    UtilisateurService utilisateurService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Utilisateur> getAllStagiaire() {
        return utilisateurService.getAllUtilisateur();
    }

    @RequestMapping(method = RequestMethod.POST)
    public  UtilisateurDto createUtilisateur(@RequestBody Utilisateur u) {
        return utilisateurService.saveUtilisateurDto(u);
    }

    @RequestMapping(value = ("/{uio}"),method = RequestMethod.GET)
    public UtilisateurDto getUtilisateurById(@PathVariable("uio") Long uio) {
        return utilisateurService.getUtilisateurByIdDto(uio);
    }
}
