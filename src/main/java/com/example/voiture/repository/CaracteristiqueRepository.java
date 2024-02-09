package com.example.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voiture.model.Caracteristique;

@Repository
public interface CaracteristiqueRepository extends JpaRepository<Caracteristique, Integer> {

}
