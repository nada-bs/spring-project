package tn.esprit.arctic.esprit.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.esprit.Ripository.EquipeRipository;
import tn.esprit.arctic.esprit.entities.Equipe;
import java.util.List;

@Service
public class EquipeService implements IEquipeService {

    @Autowired
    private EquipeRipository er; // Injection correcte du repository

    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return er.save(equipe);
    }

    @Override
    public List<Equipe> listEquipes() {
        return er.findAll();
    }

    @Override
    public Equipe recupererEquipe(Long idEquipe) {
        return er.findById(idEquipe).orElse(null);
    }

    @Override
    public Equipe modifierEquipe(Equipe equipe) {
        return er.save(equipe);
    }

    @Override
    public void supprimerEquipe(Long idEquipe) {
        er.deleteById(idEquipe);
    }
}