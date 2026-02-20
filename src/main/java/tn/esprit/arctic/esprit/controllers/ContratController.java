package tn.esprit.arctic.esprit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.esprit.Services.IContratService;
import tn.esprit.arctic.esprit.entities.Contrat;
import java.util.List;

@RestController
@RequestMapping("/contrats")
public class ContratController {

    @Autowired
    private IContratService contratService;

    @PostMapping
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratService.ajouterContrat(contrat);
    }

    @PostMapping("/all")
    public List<Contrat> ajouterContrats(@RequestBody List<Contrat> contrats) {
        return contratService.ajouterContrats(contrats);
    }

    @PutMapping
    public Contrat modifierContrat(@RequestBody Contrat contrat) {
        return contratService.modifierContrat(contrat);
    }

    @DeleteMapping("/{id}")
    public void supprimerContrat(@PathVariable Long id) {
        contratService.supprimerContrat(id);
    }

    @GetMapping
    public List<Contrat> listContrats() {
        return contratService.listContrats();
    }

    @GetMapping("/{id}")
    public Contrat recupererContrat(@PathVariable Long id) {
        return contratService.recupererContrat(id);
    }
}