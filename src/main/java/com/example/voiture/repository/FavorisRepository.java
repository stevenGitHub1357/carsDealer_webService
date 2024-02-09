package com.example.voiture.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voiture.model.Favoris;

@Repository
public interface FavorisRepository extends JpaRepository<Favoris, Integer> {
    List<Favoris> findByIduser(int id);

    List<Favoris> findByIdvoiture(int id);
}
