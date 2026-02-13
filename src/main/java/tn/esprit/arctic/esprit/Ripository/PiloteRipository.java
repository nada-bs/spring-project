package tn.esprit.arctic.esprit.Ripository; // ou le même package que SponsorRipository

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.esprit.entities.Pilote;

public interface PiloteRipository extends JpaRepository<Pilote, Long> {
}