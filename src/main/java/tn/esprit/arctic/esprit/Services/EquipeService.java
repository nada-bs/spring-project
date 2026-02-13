package tn.esprit.arctic.esprit.Services;
import tn.esprit.arctic.esprit.Ripository.EquipeRipository;
import tn.esprit.arctic.esprit.entities.Equipe;

public class EquipeService implements IEquipeService {
    EquipeRipository er;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return er.save(equipe);
    }
}
