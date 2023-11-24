package com.aminata.gestionstagiaire.service;

import com.aminata.gestionstagiaire.entites.Piece;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public interface PieceService {
    Piece savePiece(Piece p);
    Piece updatePiece(Piece p);
    void deletePiece(Piece p);
    void deletePieceById(Long uio);
    Piece getPieceById(Long uio);
    List<Piece> getAllPiece();
    List<Piece> findByDaterecuperation(Date daterecuperation);
}
