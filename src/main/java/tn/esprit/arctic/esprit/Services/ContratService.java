package tn.esprit.arctic.esprit.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.esprit.Ripository.ContratRepository;
import tn.esprit.arctic.esprit.entities.Contrat;
import java.util.List;

@Service
public class ContratService implements IContratService {

    @Autowired
    private ContratRepository contratRepository;

    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> ajouterContrats(List<Contrat> contrats) {
        return contratRepository.saveAll(contrats);
    }

    @Override
    public Contrat modifierContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void supprimerContrat(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public List<Contrat> listContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat recupererContrat(Long id) {
        return contratRepository.findById(id).orElse(null);
    }
}