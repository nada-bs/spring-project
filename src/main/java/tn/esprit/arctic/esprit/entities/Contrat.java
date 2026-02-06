package tn.esprit.arctic.esprit.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private Float montant;

    private String annee;

    private Boolean archived;

    @ManyToOne
    private Sponsor sponsor;

    @ManyToOne
    private Equipe equipe;
}
