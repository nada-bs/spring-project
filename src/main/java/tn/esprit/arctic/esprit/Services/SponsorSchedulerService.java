package tn.esprit.arctic.esprit.Services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.esprit.entities.Sponsor;
import tn.esprit.arctic.esprit.Ripository.ContratRepository;
import tn.esprit.arctic.esprit.Ripository.SponsorRipository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class SponsorSchedulerService {
    private final SponsorRipository sponsorRepository;
    private final ContratRepository contratRepository;

    /**
     * 5.2 - S'exécute tous les lundis à 9h
     * Affiche le pourcentage du budget dépensé par chaque sponsor
     * pour les contrats de l'année en cours
     */
    @Scheduled(cron = "0 0 9 * * MON")
    public void afficherPourcentageBudgetDepenseParSponsor() {
        List<Sponsor> sponsors = sponsorRepository.findAll();

        for (Sponsor sponsor : sponsors) {
            Double budgetAnnuel = sponsor.getBudgetAnnuel();
            if (budgetAnnuel == null || budgetAnnuel <= 0) {
                log.warn("Sponsor: {} - Budget annuel non défini", sponsor.getNom());
                continue;
            }

            Double montantContrats = contratRepository.sumMontantContratsBySponsorForCurrentYear(sponsor.getIdSponsor());
            if (montantContrats == null) montantContrats = 0.0;

            float pourcentage = (float) ((montantContrats / budgetAnnuel) * 100);

            log.info("sponsor: {} pourcentage : {} %", sponsor.getNom(), pourcentage);

            if (pourcentage > 70 && pourcentage < 100) {
                log.info("attention budget presque consommé : {} % !", pourcentage);
            } else if (pourcentage >= 100) {
                log.warn("budget dépassé!! vous ne pouvez plus faire de contrats");
                sponsor.setBloquerContrat(true);
                sponsorRepository.save(sponsor);
            }
        }
    }
}