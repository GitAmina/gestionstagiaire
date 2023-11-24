package com.aminata.gestionstagiaire.repository;

import com.aminata.gestionstagiaire.entites.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "directions")
public interface DirectionRepository extends JpaRepository<Direction, Long> {
    Direction findByNom(String nom);
}
