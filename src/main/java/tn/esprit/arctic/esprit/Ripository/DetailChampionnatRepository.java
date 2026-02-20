package tn.esprit.arctic.esprit.Ripository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.esprit.entities.DetailChampionnat;

public interface DetailChampionnatRepository extends JpaRepository<DetailChampionnat, String> {
}