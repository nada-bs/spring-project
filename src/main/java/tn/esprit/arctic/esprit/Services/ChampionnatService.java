package tn.esprit.arctic.esprit.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.esprit.Ripository.ChampionnatRepository;
import tn.esprit.arctic.esprit.entities.Championnat;
import java.util.List;

@Service
public class ChampionnatService implements IChampionnatService {

    @Autowired
    private ChampionnatRepository championnatRepository;

    @Override
    public Championnat ajouterChampionnat(Championnat championnat) {
        return championnatRepository.save(championnat);
    }

    @Override
    public List<Championnat> ajouterChampionnats(List<Championnat> championnats) {
        return championnatRepository.saveAll(championnats);
    }

    @Override
    public Championnat modifierChampionnat(Championnat championnat) {
        return championnatRepository.save(championnat);
    }

    @Override
    public void supprimerChampionnat(Long id) {
        championnatRepository.deleteById(id);
    }

    @Override
    public List<Championnat> listChampionnats() {
        return championnatRepository.findAll();
    }

    @Override
    public Championnat recupererChampionnat(Long id) {
        return championnatRepository.findById(id).orElse(null);
    }
}