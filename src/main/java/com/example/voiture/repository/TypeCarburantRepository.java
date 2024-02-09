package com.example.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voiture.model.TypeCarburant;

@Repository
public interface TypeCarburantRepository extends JpaRepository<TypeCarburant, Integer> {

}
