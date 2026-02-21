package tn.esprit.arctic.esprit.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.esprit.Ripository.PiloteRipository;
import tn.esprit.arctic.esprit.entities.Pilote;

@Service
public class PiloteService implements IPiloteService {

    @Autowired
    private PiloteRipository pr;

    @Override
    public String addPilote(Pilote pilote) {
        pr.save(pilote);
        return "Pilote ajouté avec succès";
    }

    // autres méthodes CRUD si présentes
}