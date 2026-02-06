package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "championnat")
public class Championnat {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChampionnat;
    
    @Enumerated(EnumType.STRING)
    private Categorie categorie;
    
    private String libelle;
    
    private Integer annee;
}
