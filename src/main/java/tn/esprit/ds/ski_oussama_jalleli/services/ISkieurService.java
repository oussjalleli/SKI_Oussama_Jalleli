package tn.esprit.ds.ski_oussama_jalleli.services;

import tn.esprit.ds.ski_oussama_jalleli.Entities.Skieur;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    Skieur updateSkieur(Skieur skieur);

    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieur (Long numSkieur);
}
