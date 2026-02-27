package tn.esprit.arctic.esprit.Services;

import tn.esprit.arctic.esprit.entities.Equipe;
import java.util.List;

public interface IEquipeService {
    Equipe ajouterEquipe(Equipe equipe);
    List<Equipe> listEquipes();
    Equipe recupererEquipe(Long idEquipe);
    Equipe modifierEquipe(Equipe equipe);
    void supprimerEquipe(Long idEquipe);
}