package tn.esprit.arctic.esprit.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private Float montant;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    private String annee;

    private Boolean archived = false;

    @ManyToOne
    private Sponsor sponsor;

    @ManyToOne
    private Equipe equipe;
}