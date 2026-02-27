package tn.esprit.arctic.esprit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.esprit.Services.IEquipeService;
import tn.esprit.arctic.esprit.entities.Equipe;
import java.util.List;

@RestController
@RequestMapping("/api/equipes")
public class EquipeController {

    @Autowired
    private IEquipeService equipeService;

    @PostMapping("/add")
    public Equipe ajouterEquipe(@RequestBody Equipe equipe) {
        return equipeService.ajouterEquipe(equipe);
    }

    @GetMapping("/all")
    public List<Equipe> listEquipes() {
        return equipeService.listEquipes();
    }

    @GetMapping("/get/{id}")
    public Equipe recupererEquipe(@PathVariable Long id) {
        return equipeService.recupererEquipe(id);
    }

    @PutMapping("/update")
    public Equipe modifierEquipe(@RequestBody Equipe equipe) {
        return equipeService.modifierEquipe(equipe);
    }

    @DeleteMapping("/delete/{id}")
    public void supprimerEquipe(@PathVariable Long id) {
        equipeService.supprimerEquipe(id);
    }
}