package tn.esprit.ds.ski_oussama_jalleli.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.ds.ski_oussama_jalleli.Entities.Skieur;
import tn.esprit.ds.ski_oussama_jalleli.repositories.SkieurRepository;

import java.util.List;
@Service
public class ISkieurServiceImp implements ISkieurService {

    @Autowired
    SkieurRepository skieurRepository;

    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }
    @Override
    public Skieur updateSkieur(Skieur skieur){
        return skieurRepository.save(skieur);
    }

    @Override
    public void removeSkieur(Long numSkieur) {
        skieurRepository.deleteById(numSkieur);
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {

        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Assert.isNull(skieur, "not found ");
        return skieur;
    }
}
