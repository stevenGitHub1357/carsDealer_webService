package com.example.voiture.Front.Postgres.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voiture.Front.Postgres.modele.Favoris;

@Repository
public interface FavorisRepository extends JpaRepository<Favoris, Integer> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
    List<Favoris> findByIduser(int id);
    List<Favoris> findByIdvoiture(int id);
}
