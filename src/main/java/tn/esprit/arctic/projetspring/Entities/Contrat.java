package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contrat")
public class Contrat {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    
    @Column(nullable = false)
    private Float montant;
    
    @Column(nullable = false)
    private String annee;
    
    @Column(nullable = false)
    private Boolean archived = false;


    @ManyToOne
    @JoinColumn(name = "sponsor_id")
    private Sponsor sponsor;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

}
