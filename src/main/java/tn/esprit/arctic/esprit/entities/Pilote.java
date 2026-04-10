package tn.esprit.arctic.esprit.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pilote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote;

    private String libellep;

    private String prenom;

    private Integer nbPointsTotal;

    private Integer classementGeneral;

    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    @ManyToOne
    private Equipe equipe;
}