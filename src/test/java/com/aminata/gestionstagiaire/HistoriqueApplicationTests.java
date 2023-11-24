package com.aminata.gestionstagiaire;

import com.aminata.gestionstagiaire.entites.Historique;
import com.aminata.gestionstagiaire.repository.HistoriqueRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class HistoriqueApplicationTests {
    @Autowired
    private HistoriqueRepository historiqueRepository;

    @Test
    public void testCreateHistorique() {
        Historique h = new Historique(1L,"h1","Essai","Aminata", new Date(),"essai d'ajout");
        historiqueRepository.save(h);
    }

    @Test
    public void testFindHistorique() {
        Historique h = historiqueRepository.findById(2L).get();
        System.out.println(h);
    }

    @Test
    public void testUpdateHistorique() {
        Historique h = historiqueRepository.findById(2L).get();
        h.setActeur("Mohamed");
        historiqueRepository.save(h);
        System.out.println(h);
    }

    @Test
    public void testDeleteHistorique() {
        historiqueRepository.deleteById(1L);
    }

    @Test
    public void testFindAllHistorique() {
        List<Historique> histo = historiqueRepository.findAll();
        for (Historique h:histo) {
            System.out.println(h);

        }
    }
}
