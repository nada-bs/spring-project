package tn.esprit.arctic.esprit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.esprit.Services.IEquipeService;
import tn.esprit.arctic.esprit.entities.Equipe;

@RestController
@RequestMapping("/equipes")
public class EquipeController {

    @Autowired
    private IEquipeService equipeService;

    @PostMapping
    public Equipe ajouterEquipe(@RequestBody Equipe equipe) {
        return equipeService.ajouterEquipe(equipe);
    }
}