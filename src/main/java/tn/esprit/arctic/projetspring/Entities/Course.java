package tn.esprit.arctic.projetspring.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "course")
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCourse;
    
    private String emplacement;
    
    private LocalDate dateDebut;
}
