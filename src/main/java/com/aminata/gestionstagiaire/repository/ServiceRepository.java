package com.aminata.gestionstagiaire.repository;

import com.aminata.gestionstagiaire.entites.Departement;
import com.aminata.gestionstagiaire.entites.Service;
import com.aminata.gestionstagiaire.entites.Stage;
import com.aminata.gestionstagiaire.entites.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource(path = "lesservices")
public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findByDepartement(Departement departement);
    @RestResource(path = "/service")
    List<Service> findByNomContains(@Param("service") String nom);
    Service findByNom(String nom);
    List<Service> findByNombreemploye(Long nombreemploye);
}
