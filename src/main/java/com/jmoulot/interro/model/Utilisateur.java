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
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nom;
    private String prenom;

    @ManyToOne // Permet de stocker la clé étrangère de Role dans la table Utilisateur
    @JsonIgnore // Quand on affiche les utilisateurs, on n'affiche pas les roles
    private Role role;

    @OneToMany(mappedBy = "utilisateur")
    private Set<Ressource> ressources = new HashSet<>();

}
