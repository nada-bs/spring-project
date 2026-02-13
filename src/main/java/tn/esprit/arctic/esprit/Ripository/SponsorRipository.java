package tn.esprit.arctic.esprit.Ripository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.arctic.esprit.entities.Sponsor;

public interface SponsorRipository extends JpaRepository<Sponsor,Long > {
}
