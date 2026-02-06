package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "sponsor")
public class Sponsor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSponsor;
    

    private String nom;
    

    private String pays;
    

    private Float budgetAnnuel;
    

    private Boolean bloquerContrat;
}
