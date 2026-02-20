package tn.esprit.arctic.esprit.Ripository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.esprit.entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Long> {
}