package com.aminata.gestionstagiaire.repository;

import com.aminata.gestionstagiaire.entites.Departement;
import com.aminata.gestionstagiaire.entites.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RepositoryRestResource (path = "departements")
public interface DepartementRepository extends JpaRepository<Departement, Long> {
    Departement findByCode(Long code);
    Departement findByLibelle(String libelle);
    List<Departement> findByDirection(Direction direction);
}
