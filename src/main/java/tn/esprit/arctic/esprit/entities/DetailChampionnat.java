package tn.esprit.arctic.esprit.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class DetailChampionnat {

    @Id
    private String code;

    private String description;

    @OneToOne
    @JoinColumn(name = "championnat_id")
    private Championnat championnat;
}

