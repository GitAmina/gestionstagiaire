package com.aminata.gestionstagiaire;

import com.aminata.gestionstagiaire.entites.Stagiaire;
import com.aminata.gestionstagiaire.repository.StagiaireRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;
import java.util.List;

@SpringBootTest
class StagiaireApplicationTests {
    @Autowired
    private StagiaireRepository stagiaireRepository;

    @Test
    public void testCreateStagiaire() {
        //Stagiaire s = new Stagiaire(2045918763L, "Niane", "Aminata", new Date(101,11,29), 41836975L, "aminataniane@gmail.com", "ugb");
        //stagiaireRepository.save(s);
    }

    @Test
    public void testFindStagaire() {
        Stagiaire s1 = stagiaireRepository.findById(1L).get();
        System.out.println(s1);
    }

    @Test
    public void testUpdateStagiaire() {
        Stagiaire s = stagiaireRepository.findById(1L).get();
        s.setUuid("a0578bgy7lj");
        stagiaireRepository.save(s);
        System.out.println(s);
    }

    @Test
    public void testDeleteStagiaire() {
        stagiaireRepository.deleteById(7L);
    }

    @Test
    public void testFindAllStagiaire() {
        List<Stagiaire> stagiaires = stagiaireRepository.findAll();
        for (Stagiaire s:stagiaires) {
            System.out.println(s);
        }
    }

    @Test
    public void testFindStagiaireByNni() {
        //Stagiaire s = stagiaireRepository.findByNni(2489631756L);
        //System.out.println(s);
    }

    @Test
    public void testFindStagiaireByTelephone() {
        //Stagiaire s = stagiaireRepository.findByTelephone(36874596L);
        //System.out.println(s);
    }

    @Test
    public void testFindStagiaireByEmail() {
        Stagiaire s = stagiaireRepository.findByEmail("suabdoulaye@gmail.com");
        System.out.println(s);
    }

    @Test
    public void testFindStagiaireByNom() {
        List<Stagiaire> stagiaires = stagiaireRepository.findByNom("Ba");
        System.out.println(stagiaires);
    }

    @Test
    public void testFindStagiaireByPrenomNom() {
        List<Stagiaire> stagiaires = stagiaireRepository.findByPrenomNom("Aminata","Niane");
        for (Stagiaire s:stagiaires) {
            System.out.println(s);
        }
    }

    @Test
    public void testFindStagiaireByPrenomNom1() {
        List<Stagiaire> stagiaires = stagiaireRepository.findByPrenomNom1("Ibrahim","Ba");
        for (Stagiaire s:stagiaires) {
            System.out.println(s);
        }
    }

    @Test
    public void testFindByOrderByNomASC() {
        List<Stagiaire> stagiaires = stagiaireRepository.findByOrderByNomAsc();
        for (Stagiaire s : stagiaires) {
            System.out.println(s);
        }
    }

}