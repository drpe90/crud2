package org.example.crud2.service;

import org.example.crud2.model.Position;
import org.example.crud2.repositories.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PositionService {
    @Autowired
    private PositionRepository positionRepository;
    public Position getPositionById(Long id) {
        return positionRepository.findById(id).get();
    }
    public List<Position> getAllPositions() {
        return positionRepository.findAll();
    }
    public Position createPosition(Position position) {
        return positionRepository.save(position);
    }
    public void deletePosition(Long id) {
        positionRepository.deleteById(id);
    }
    public Position updatePosition(Long id, Position position) {
        return positionRepository.save(position);
    }
}
