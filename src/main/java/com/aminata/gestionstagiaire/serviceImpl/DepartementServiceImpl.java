package com.aminata.gestionstagiaire.serviceImpl;

import com.aminata.gestionstagiaire.entites.Departement;
import com.aminata.gestionstagiaire.entites.Direction;
import com.aminata.gestionstagiaire.repository.DepartementRepository;
import com.aminata.gestionstagiaire.service.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartementServiceImpl implements DepartementService {

    @Autowired
    DepartementRepository departementRepository;

    @Override
    public Departement saveDepartement(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public void deleteDepartement(Departement d) {
        departementRepository.delete(d);
    }

    @Override
    public void deleteDepartementbyId(Long uio) {
        departementRepository.deleteById(uio);
    }

    @Override
    public Departement getDepartementbyId(Long uio) {
        return departementRepository.findById(uio).get();
    }

    @Override
    public List<Departement> getAllDepartement() {
        return departementRepository.findAll();
    }

    @Override
    public Departement findByCode(Long code) {
        return departementRepository.findByCode(code);
    }

    @Override
    public Departement findByLibelle(String libelle) {
        return departementRepository.findByLibelle(libelle);
    }

    @Override
    public List<Departement> findByDirection(Direction direction) {
        return departementRepository.findByDirection(direction);
    }
}
