package com.jmoulot.interro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Video extends Ressource {
    String legendeVideo;
    String formatVideo;
    float duree;
    boolean sousTitres;

}
