package tn.esprit.arctic.esprit.Services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.esprit.entities.Contrat;
import tn.esprit.arctic.esprit.entities.Equipe;
import tn.esprit.arctic.esprit.entities.Pilote;
import tn.esprit.arctic.esprit.Ripository.ContratRepository;
import tn.esprit.arctic.esprit.Ripository.EquipeRipository;
import tn.esprit.arctic.esprit.Ripository.PiloteRipository;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ContratSchedulerService {
    private final ContratRepository contratRepository;
    private final EquipeRipository equipeRepository;
    private final PiloteRipository piloteRipository;

    @Scheduled(fixedRate = 30000) // toutes les 30 secondes
    public void archiverContratsExpireesEtAffichageContratsActifsParEquipe() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();

        // Archiver les contrats expirés (dateFin < année courante)
        List<Contrat> expiredContracts = contratRepository.findAll().stream()
                .filter(c -> c.getDateFin() != null &&
                        c.getDateFin().getYear() < currentYear &&
                        !c.getArchived())
                .toList();

        expiredContracts.forEach(contrat -> {
            contrat.setArchived(true);
            contratRepository.save(contrat);
            log.info("Contrat archivé : équipe={}, sponsor={}, annéeFin={}",
                    contrat.getEquipe().getLibelle(),
                    contrat.getSponsor().getNom(),
                    contrat.getDateFin().getYear());
        });

        // Afficher les contrats actifs par équipe
        List<Equipe> equipes = equipeRepository.findAll();
        for (Equipe equipe : equipes) {
            List<Contrat> contratsActifs = contratRepository.findByEquipeAndArchivedFalse(equipe);
            for (Contrat contrat : contratsActifs) {
                log.info("L'équipe {} a un contrat d'un montant de {} avec le sponsor {}",
                        equipe.getLibelle(),
                        contrat.getMontant(),
                        contrat.getSponsor().getNom());
            }
        }
    }

    @Scheduled(cron = "0 15 11 31 12 ?")
    public void mettreAJourPointsEtClassementPilotes() {
        log.info("Mise à jour des points et classements des pilotes pour l'année {}", Year.now().getValue());

        List<Pilote> pilotes = piloteRipository.findAll();

        for (Pilote pilote : pilotes) {
            int points = calculerPointsPourPilote(pilote);
            pilote.setNbPointsTotal(points);
        }
        piloteRipository.saveAll(pilotes);

        List<Pilote> pilotesTries = piloteRipository.findAllByOrderByNbPointsTotalDesc();
        int classement = 1;
        for (Pilote pilote : pilotesTries) {
            pilote.setClassementGeneral(classement++);
        }
        piloteRipository.saveAll(pilotesTries);

        log.info("Mise à jour terminée - {} pilotes classés", pilotes.size());
    }

    private int calculerPointsPourPilote(Pilote pilote) {
        // À implémenter selon vos règles métier
        return 0;
    }
}