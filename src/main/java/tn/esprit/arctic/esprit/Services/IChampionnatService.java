package tn.esprit.arctic.esprit.Services;

import tn.esprit.arctic.esprit.entities.Championnat;
import java.util.List;

public interface IChampionnatService {
    Championnat ajouterChampionnat(Championnat championnat);
    List<Championnat> ajouterChampionnats(List<Championnat> championnats);
    Championnat modifierChampionnat(Championnat championnat);
    void supprimerChampionnat(Long id);
    List<Championnat> listChampionnats();
    Championnat recupererChampionnat(Long id);
}