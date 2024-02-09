package com.example.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voiture.model.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Integer> {

}
