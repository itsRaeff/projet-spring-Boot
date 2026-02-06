package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;
@Entity
@Table(name = "DetailChampionnat")

public class DetailChampionnat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String description;
}
