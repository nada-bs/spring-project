package tn.esprit.arctic.esprit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.esprit.Services.IPiloteService;
import tn.esprit.arctic.esprit.entities.Pilote;

@RestController
@RequestMapping("/pilotes")
public class PiloteController {

    @Autowired
    private IPiloteService piloteService;

    @PostMapping
    public String addPilote(@RequestBody Pilote pilote) {
        return piloteService.addPilote(pilote);
    }
}