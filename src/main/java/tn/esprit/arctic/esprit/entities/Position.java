package tn.esprit.arctic.esprit.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPosition;

    private Integer classement;

    private Integer nbrPoints;

    @ManyToOne
    private Pilote pilote;

    @ManyToOne
    private Course course;
}
