package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;
@Entity
@Table(name = "DetailChampionnat")

public class DetailChampionnat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String description;
}
