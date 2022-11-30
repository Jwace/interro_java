package com.jmoulot.interro.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.HashSet;
import java.util.Set;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Ressource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private boolean isValid;

    @ManyToOne // Permet de stocker la clé étrangère de Ressource dans la table Utilisateur
    @JsonIgnore // Quand on affiche les ressources, on n'affiche pas les utilisateurs
    private Utilisateur utilisateur;

    @ManyToMany
    private Set<Type> types = new HashSet<>();

}
