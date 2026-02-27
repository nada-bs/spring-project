package tn.esprit.arctic.esprit.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.esprit.Ripository.PiloteRipository;
import tn.esprit.arctic.esprit.entities.Pilote;
import java.util.List;

@Service
public class PiloteService implements IPiloteService {

    @Autowired
    private PiloteRipository pr;

    @Override
    public String addPilote(Pilote pilote) {
        pr.save(pilote);
        return "Pilote ajouté avec succès";
    }

    @Override
    public List<Pilote> listPilotes() {
        return pr.findAll();
    }

    @Override
    public Pilote recupererPilote(Long idPilote) {
        return pr.findById(idPilote).orElse(null);
    }

    @Override
    public Pilote modifierPilote(Pilote pilote) {
        return pr.save(pilote);
    }

    @Override
    public void supprimerPilote(Long idPilote) {
        pr.deleteById(idPilote);
    }
}