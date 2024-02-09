package com.example.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voiture.model.CaracteristiqueVoiture;

@Repository
public interface CaracteristiqueVoitureRepository extends JpaRepository<CaracteristiqueVoiture, String> {

}
