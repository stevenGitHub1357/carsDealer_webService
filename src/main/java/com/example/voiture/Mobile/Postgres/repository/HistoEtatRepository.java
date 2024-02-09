package com.example.voiture.Mobile.Postgres.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.voiture.Mobile.Postgres.modele.Histoetat;

public interface HistoEtatRepository extends JpaRepository<Histoetat, Integer> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
    List<Histoetat> findByIdvoiture(int id);
}
