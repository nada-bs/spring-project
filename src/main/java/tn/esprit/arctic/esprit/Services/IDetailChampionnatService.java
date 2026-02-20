package tn.esprit.arctic.esprit.Services;

import tn.esprit.arctic.esprit.entities.DetailChampionnat;
import java.util.List;

public interface IDetailChampionnatService {
    DetailChampionnat ajouterDetail(DetailChampionnat detail);
    List<DetailChampionnat> ajouterDetails(List<DetailChampionnat> details);
    DetailChampionnat modifierDetail(DetailChampionnat detail);
    void supprimerDetail(String code);
    List<DetailChampionnat> listDetails();
    DetailChampionnat recupererDetail(String code);
}