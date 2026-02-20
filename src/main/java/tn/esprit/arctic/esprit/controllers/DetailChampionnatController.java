package tn.esprit.arctic.esprit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.esprit.Services.IDetailChampionnatService;
import tn.esprit.arctic.esprit.entities.DetailChampionnat;
import java.util.List;

@RestController
@RequestMapping("/details-championnat")
public class DetailChampionnatController {

    @Autowired
    private IDetailChampionnatService detailService;

    @PostMapping
    public DetailChampionnat ajouterDetail(@RequestBody DetailChampionnat detail) {
        return detailService.ajouterDetail(detail);
    }

    @PostMapping("/all")
    public List<DetailChampionnat> ajouterDetails(@RequestBody List<DetailChampionnat> details) {
        return detailService.ajouterDetails(details);
    }

    @PutMapping
    public DetailChampionnat modifierDetail(@RequestBody DetailChampionnat detail) {
        return detailService.modifierDetail(detail);
    }

    @DeleteMapping("/{code}")
    public void supprimerDetail(@PathVariable String code) {
        detailService.supprimerDetail(code);
    }

    @GetMapping
    public List<DetailChampionnat> listDetails() {
        return detailService.listDetails();
    }

    @GetMapping("/{code}")
    public DetailChampionnat recupererDetail(@PathVariable String code) {
        return detailService.recupererDetail(code);
    }
}