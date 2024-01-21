package com.aminata.gestionstagiaire.repository;

import com.aminata.gestionstagiaire.entites.Stagiaire;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.awt.print.Pageable;
import java.util.Date;
import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource(path = "stagiaires")
public interface StagiaireRepository extends JpaRepository<Stagiaire,Long> {
    Stagiaire findByUio(Long uio);
    @RestResource(path = "/prenom")
    List<Stagiaire> findByPrenomContains(@Param("prenom") String prenom);
    @RestResource(path = "/nom")
    List<Stagiaire> findByNomContains(@Param("nom") String nom);
    @RestResource(path = "/nni")
    List<Stagiaire> findByNniContains(@Param("nni") String nni);
    @RestResource(path = "/telephone")
    List<Stagiaire> findByTelephoneContains(@Param("telephone") String telephone);
    Stagiaire findByEmail(String email);

    List<Stagiaire> findByNom(String nom);
    List<Stagiaire> findByDatenaiss(Date datenaiss);
    List<Stagiaire> findByOrderByNomAsc();


    @Query("SELECT s FROM Stagiaire s WHERE s.prenom LIKE %?1 AND s.nom LIKE %?2")
    List<Stagiaire> findByPrenomNom(String prenom, String nom);

    @Query("SELECT s FROM Stagiaire s WHERE s.prenom LIKE %:prenom AND s.nom LIKE %:nom")
    List<Stagiaire> findByPrenomNom1(@Param("prenom") String prenom,@Param("nom") String nom);
}
