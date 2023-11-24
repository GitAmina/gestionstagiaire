package com.aminata.gestionstagiaire.service;

import com.aminata.gestionstagiaire.entites.Departement;
import com.aminata.gestionstagiaire.entites.Direction;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DepartementService {
    Departement saveDepartement(Departement d);
    Departement updateDepartement(Departement d);
    void deleteDepartement(Departement d);
    void deleteDepartementbyId(Long uio);
    Departement getDepartementbyId(Long uio);
    List<Departement> getAllDepartement();
    Departement findByCode(Long code);
    Departement findByLibelle(String libelle);
    List<Departement> findByDirection(Direction direction);
}
