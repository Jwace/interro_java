package com.jmoulot.interro.dao;

import com.jmoulot.interro.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur,Integer> {
    Utilisateur findByNom(String nom);

    Utilisateur findByPrenom(String prenom);
}
