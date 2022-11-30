package com.jmoulot.interro.controller;

import com.jmoulot.interro.dao.UtilisateurDao;
import com.jmoulot.interro.model.Ressource;
import com.jmoulot.interro.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UtilisateurController {

    @Autowired
    private UtilisateurDao utilisateurDao;

    @GetMapping("/utilisateur/{id}")
    public Utilisateur getUtilisateur(@PathVariable int id) {
        Optional<Utilisateur> optional = utilisateurDao.findById(id);

        return utilisateurDao.findById(id).orElse(null);
    }

    @GetMapping("/liste-utilisateurs")
    public List<Utilisateur> getUtilisateurs() {
        return utilisateurDao.findAll();
    }

    @GetMapping("/utilisateur-par-nom/{nom}")
    public Utilisateur getByNom(@PathVariable String nom) {
        return utilisateurDao.findByNom(nom);
    }

    @GetMapping("/utilisateur-par-prenom/{prenom}")
    public Utilisateur getByPrenom(@PathVariable String prenom) {
        return utilisateurDao.findByPrenom(prenom);
    }

    @PostMapping("/utilisateur")
    public String ajoutUtilisateur(@RequestBody Utilisateur utilisateur) {
        utilisateurDao.save(utilisateur);
        return "Ajout utilisateur OK";
    }

    @DeleteMapping("/utilisateur/{id}")
    public boolean supprimeUtilisateur(@PathVariable int id) {
        utilisateurDao.deleteById(id);
        return true;
    }
}
