package com.example.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voiture.model.Annonce;

@Repository
public interface AnnonceRepository extends JpaRepository<Annonce, Integer> {

}
