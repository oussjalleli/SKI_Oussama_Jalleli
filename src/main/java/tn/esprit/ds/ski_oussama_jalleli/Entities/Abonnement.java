package tn.esprit.ds.ski_oussama_jalleli.Entities;

import javax.persistence.*;
import java.time.LocalDate;

public class Abonnement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long numAbon;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;

    @OneToOne(mappedBy = "abonnement")
    public Skieur skieur;
}
