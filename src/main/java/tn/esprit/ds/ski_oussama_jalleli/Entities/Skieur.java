package tn.esprit.ds.ski_oussama_jalleli.Entities;



import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class Skieur {
    @Id
    private long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaiss;
    private String ville;

    @OneToMany(mappedBy = "skieur", cascade= CascadeType.REMOVE)
    public List<Inscription> inscription;

    @ManyToMany
    public List<Piste> piste;

    @OneToOne(cascade = CascadeType.REMOVE)
    public Abonnement abonnement;
}
