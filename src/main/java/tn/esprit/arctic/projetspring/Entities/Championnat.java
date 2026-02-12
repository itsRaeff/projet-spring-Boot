package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;

import java.util.List;

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


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "championnat_id", referencedColumnName = "id")
    private DetailChampionnat detailChampionnat;

    @OneToMany(mappedBy = "championnat")
    private List<Course> courses;


}
