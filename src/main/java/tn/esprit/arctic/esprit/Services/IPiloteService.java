package tn.esprit.arctic.esprit.Services;

import tn.esprit.arctic.esprit.entities.Pilote;
import java.util.List;

public interface IPiloteService {
    String addPilote(Pilote pilote);
    List<Pilote> listPilotes();
    Pilote recupererPilote(Long idPilote);
    Pilote modifierPilote(Pilote pilote);
    void supprimerPilote(Long idPilote);
}