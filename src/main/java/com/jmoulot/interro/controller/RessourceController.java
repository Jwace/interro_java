package com.jmoulot.interro.controller;

import com.jmoulot.interro.dao.RessourceDao;
import com.jmoulot.interro.model.Ressource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class RessourceController {
    @Autowired
    private RessourceDao RessourceDao;

    @GetMapping("/ressource/{id}")
    public Ressource getRessource(@PathVariable int id) {
        Optional<Ressource> optional = RessourceDao.findById(id);

        return (Ressource) RessourceDao.findById(id).orElse(null);
    }

    @GetMapping("/liste-ressources")
    public List<Ressource> getRessources() {
        return RessourceDao.findAll();
    }

    @PostMapping("/ressource")
    public String ajoutRessource(@RequestBody Ressource ressource) {
        RessourceDao.save(ressource);
        return "Ajout d'une nouvelle ressource OK";
    }

    @DeleteMapping("/ressource/{id}")
    public boolean supprimeRessource(@PathVariable int id) {
        RessourceDao.deleteById(id);
        return true;
    }
}
