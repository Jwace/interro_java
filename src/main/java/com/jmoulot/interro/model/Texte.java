package com.jmoulot.interro.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.w3c.dom.Text;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Texte extends Ressource {
    String titre;
    String sousTitre;
    String contenu;
    int nbCaracteres;

}
