package tn.esprit.arctic.esprit.Services;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.esprit.Ripository.EquipeRipository;
import tn.esprit.arctic.esprit.entities.Equipe;
import java.util.List;


@Service
public class EquipeService implements IEquipeService {
    EquipeRipository er;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return er.save(equipe);
    }
}
