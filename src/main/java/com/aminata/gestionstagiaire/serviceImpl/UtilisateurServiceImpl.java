package com.aminata.gestionstagiaire.serviceImpl;

import com.aminata.gestionstagiaire.dto.UtilisateurDto;
import com.aminata.gestionstagiaire.entites.Utilisateur;
import com.aminata.gestionstagiaire.repository.UtilisateurRepository;
import com.aminata.gestionstagiaire.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    UtilisateurRepository utilisateurRepository;
    @Override
    public Utilisateur saveUtilisateur(Utilisateur u) {
        return utilisateurRepository.save(u);
    }

    @Override
    public Utilisateur updateUtilisateur(Utilisateur u) {
        return utilisateurRepository.save(u);
    }

    @Override
    public void deleteUtilisateur(Utilisateur u) {
        utilisateurRepository.delete(u);
    }

    @Override
    public void deleteUtilisateurById(Long uio) {
        utilisateurRepository.deleteById(uio);
    }

    @Override
    public Utilisateur getUtilisateurById(Long uio) {
        return utilisateurRepository.findById(uio).get();
    }

    @Override
    public List<Utilisateur> getAllUtilisateur() {
        return utilisateurRepository.findAll();
    }

    @Override
    public List<Utilisateur> findByNom(String nom) {
        return utilisateurRepository.findByNom(nom);
    }

    @Override
    public List<Utilisateur> findByType(String type) {
        return utilisateurRepository.findByType(type);
    }

    @Override
    public UtilisateurDto convertEntityToDto(Utilisateur u) {
        /*UtilisateurDto utilisateurDto = new UtilisateurDto();

        //Methode 1
        utilisateurDto.setUio(u.getUio());
        utilisateurDto.setUuid(u.getUuid());
        utilisateurDto.setNom(u.getNom());
        utilisateurDto.setPrenom(u.getPrenom());
        utilisateurDto.setType(u.getType());
        utilisateurDto.setLogin(u.getLogin());
        utilisateurDto.setMdp(u.getMdp());
        return utilisateurDto;*/

        //Methode 2 : Utiliser l'annotation @Builder dans la classe UtilisateurDto
        return UtilisateurDto.builder()
                .uio(u.getUio())
                .uuid(u.getUuid())
                .nom(u.getNom())
                .prenom(u.getPrenom())
                .type(u.getType())
                .build();
    }

    @Override
    public UtilisateurDto saveUtilisateurDto(Utilisateur u) {
        return convertEntityToDto(utilisateurRepository.save(u));
    }

    @Override
    public List<UtilisateurDto> getAllUtilisateurDto() {
        //Methode 1 : Classique
        /*List<Utilisateur> utilisateurs = utilisateurRepository.findAll();
        List<UtilisateurDto> utilisateurDtos = new ArrayList<>(utilisateurs.size());
        for (Utilisateur u : utilisateurs) {
            utilisateurDtos.add(convertEntityToDto(u));
        }*/

        // Methode 2 : programmation fonctionnelle JAVA
        return utilisateurRepository.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());
    }

    @Override
    public UtilisateurDto getUtilisateurByIdDto(Long uio) {
        return convertEntityToDto(utilisateurRepository.findById(uio).get());
    }

    @Override
    public Utilisateur convertDtoToEntity(UtilisateurDto udto) {
        Utilisateur u = new Utilisateur();
        u.setUio(udto.getUio());
        u.setUuid(udto.getUuid());
        u.setNom(udto.getNom());
        u.setPrenom(udto.getPrenom());
        u.setType(udto.getType());
        u.setType(udto.getType());
        u.setType(udto.getMdp());
        return u;
    }
}
