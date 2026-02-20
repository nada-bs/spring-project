package tn.esprit.arctic.esprit.Ripository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.esprit.entities.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {
}