package tn.esprit.arctic.esprit.Services;

import tn.esprit.arctic.esprit.entities.Contrat;
import java.util.List;

public interface IContratService {
    Contrat ajouterContrat(Contrat contrat);
    List<Contrat> ajouterContrats(List<Contrat> contrats);
    Contrat modifierContrat(Contrat contrat);
    void supprimerContrat(Long id);
    List<Contrat> listContrats();
    Contrat recupererContrat(Long id);
}