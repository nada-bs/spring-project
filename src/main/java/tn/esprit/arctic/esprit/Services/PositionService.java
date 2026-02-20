package tn.esprit.arctic.esprit.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.esprit.Ripository.PositionRepository;
import tn.esprit.arctic.esprit.entities.Position;
import java.util.List;

@Service
public class PositionService implements IPositionService {

    @Autowired
    private PositionRepository positionRepository;

    @Override
    public Position ajouterPosition(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public List<Position> ajouterPositions(List<Position> positions) {
        return positionRepository.saveAll(positions);
    }

    @Override
    public Position modifierPosition(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public void supprimerPosition(Long id) {
        positionRepository.deleteById(id);
    }

    @Override
    public List<Position> listPositions() {
        return positionRepository.findAll();
    }

    @Override
    public Position recupererPosition(Long id) {
        return positionRepository.findById(id).orElse(null);
    }
}