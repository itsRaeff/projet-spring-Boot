package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "championnat")
public class Championnat {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChampionnat;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Categorie categorie;
    
    @Column(nullable = false)
    private String libelle;
    
    @Column(nullable = false)
    private Integer annee;
}
