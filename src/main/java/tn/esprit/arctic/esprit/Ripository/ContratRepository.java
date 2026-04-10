package tn.esprit.arctic.esprit.Ripository;

import tn.esprit.arctic.esprit.entities.Contrat;
import tn.esprit.arctic.esprit.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ContratRepository extends JpaRepository<Contrat, Long> {

    // Méthode 1: Utiliser la convention de nommage Spring Data JPA
    List<Contrat> findByEquipeAndArchivedFalse(Equipe equipe);

    // Méthode 2: Alternative avec @Query (si la méthode 1 ne fonctionne pas)
    @Query("SELECT c FROM Contrat c WHERE c.equipe = :equipe AND c.archived = false")
    List<Contrat> findContratsActifsByEquipe(@Param("equipe") Equipe equipe);

    // Méthode 3: Pour trouver tous les contrats non archivés
    List<Contrat> findByArchivedFalse();
}