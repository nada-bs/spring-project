package tn.esprit.arctic.esprit.Ripository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.esprit.entities.Championnat;

public interface ChampionnatRepository extends JpaRepository<Championnat, Long> {
}