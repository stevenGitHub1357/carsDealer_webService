package com.example.voiture.Front.Postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.voiture.Front.Postgres.modele.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Integer> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
    Voiture findById(int id);
}
