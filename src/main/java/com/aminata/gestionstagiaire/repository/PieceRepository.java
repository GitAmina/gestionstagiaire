package com.aminata.gestionstagiaire.repository;

import com.aminata.gestionstagiaire.entites.Piece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
@RepositoryRestResource(path = "pieces")
public interface PieceRepository extends JpaRepository<Piece, Long> {
    List<Piece> findByDaterecuperation(Date daterecuperation);
}
