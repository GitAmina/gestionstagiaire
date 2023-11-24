package com.aminata.gestionstagiaire.service;

import com.aminata.gestionstagiaire.entites.Direction;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DirectionService {
    Direction saveDirection(Direction d);
    Direction updateDirection(Direction d);
    void deleteDirection(Direction d);
    void deleteDirectionById(Long uio);
    Direction getDirectionById(Long uio);
    List<Direction> getAllDirection();
    Direction findByNom(String nom);
}
