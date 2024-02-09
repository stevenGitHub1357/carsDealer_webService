package com.example.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voiture.model.Marque;

@Repository
public interface MarqueRepository extends JpaRepository<Marque, Integer> {

}
