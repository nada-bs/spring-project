package tn.esprit.arctic.esprit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.esprit.Services.ISponsorService;
import tn.esprit.arctic.esprit.entities.Sponsor;
import java.util.List;

@RestController
@RequestMapping("/api/sponsors")
public class SponsorController {

    @Autowired
    private ISponsorService sponsorService;

    @PostMapping("/add")
    public Sponsor ajouterSponsor(@RequestBody Sponsor sponsor) {
        return sponsorService.ajouterSponsor(sponsor);
    }

    @PostMapping("/addAll")
    public List<Sponsor> ajouterSponsors(@RequestBody List<Sponsor> sponsors) {
        return sponsorService.ajouterSponsors(sponsors);
    }

    @PutMapping("/update")
    public Sponsor modifierSponsor(@RequestBody Sponsor sponsor) {
        return sponsorService.modifierSponsor(sponsor);
    }

    @DeleteMapping("/delete/{idSponsor}")
    public void supprimerSponsor(@PathVariable Long idSponsor) {
        sponsorService.supprimerSponsor(idSponsor);
    }

    @GetMapping("/all")
    public List<Sponsor> listSponsors() {
        return sponsorService.listSponsors();
    }

    @GetMapping("/get/{idSponsor}")
    public Sponsor recupererSponsor(@PathVariable Long idSponsor) {
        return sponsorService.recupererSponsor(idSponsor);
    }

    @PutMapping("/archiver/{idSponsor}")
    public Boolean archiverSponsor(@PathVariable Long idSponsor) {
        return sponsorService.archiverSponsor(idSponsor);
    }
}