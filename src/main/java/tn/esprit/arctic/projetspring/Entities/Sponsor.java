package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sponsor")
public class Sponsor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSponsor;
    
    @Column(nullable = false)
    private String nom;
    
    @Column(nullable = false)
    private String pays;
    
    @Column(nullable = false)
    private Float budgetAnnuel;

    Boolean archived = false;
    LocalDate dateCreation = LocalDate.now();
    LocalDate dateDerniereModification;

    @Column(nullable = false)
    private Boolean bloquerContrat = false;

    @OneToMany(mappedBy = "sponsor")
    private List<Contrat> contrats;

}
