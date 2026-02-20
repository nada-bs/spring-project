package tn.esprit.arctic.esprit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.esprit.Services.IChampionnatService;
import tn.esprit.arctic.esprit.entities.Championnat;
import java.util.List;

@RestController
@RequestMapping("/championnats")
public class ChampionnatController {

    @Autowired
    private IChampionnatService championnatService;

    @PostMapping
    public Championnat ajouterChampionnat(@RequestBody Championnat championnat) {
        return championnatService.ajouterChampionnat(championnat);
    }

    @PostMapping("/all")
    public List<Championnat> ajouterChampionnats(@RequestBody List<Championnat> championnats) {
        return championnatService.ajouterChampionnats(championnats);
    }

    @PutMapping
    public Championnat modifierChampionnat(@RequestBody Championnat championnat) {
        return championnatService.modifierChampionnat(championnat);
    }

    @DeleteMapping("/{id}")
    public void supprimerChampionnat(@PathVariable Long id) {
        championnatService.supprimerChampionnat(id);
    }

    @GetMapping
    public List<Championnat> listChampionnats() {
        return championnatService.listChampionnats();
    }

    @GetMapping("/{id}")
    public Championnat recupererChampionnat(@PathVariable Long id) {
        return championnatService.recupererChampionnat(id);
    }
}