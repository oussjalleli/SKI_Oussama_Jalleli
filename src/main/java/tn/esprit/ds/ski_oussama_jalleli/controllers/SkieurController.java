package tn.esprit.ds.ski_oussama_jalleli.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_oussama_jalleli.Entities.Skieur;
import tn.esprit.ds.ski_oussama_jalleli.repositories.SkieurRepository;
import tn.esprit.ds.ski_oussama_jalleli.services.ISkieurService;

import java.util.List;

@RestController
@RequestMapping
public class SkieurController {
    @Autowired
    ISkieurService skieurService;
    @Autowired
    private SkieurRepository skieurRepository;

    @GetMapping
    public List<Skieur> getAll(){
     return skieurService.retrieveAllSkieurs();
    }

    @GetMapping("{numSkieur}")
    public Skieur retrieveSkieur (@PathVariable Long numSkieur){
        return retrieveSkieur(numSkieur);
    };

    @PostMapping
    public Skieur addSkieur(@RequestBody Skieur skieur){
        return skieurService.addSkieur(skieur);
    }
    @PutMapping

    public Skieur updateSkieur(@RequestBody Skieur skieur){
        return skieurService.updateSkieur(skieur);
    }
    @DeleteMapping("{numSkieur}") //kima l'variable elli 3adineha fel fonction
   public void removeSkieur (@PathVariable Long numSkieur){
        skieurService.removeSkieur(numSkieur);
   };

}
