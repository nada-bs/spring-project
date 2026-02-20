package tn.esprit.arctic.esprit.controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.esprit.Services.IPositionService;
import tn.esprit.arctic.esprit.entities.Position;
import java.util.List;

@RestController
@RequestMapping("/positions")
public class PositionController {

    @Autowired
    private IPositionService positionService;

    @PostMapping
    public Position ajouterPosition(@RequestBody Position position) {
        return positionService.ajouterPosition(position);
    }

    @PostMapping("/all")
    public List<Position> ajouterPositions(@RequestBody List<Position> positions) {
        return positionService.ajouterPositions(positions);
    }

    @PutMapping
    public Position modifierPosition(@RequestBody Position position) {
        return positionService.modifierPosition(position);
    }

    @DeleteMapping("/{id}")
    public void supprimerPosition(@PathVariable Long id) {
        positionService.supprimerPosition(id);
    }

    @GetMapping
    public List<Position> listPositions() {
        return positionService.listPositions();
    }

    @GetMapping("/{id}")
    public Position recupererPosition(@PathVariable Long id) {
        return positionService.recupererPosition(id);
    }
}