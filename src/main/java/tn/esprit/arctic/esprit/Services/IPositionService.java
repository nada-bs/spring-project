package tn.esprit.arctic.esprit.Services;

import tn.esprit.arctic.esprit.entities.Position;
import java.util.List;

public interface IPositionService {
    Position ajouterPosition(Position position);
    List<Position> ajouterPositions(List<Position> positions);
    Position modifierPosition(Position position);
    void supprimerPosition(Long id);
    List<Position> listPositions();
    Position recupererPosition(Long id);
}