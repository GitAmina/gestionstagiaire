package com.aminata.gestionstagiaire.serviceImpl;

import com.aminata.gestionstagiaire.entites.Direction;
import com.aminata.gestionstagiaire.repository.DirectionRepository;
import com.aminata.gestionstagiaire.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DirectionServiceImpl implements DirectionService {
    @Autowired
    DirectionRepository directionRepository;
    @Override
    public Direction saveDirection(Direction d) {
        return directionRepository.save(d);
    }

    @Override
    public Direction updateDirection(Direction d) {
        return directionRepository.save(d);
    }

    @Override
    public void deleteDirection(Direction d) {
        directionRepository.delete(d);
    }

    @Override
    public void deleteDirectionById(Long uio) {
        directionRepository.deleteById(uio);
    }

    @Override
    public Direction getDirectionById(Long uio) {
        return directionRepository.findById(uio).get();
    }

    @Override
    public List<Direction> getAllDirection() {
        return directionRepository.findAll();
    }

    @Override
    public Direction findByNom(String nom) {
        return directionRepository.findByNom(nom);
    }
}
