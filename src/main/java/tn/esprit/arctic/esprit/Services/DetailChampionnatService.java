package tn.esprit.arctic.esprit.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.esprit.Ripository.DetailChampionnatRepository;
import tn.esprit.arctic.esprit.entities.DetailChampionnat;
import java.util.List;

@Service
public class DetailChampionnatService implements IDetailChampionnatService {

    @Autowired
    private DetailChampionnatRepository detailChampionnatRepository;

    @Override
    public DetailChampionnat ajouterDetail(DetailChampionnat detail) {
        return detailChampionnatRepository.save(detail);
    }

    @Override
    public List<DetailChampionnat> ajouterDetails(List<DetailChampionnat> details) {
        return detailChampionnatRepository.saveAll(details);
    }

    @Override
    public DetailChampionnat modifierDetail(DetailChampionnat detail) {
        return detailChampionnatRepository.save(detail);
    }

    @Override
    public void supprimerDetail(String code) {
        detailChampionnatRepository.deleteById(code);
    }

    @Override
    public List<DetailChampionnat> listDetails() {
        return detailChampionnatRepository.findAll();
    }

    @Override
    public DetailChampionnat recupererDetail(String code) {
        return detailChampionnatRepository.findById(code).orElse(null);
    }
}