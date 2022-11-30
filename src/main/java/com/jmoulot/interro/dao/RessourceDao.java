package com.jmoulot.interro.dao;

import com.jmoulot.interro.model.Ressource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RessourceDao extends JpaRepository<Ressource,Integer> {

}
