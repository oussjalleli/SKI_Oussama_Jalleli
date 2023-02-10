package tn.esprit.ds.ski_oussama_jalleli.Entities;



import javax.persistence.*;
import java.util.Set;

@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private int pente;
    private int longueur;

    @ManyToMany
    Set<Skieur> SkieurSet;
}
