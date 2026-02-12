package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pilote")
public class Pilote {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote;
    
    @Column(nullable = false)
    private String libellePilote;
    
    @Column(nullable = false)
    private Integer nbPointsTotaux;
    
    @Column(nullable = false)
    private Integer classementGeneraux;

    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

    @OneToMany(mappedBy = "pilote")
    private List<Position> positions;


}
