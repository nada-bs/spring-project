package tn.esprit.arctic.esprit.Ripository;
p
import tn.esprit.arctic.esprit.entities.Pilote;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PiloteRipository extends JpaRepository<Pilote, Long> {

    List<Pilote> findAllByOrderByNbPointsTotalDesc();

    List<Pilote> findByEquipeIdEquipe(Long equipeId);

    List<Pilote> findByCategorie(Categorie categorie);
}