package tn.esprit.arctic.esprit.Services;

import tn.esprit.arctic.esprit.Ripository.PiloteRipository;
import tn.esprit.arctic.esprit.entities.Pilote;

public class PiloteService implements IPiloteService{
    PiloteRipository pr;

    @Override
    public String addPiole(Pilote pilote) {
        pr.save(pilote);
        return "added successfully ";
    }
}