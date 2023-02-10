package tn.esprit.ds.ski_oussama_jalleli.Entities;

import javax.persistence.*;

@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int numInscription;
   private int numSemaine;
   @ManyToOne
   public Cours cours;
   @ManyToOne
    public Skieur skieur;
}
