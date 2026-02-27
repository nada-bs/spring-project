package tn.esprit.arctic.esprit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.esprit.Services.IPiloteService;
import tn.esprit.arctic.esprit.entities.Pilote;
import java.util.List;

@RestController
@RequestMapping("/api/pilotes")
public class PiloteController {

    @Autowired
    private IPiloteService piloteService;

    @PostMapping("/add")
    public String addPilote(@RequestBody Pilote pilote) {
        return piloteService.addPilote(pilote);
    }

    @GetMapping("/all")
    public List<Pilote> listPilotes() {
        return piloteService.listPilotes();
    }

    @GetMapping("/get/{id}")
    public Pilote recupererPilote(@PathVariable Long id) {
        return piloteService.recupererPilote(id);
    }

    @PutMapping("/update")
    public Pilote modifierPilote(@RequestBody Pilote pilote) {
        return piloteService.modifierPilote(pilote);
    }

    @DeleteMapping("/delete/{id}")
    public void supprimerPilote(@PathVariable Long id) {
        piloteService.supprimerPilote(id);
    }
}