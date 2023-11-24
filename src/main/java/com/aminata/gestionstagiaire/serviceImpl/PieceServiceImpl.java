package com.aminata.gestionstagiaire.serviceImpl;

import com.aminata.gestionstagiaire.entites.Piece;
import com.aminata.gestionstagiaire.repository.PieceRepository;
import com.aminata.gestionstagiaire.service.PieceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class PieceServiceImpl implements PieceService {

    @Autowired
    PieceRepository pieceRepository;
    @Override
    public Piece savePiece(Piece p) {
        return pieceRepository.save(p);
    }

    @Override
    public Piece updatePiece(Piece p) {
        return pieceRepository.save(p);
    }

    @Override
    public void deletePiece(Piece p) {
        pieceRepository.delete(p);
    }

    @Override
    public void deletePieceById(Long uio) {
        pieceRepository.deleteById(uio);
    }

    @Override
    public Piece getPieceById(Long uio) {
        return pieceRepository.findById(uio).get();
    }

    @Override
    public List<Piece> getAllPiece() {
        return pieceRepository.findAll();
    }

    @Override
    public List<Piece> findByDaterecuperation(Date daterecuperation) {
        return pieceRepository.findByDaterecuperation(daterecuperation);
    }
}
